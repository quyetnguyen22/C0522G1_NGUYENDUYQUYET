package extra.transportation.controller;

import extra.transportation.service.ICar;
import extra.transportation.service.ITransportation;
import extra.transportation.service.impl.CarService;

import java.util.Scanner;

public class CarController {
    public void carMenu() {
        ITransportation iCar = new CarService();
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
                    iCar.add();
                    break;
                case 2:
                    iCar.show();
                    break;
                case 3:
                    iCar.remove();
                    break;
                case 4:
                    iCar.lookUp();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Input is incorrect!\n" +
                            "Please retry!");
                    break;
            }
        } while (true);
    }
}
