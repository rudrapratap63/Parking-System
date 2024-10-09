import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

abstract class Pass {
    public abstract String type();
    public abstract String getExpiryDate();
    public void generateReceipt(){
        {
            Scanner input = new Scanner(System.in);
            String vehicleInfo;
            String durationInfo;
            User user;
            Vehicle vehicle;
            Pass pass;
            int price = 0;
            String vehicleType;
            String duration;
            System.out.println(Constant.USER_NAME);
            String name = input.nextLine();
            System.out.println(Constant.USER_ROLE);
            String role = input.nextLine();
            if (role.equalsIgnoreCase("1")) {
                System.out.println(Constant.ENTER_ID);
                String id = input.nextLine();
                System.out.println(Constant.ENTER_CONTACT);
                String contact = input.nextLine();
                user = new Student(name, contact, id);
                System.out.println(Constant.VEHICLE_TYPE);
                vehicleType = input.nextLine();
                vehicleType = vehicleType.toLowerCase();
                switch (vehicleType) {
                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleInfo = "Cycle";
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Bike(identity);
                        vehicleInfo = "Bike";
                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Car(identity);
                        vehicleInfo = "Car";
                    }
                    default -> {
                        System.out.println(Constant.INVALID);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                duration = input.nextLine();
                duration = duration.toLowerCase();
                switch (duration){
                case "1" -> {
                    pass = new Daily();
                    durationInfo = "Daily";
                }
                case "2" -> {
                    pass = new Monthly();
                    durationInfo = "Monthly";
                }
                case "3" ->{
                    pass = new Annually();
                    durationInfo = "Annually";
                }
                default -> {
                        System.out.println(Constant.INVALID);
                        return;
                }

            }
                price = price(vehicleType, duration);
            }
            else if (role.equalsIgnoreCase("2")) {
                System.out.println(Constant.ENTER_ID);
                String id = input.nextLine();
                System.out.println(Constant.ENTER_CONTACT);
                String contact = input.nextLine();
                user = new Faculty(name, contact, id);
                System.out.println(Constant.VEHICLE_TYPE);
                vehicleType = input.nextLine();
                vehicleType = vehicleType.toLowerCase();
                switch (vehicleType) {
                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleInfo = "Cycle";
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Bike(identity);
                        vehicleInfo = "Bike";

                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = input.nextLine();
                        vehicle = new Car(identity);
                        vehicleInfo = "Car";
                    }
                    default -> {
                        System.out.println(Constant.INVALID);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                duration = input.nextLine();
                duration = duration.toLowerCase();
                switch (duration) {
                    case "1" ->{
                        pass = new Daily();
                        durationInfo = "Daily";
                    }
                    case "2" ->{
                        pass = new Monthly();
                        durationInfo = "Monthly";
                    }
                    case "3" ->{
                        pass = new Annually();
                        durationInfo = "Annually";
                    }
                    default -> {
                        System.out.println(Constant.INVALID);
                        return ;
                    }
                }
            }
            else {
                System.out.println(Constant.INVALID);
                return;
            }
            String currentTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString();
            System.out.println("======================================");
            System.out.println("              Receipt                 ");
            System.out.println("======================================");
            user.getInfo();
            System.out.println("Role: " + user.getRole());
            System.out.println("Amount to be Paid is: " + price);
            System.out.println(Constant.PASS_DURATION + durationInfo);
            System.out.println(Constant.VEHICLE + vehicleInfo);
            System.out.println(Constant.VEHICLE_ID + vehicle.id);
            System.out.println(Constant.START_DATE + LocalDate.now());
            System.out.println(Constant.CURRENT_TIME + currentTime );
            System.out.println(Constant.END_DATE + pass.getExpiryDate());
            System.out.println("======================================");

        }
    }
    public static int price(String vehicleType, String duration){
        switch (vehicleType) {
            case "1" -> {
                switch (duration) {
                    case "1" -> {
                        return 5;
                    }
                    case "2" -> {
                        return 50;
                    }
                    case "3" -> {
                        return 500;
                    }
                }
            }
            case "2" -> {
                switch (duration) {
                    case "1" -> {
                        return 20;
                    }
                    case "2" -> {
                        return 200;
                    }
                    case "3" -> {
                        return 2000;
                    }
                }
            }
            case "3" -> {
                switch (duration) {
                    case "1" -> {
                        return 50;
                    }
                    case "2" -> {
                        return 500;
                    }
                    case "3" -> {
                        return 5000;
                    }
                }
            }
        }
        return 0 ;
    }
}