/*
This class is used to generate receipt and to decide price for a vehicle
and is an abstract class, serving 3 other classes.
Contributors -> Rudra Pratap Singh, Suman Kumari, Jayant Singh
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

abstract class Pass {
    String duration;
    Pass(String duration) {
        this.duration = duration;
    }

    Pass() {
        this.duration = null;
    }

    public abstract String type();

    public abstract String getExpiryDate();

    public void generateReceipt() {
        {
            Scanner scan = new Scanner(System.in);
            String vehicleInfo;
            String durationInfo;
            User user;
            Vehicle vehicle;
            Pass pass;
            int price = 0;
            String vehicleType;
            String duration;
            System.out.println(Constant.USER_NAME);
            String name = scan.nextLine();
            System.out.println(Constant.USER_ROLE);
            String role = scan.nextLine();
            if (role.equalsIgnoreCase("1")) {
                System.out.println(Constant.ENTER_ID);
                String id = scan.nextLine();
                System.out.println(Constant.ENTER_CONTACT);
                String contact = scan.nextLine();
                user = new Student(name, contact, id);
                System.out.println(Constant.VEHICLE_TYPE);
                vehicleType = scan.nextLine();
                vehicleType = vehicleType.toLowerCase();
                switch (vehicleType) {

                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleInfo = "Cycle";
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Bike(identity);
                        vehicleInfo = "Bike";

                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Car(identity);
                        vehicleInfo = "Car";
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                duration = scan.nextLine();
                duration = duration.toLowerCase();
                switch (duration) {
                    case "1" -> {
                        pass = new Daily();
                        durationInfo = "Daily";
                    }
                    case "2" -> {
                        pass = new Monthly();
                        durationInfo = "Monthly";
                    }
                    case "3" -> {
                        pass = new Annually();
                        durationInfo = "Annually";
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }

                }
                price = price(vehicleType, duration);
            } else if (role.equalsIgnoreCase("2")) {
                System.out.println(Constant.ENTER_ID);
                String id = scan.nextLine();
                System.out.println(Constant.ENTER_CONTACT);
                String contact = scan.nextLine();
                user = new Faculty(name, contact, id);
                System.out.println(Constant.VEHICLE_TYPE);
                vehicleType = scan.nextLine();
                vehicleType = vehicleType.toLowerCase();
                switch (vehicleType) {

                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleInfo = "Cycle";
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Bike(identity);
                        vehicleInfo = "Bike";

                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Car(identity);
                        vehicleInfo = "Car";
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                duration = scan.nextLine();
                duration = duration.toLowerCase();
                switch (duration) {
                    case "1" -> {
                        pass = new Daily();
                        durationInfo = "Daily";
                    }
                    case "2" -> {
                        pass = new Monthly();
                        durationInfo = "Monthly";
                    }
                    case "3" -> {
                        pass = new Annually();
                        durationInfo = "Annually";
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }
                }
            } else {
                System.out.println(Constant.INVALID_INPUT);
                return;
            }
            user.getInfo();
            System.out.println(user.getRole());
            System.out.println(Constant.AMOUNT + price);
            System.out.println(Constant.PASS_DURATION + durationInfo);
            System.out.println(Constant.VEHICLE + vehicleInfo);
            System.out.println(Constant.VEHICLE_ID + vehicle.id);
            System.out.println(Constant.START_DATE + LocalDate.now());
            System.out.println(Constant.CURRENT_TIME + LocalTime.now());
            System.out.println(Constant.END_DATE + pass.getExpiryDate());
        }
    }
    public static int price(String vehicleType, String duration) {
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
        return 0;
    }
}