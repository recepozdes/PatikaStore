public class Brand implements Comparable<Brand> {
    private int id;
    private String brandName;


    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getBrandName().compareTo(o.getBrandName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }





}
