package extra.transportation.model;

public class Transportation {
    private int productionDate;
    private String owner;
    private int id;
    private String brand;

    public void Tranportation() {

    }

    public Transportation(int productionDate, String owner, int id, String brand) {
        this.productionDate = productionDate;
        this.owner = owner;
        this.id = id;
        this.brand = brand;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "productionDate=" + productionDate +
                ", owner='" + owner + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
