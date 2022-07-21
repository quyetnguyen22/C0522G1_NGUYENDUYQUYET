package ss12_collection_frame_work.exercise.arraylist_linkedlist.service.impl;

import ss12_collection_frame_work.exercise.arraylist_linkedlist.model.Product;

import java.util.Comparator;

public class PriceSortIncreaseService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
       return (int) (o1.getPrice() - o2.getPrice());
}
}
