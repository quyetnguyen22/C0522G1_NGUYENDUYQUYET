package extra.transportation.model;

public class Brand{
    private String productionName;
    private String productionCode;
    private String nationalMadeIn;
    public void Brand() {

    }

    public Brand( String productionName, String productionCode, String nationalMadeIn) {
        this.productionName = productionName;
        this.productionCode = productionCode;
        this.nationalMadeIn = nationalMadeIn;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getNationalMadeIn() {
        return nationalMadeIn;
    }

    public void setNationalMadeIn(String nationalMadeIn) {
        this.nationalMadeIn = nationalMadeIn;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "productionName='" + productionName + '\'' +
                ", productionCode='" + productionCode + '\'' +
                ", nationalMadeIn='" + nationalMadeIn + '\'' +
                '}';
    }
}
