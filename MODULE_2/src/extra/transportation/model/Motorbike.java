package extra.transportation.model;

public class Motorbike extends Transportation{
    private double power;

    public void Motobike() {
    }

    public Motorbike(int productionDate, String owner, int id, String brand, double power) {
        super(productionDate, owner, id, brand);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "power=" + power +
                '}' +
                super.toString();
    }
}
