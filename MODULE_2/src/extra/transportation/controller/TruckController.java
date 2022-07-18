package extra.transportation.controller;

import extra.transportation.service.ITruck;
import extra.transportation.service.impl.TruckService;

import java.util.Scanner;

public class TruckController {
    ITruck iTruck = new TruckService();

    public void truckMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("System of TRUCK management:\n" +
                    "1. Add transportation." +
                    "2. Show transportation." +
                    "3. Remove transportation." +
                    "4. Look up id." +
                    "5. Return.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTruck.addTruck();
                    break;
                case 2:
                    iTruck.showTruck();
                    break;
                case 3:
                    iTruck.removeTruck();
                    break;
                case 4:
                    iTruck.lookUpTruck();
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
