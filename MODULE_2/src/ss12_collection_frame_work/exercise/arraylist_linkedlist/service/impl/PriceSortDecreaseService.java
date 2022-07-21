package ss12_collection_frame_work.exercise.arraylist_linkedlist.service.impl;

import ss12_collection_frame_work.exercise.arraylist_linkedlist.model.Product;

import java.util.Comparator;

public class PriceSortDecreaseService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
       return (int) (o2.getPrice() - o1.getPrice());
}
}
