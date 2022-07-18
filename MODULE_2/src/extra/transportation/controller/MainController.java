package extra.transportation.controller;

import ss11_stack_queue.exercise.reverse.Main;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);

    public static void transportationMenu() {
        TruckController truckController = new TruckController();
        CarController carController = new CarController();
        MotorbikeController motorbikeController = new MotorbikeController();
        do {
            System.out.println("System of transportation management:\n" +
                    "1. Truck.\n" +
                    "2. Car.\n" +
                    "3. Motorbike.\n" +
                    "4. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    truckController.truckMenu();
                    break;
                case 2:
                    carController.carMenu();
                    break;
                case 3:
                    motorbikeController.motorMenu();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Input is incorrect!\n" +
                            "Please retry!");
                    break;
            }
        } while (true);

    }
}
