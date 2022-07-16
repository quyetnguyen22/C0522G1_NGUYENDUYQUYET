package extra.transportation.controller;

import extra.transportation.service.IMotorbike;
import extra.transportation.service.impl.MotorbikeService;

import java.util.Scanner;

public class MotorbikeController {
    public void motorMenu() {
        IMotorbike iMotorbike = new MotorbikeService();
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
                    iMotorbike.addMotorbike();
                    break;
                case 2:
                    iMotorbike.showMotorbike();
                    break;
                case 3:
                    iMotorbike.removeMotorbike();
                    break;
                case 4:
                    iMotorbike.lookUpMotorbike();
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
