package extra.transportation.controller;

import extra.transportation.service.ITransportation;
import extra.transportation.service.ITruck;
import extra.transportation.service.impl.TruckService;

import java.util.Scanner;

public class TruckController {
    ITransportation iTruck = new TruckService();

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
                    iTruck.add();
                    break;
                case 2:
                    iTruck.show();
                    break;
                case 3:
                    iTruck.remove();
                    break;
                case 4:
                    iTruck.lookUp();
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
