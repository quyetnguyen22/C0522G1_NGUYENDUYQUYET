package ss12_collection_frame_work.exercise.arraylist_linkedlist.controller;

import ss12_collection_frame_work.exercise.arraylist_linkedlist.service.IProductService;
import ss12_collection_frame_work.exercise.arraylist_linkedlist.service.impl.ProductService;

import java.util.Scanner;

public class ProductsController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();
    public static void productsMenu() {
        do {
            System.out.println("Products management:\n" +
                    "1. Add the product\n" +
                    "2. Edit the information of product.\n" +
                    "3. Remove the product.\n" +
                    "4. Show the list of products.\n" +
                    "5. Look up the product.\n" +
                    "6. Sort of the product.\n" +
                    "7. Exit.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editInformation();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.showProducts();
                    break;
                case 5:
                    iProductService.lookUpProduct();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(1);
                default:
                    System.out.println("Your input is incorrect!\n" +
                            "Please retry!");
            }
        }while (true);

    }

}
