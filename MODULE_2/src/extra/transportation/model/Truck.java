package extra.transportation.model;

public class Truck extends Transportation {
    private double load;

    public void Truck() {
    }

    public Truck(int productionDate, String owner, int id, String brand, double load) {
        super(productionDate, owner, id, brand);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                '}' +
                super.toString();
    }
}
