package ss12_collection_frame_work.arraylist_linkedlist.service.impl;

import ss12_collection_frame_work.arraylist_linkedlist.model.Product;
import ss12_collection_frame_work.arraylist_linkedlist.service.IProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private List<Product> productList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Product productsInfor() {
        System.out.println("Input the name of product:");
        String name = scanner.nextLine();
        System.out.println("Input the number of product:");
        int numberOf = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the price of product:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the id of product.");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, numberOf, price, id);
        return product;
    }

    @Override
    public void addProduct() {
        Product product = productsInfor();
        productList.add(product);
        System.out.println("Add successfully!");
    }

    @Override
    public void editInformation() {
        System.out.println("Input the id of product that you want to edit:");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isId = true;
        for (Product product : productList) {
            if (product.getId() == idEdit) {
                System.out.println("Input the name of product:");
                String name = scanner.nextLine();
                System.out.println("Input the number of product:");
                int numberOf = Integer.parseInt(scanner.nextLine());
                System.out.println("Input the price of product:");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Input the id of product.");
                product.setName(name);
                product.setNumberOf(numberOf);
                product.setPrice(price);
                isId = false;
            }
        }
        if (!isId) {
            System.out.println("Edit successfully!");
        } else {
            System.out.println("Not found this id!");
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Input the id of product that you want to edit:");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isId = true;
        for (Product product : productList) {
            if (product.getId() == idRemove) {
                System.out.println("Are you sure that you wan to remove the product with ID:" + idRemove +
                        "1. YES\n" +
                        "2. NO.");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    productList.remove(idRemove);
                    isId = false;
                }
            }

        }
        if (!isId) {
            System.out.printf("Remove successfully ID %d!", idRemove);
        } else {
            System.out.println("Not found this id!");
        }
    }

    @Override
    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("There are not information!");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void lookUpProduct() {
        System.out.println("Input the id of product that you want to show:");
        int idShow = Integer.parseInt(scanner.nextLine());
        boolean isId = true;
        for (Product product : productList) {
            if (product.getId() == idShow) {
                isId = false;
            }
        }
        if (!isId) {
            System.out.println("Edit successfully!");
        } else {
            System.out.println("Not found this id!");
        }
    }

    @Override
    public void sort() {
        do {
            if (productList.isEmpty()) {
                System.out.println("There are NOT the information!");
                break;
            }
            System.out.println("1. Decrease by price.\n" +
                    "2. Increase by price.\n" +
                    "3. Return.");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                PriceSortDecreaseService priceSortDecreaseService = new PriceSortDecreaseService();
                productList.sort(priceSortDecreaseService);
            } else if (choice == 2){
                PriceSortIncreaseService priceSortIncreaseService = new PriceSortIncreaseService();
                productList.sort(priceSortIncreaseService);
            } else if (choice == 3){
                return;
            } else {
                System.out.println("Input is incorrect!\n" +
                        "Please retry!");
                continue;
            }

            for (Product products : productList) {
                System.out.println(products.toString());
            }
        } while (true);

    }

}
