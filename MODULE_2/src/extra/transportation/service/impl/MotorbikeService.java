package extra.transportation.service.impl;

import extra.transportation.model.Motorbike;
import extra.transportation.service.IMotorbike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IMotorbike {
    private List<Motorbike> motorbikeList = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public Motorbike doMotorbike() {
        System.out.print("Owner:\n");
        String owner = scanner.nextLine();
        System.out.print("Production date:\n");
        int productionDate = Integer.parseInt(scanner.nextLine());
        System.out.print("Brand:\n");
        String brand = scanner.nextLine();
        System.out.print("Id:\n");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Power of the motorbike:");
        double power = Double.parseDouble(scanner.nextLine());
        Motorbike newMotorbike = new Motorbike(productionDate, owner, id, brand, power);
        return newMotorbike;
    }

    @Override
    public void addMotorbike() {
        Motorbike motorbike = doMotorbike();
        motorbikeList.add(motorbike);
        System.out.println("Add successfully!");

    }

    @Override
    public void showMotorbike() {
        if (motorbikeList.isEmpty()) {
            System.out.println("Has not the information!");
        } else {
            for (Motorbike show : motorbikeList) {
                System.out.println(show);
            }
        }
    }

    @Override
    public void removeMotorbike() {
        System.out.print("Input ID of transportation that you want to remove:\n");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Motorbike motorbike : motorbikeList) {

            if (motorbike.getId() == idRemove) {
                System.out.print("Are you sure that you want to remove the transportation with ID: " + idRemove + "\n" +
                        "1. YES.\n" +
                        "2. NO.\n");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    motorbikeList.remove(motorbike);
                    System.out.println("Remove successfully!");
                }
                isFlag = true;
                break;
            }

        }
        if (!isFlag) {
            System.out.println("This ID is not found!");
        }
    }

    @Override
    public void lookUpMotorbike() {
        System.out.print("Input the ID that you want to look up:");
        int display = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Motorbike motorbike : motorbikeList) {
            if (motorbike.getId() == display) {
                System.out.println(motorbike);
                isFlag = true;
                break;
            }

        }
        if (!isFlag) {
            System.out.println("This ID is not found!");
        }
    }
}
