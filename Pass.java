/*
This class is used to generate receipt and to decide price for a vehicle
and is an abstract class, serving 3 other classes.
Contributors -> Rudra Pratap Singh, Suman Kumari
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

abstract class Pass {
    String duration;

    /**
     * Constructs a Pass with the specified duration.
     *
     * @param duration the duration of the pass
     */
    Pass(String duration) {
        this.duration = duration;
    }

    /**
     * Abstract method to be implemented by subclasses to get the expiry date of the pass.
     *
     * @return a String representing the expiry date of the pass
     */
    public abstract String getExpiryDate();

    /**
     * Generates a receipt for the pass.
     */
    public void generateReceipt() {
        {
            Scanner scan = new Scanner(System.in);
            String vehicleType;
            String durationType;
            User user;
            Vehicle vehicle;
            Pass pass;
            int price = 0;
            String vehicleOption;
            String durationOption;
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
                vehicleOption = scan.nextLine();
                vehicleOption = vehicleOption.toLowerCase();
                switch (vehicleOption) {

                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleType = Constant.CYCLE;
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Bike(identity);
                        vehicleType = Constant.BIKE;

                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Car(identity);
                        vehicleType = Constant.CAR;
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                durationOption = scan.nextLine();
                durationOption = durationOption.toLowerCase();
                switch (durationOption) {
                    case "1" -> {
                        pass = new Daily();
                        durationType = Constant.DAILY;
                    }
                    case "2" -> {
                        pass = new Monthly();
                        durationType = Constant.MONTHLY;
                    }
                    case "3" -> {
                        pass = new Annually();
                        durationType = Constant.MONTHLY;
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }

                }
                price = price(vehicleOption, durationOption);
            } else if (role.equalsIgnoreCase("2")) {
                System.out.println(Constant.ENTER_ID);
                String id = scan.nextLine();
                System.out.println(Constant.ENTER_CONTACT);
                String contact = scan.nextLine();
                user = new Faculty(name, contact, id);
                System.out.println(Constant.VEHICLE_TYPE);
                vehicleOption = scan.nextLine();
                vehicleOption = vehicleOption.toLowerCase();
                switch (vehicleOption) {
                    case "1" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Cycle(identity);
                        vehicleType = Constant.CYCLE;
                    }
                    case "2" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Bike(identity);
                        vehicleType = Constant.BIKE;

                    }
                    case "3" -> {
                        System.out.println(Constant.INPUT_VEHICLE_ID);
                        String identity = scan.nextLine();
                        vehicle = new Car(identity);
                        vehicleType = Constant.CAR;
                    }
                    default -> {
                        System.out.println(Constant.INVALID_INPUT);
                        return;
                    }
                }
                System.out.println(Constant.DURATION);
                durationOption = scan.nextLine();
                durationOption = durationOption.toLowerCase();
                switch (durationOption) {
                    case "1" -> {
                        pass = new Daily();
                        durationType = Constant.DAILY;
                    }
                    case "2" -> {
                        pass = new Monthly();
                        durationType = Constant.MONTHLY;
                    }
                    case "3" -> {
                        pass = new Annually();
                        durationType = Constant.ANNUALLY;
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
            System.out.print(Constant.RECEIPT);
            user.getInfo();
            System.out.println(Constant.USER_PROFESSION + user.getRole());
            System.out.println(Constant.VEHICLE + vehicleType);
            System.out.println(Constant.VEHICLE_ID + vehicle.id);
            System.out.println(Constant.AMOUNT + price);
            System.out.println(Constant.PASS_DURATION + durationType);
            System.out.println(Constant.START_DATE + LocalDate.now());
            System.out.println(Constant.CURRENT_TIME + LocalTime.now().toString().substring(0,8));
            System.out.println(Constant.END_DATE + pass.getExpiryDate());
            System.out.print(Constant.THANK_YOU);
        }
    }

    /**
     * Calculates and returns the price for the specified vehicle type and duration.
     *
     * @param vehicleType the type of vehicle as a String
     * @param duration the duration type as a String
     * @return an int representing the price for the pass
     */
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

