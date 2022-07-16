package extra.transportation.service.impl;

import extra.transportation.model.Transportation;
import extra.transportation.model.Truck;
import extra.transportation.service.ITruck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruck {
    private static List<Truck> truckList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Truck doTruck() {
        System.out.print("Owner:\n");
        String owner = scanner.nextLine();
        System.out.print("Production date:\n");
        int productionDate = Integer.parseInt(scanner.nextLine());
        System.out.print("Brand:\n");
        String brand = scanner.nextLine();
        System.out.print("Id:\n");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Load of the truck:");
        double load = Double.parseDouble(scanner.nextLine());
        Truck newTruck = new Truck(productionDate, owner, id, brand, load);
        return newTruck;
    }

    @Override
    public void addTruck() {
        Truck truck = doTruck();
        truckList.add(truck);
        System.out.println("Add successfully!");
    }

    public void showTruck() {
        if (truckList.isEmpty()) {
            System.out.println("Has not the information!");
        } else {
            for (Truck truck : truckList) {
                System.out.println(truck);
            }
        }
    }

    public void removeTruck() {
        System.out.print("Input ID of transportation that you want to remove:\n");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Truck truck : truckList) {

            if (truck.getId() == idRemove) {
                System.out.print("Are you sure that you want to remove the transportation with ID: " + idRemove + "\n" +
                        "1. YES.\n" +
                        "2. NO.\n");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    truckList.remove(truck);
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

    public void lookUpTruck() {
        System.out.print("Input the ID that you want to look up:");
        int display = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Truck truck : truckList) {
            if (truck.getId() == display) {
                System.out.println(truck);
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("This ID is not found!");
        }

    }
}
