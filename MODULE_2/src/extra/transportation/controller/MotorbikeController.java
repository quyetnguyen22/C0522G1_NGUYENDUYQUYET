package extra.transportation.controller;

import extra.transportation.service.IMotorbike;
import extra.transportation.service.ITransportation;
import extra.transportation.service.impl.MotorbikeService;

import java.util.Scanner;

public class MotorbikeController {
    public void motorMenu() {
        ITransportation iMotorbike = new MotorbikeService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("System of MOTORBIKE management:\n" +
                    "1. Add transportation." +
                    "2. Show transportation." +
                    "3. Remove transportation." +
                    "4. Look up id." +
                    "5. Return.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iMotorbike.add();
                    break;
                case 2:
                    iMotorbike.show();
                    break;
                case 3:
                    iMotorbike.remove();
                    break;
                case 4:
                    iMotorbike.lookUp();
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
