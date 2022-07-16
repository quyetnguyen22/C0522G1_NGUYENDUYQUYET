package extra.transportation.model;

public class Car extends Transportation {
    private String model;
    private int capacity;

    public void Car() {

    }

    public Car(int productionDate, String owner, int id, String brand, String model, int capacity) {
        super(productionDate, owner, id, brand);
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                '}' +
                super.toString();
    }
}
