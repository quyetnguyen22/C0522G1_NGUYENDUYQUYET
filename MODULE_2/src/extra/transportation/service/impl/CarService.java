package extra.transportation.service.impl;

import extra.transportation.model.Brand;
import extra.transportation.model.Car;
import extra.transportation.model.Truck;
import extra.transportation.service.ICar;
import extra.transportation.service.ITransportation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ITransportation {
    private static List<Car> carList = new ArrayList<>();
    private static List<Brand> brandList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Car doCar() {
        System.out.print("Owner:\n");
        String owner = scanner.nextLine();
        System.out.print("Production date:\n");
        int productionDate = Integer.parseInt(scanner.nextLine());
        System.out.print("Brand:\n");
        String brand = scanner.nextLine();
        System.out.print("Id:\n");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Capacity of the car:");
        int capacity = Integer.parseInt(scanner.nextLine());
        System.out.print("Model:\n");
        String model = scanner.nextLine();
        Car newCar = new Car(productionDate, owner, id, brand, model, capacity);
        return newCar;
    }

    @Override
    public void add() {
        Car car = doCar();
        carList.add(car);
        System.out.println("Add successfully!");
    }

    @Override
    public void show() {
        if (carList.isEmpty()) {
            System.out.println("There are not the information!");
        } else {
            for (Car show : carList) {
                System.out.println(show);
            }
        }
    }

    @Override
    public void remove() {
        System.out.print("Input ID of transportation that you want to remove:\n");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Car car : carList) {
            if (car.getId() == idRemove) {
                System.out.print("Are you sure that you want to remove the transportation with ID: " + idRemove + "\n" +
                        "1. YES.\n" +
                        "2. NO.\n");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    carList.remove(car);
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
    public void lookUp() {
        System.out.print("Input the ID that you want to look up:");
        int display = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Car car : carList) {
            if (car.getId() == display) {
                System.out.println(car);
                isFlag = true;
                break;
            }

        }
        if (!isFlag) {
            System.out.println("This ID is not found!");
        }
    }

}
