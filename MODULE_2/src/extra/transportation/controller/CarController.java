package extra.transportation.controller;

import extra.transportation.service.ICar;
import extra.transportation.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    public void carMenu() {
        ICar iCar = new CarService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("System of CAR management:\n" +
                    "1. Add transportation." +
                    "2. Show transportation." +
                    "3. Remove transportation." +
                    "4. Look up id." +
                    "5. Return.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCar.addCar();
                    break;
                case 2:
                    iCar.showCar();
                    break;
                case 3:
                    iCar.removeCar();
                    break;
                case 4:
                    iCar.lookUpCar();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Input is incorrect!\n" +
                            "Please retry!");
                    return;
            }
        } while (true);
    }
}
