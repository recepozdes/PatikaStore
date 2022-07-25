public class Product {

    private int id;
    private double perPrice;
    private double discount;
    private int amountOfStock;
    private String productName;
    private Brand brand;

    public Product(int id, double perPrice, double discount, int amountOfStock, String productName, Brand brand) {
        this.id = id;
        this.perPrice = perPrice;
        this.discount = discount;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(double perPrice) {
        this.perPrice = perPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
