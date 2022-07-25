public class Notebook extends Product{
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int id, double perPrice, double discount, int amountOfStock, String productName, Brand brand, int ram, int stroage, double screenSize) {
        super(id, perPrice, discount, amountOfStock, productName, brand);
        this.ram = ram;
        this.storage = stroage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
