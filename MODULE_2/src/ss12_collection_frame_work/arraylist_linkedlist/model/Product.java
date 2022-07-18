package ss12_collection_frame_work.arraylist_linkedlist.model;

public class Product {
    private String name;
    private int numberOf;
    private double price;
    private int id;

    public Product() {
    }

    public Product(String name, int numberOf, double price, int id) {
        this.name = name;
        this.numberOf = numberOf;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", numberOf=" + numberOf +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

}
