import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Store {
    private String name;
    private static ArrayList<Brand> brands = new ArrayList<>();
    private ArrayList<Product> products;
    private Scanner sc = new Scanner(System.in);

    public Store(String name) {
        this.name = name;
    }

    static {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "Hp"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

    }

    public void menu() {
        boolean secim = true;
        System.out.println("Ürün Yönetim Paneline Hoşgeldiniz");
        System.out.println(" 1 - Notebook İşlemleri\n" +
                " 2 - Cep Telefonu İşlemleri\n" +
                " 3 - Marka Listesi\n" +
                " 4 - Ürün Ekle\n" +
                " 5 - Çıkış Yap\n"
        );
        System.out.print("Seçiminiz : ");
        int selection = sc.nextInt();
        while(secim){
            if(selection>=1&&selection<=5){
                secim = false;
                break;
            }else{
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız");
                System.out.print("Seçiminiz : ");
                selection = sc.nextInt();
            }
        }
        switch (selection) {
            case 1:
                notebookList();

                break;
            case 2:
                cellphoneList();

                break;
            case 3:
                brands.sort(Brand::compareTo);
                brands.forEach(brand -> System.out.println(brand.getId() + " - " + brand.getBrandName()));

                break;
            case 4:

                break;
            case 5:
                System.out.println("Programdan çıkılıyor...");
                break;
            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız");
                menu();
                break;
        }
    }

    public void brandList() {

        System.out.println("Marka Listesi");

        for (Brand brand : brands) {
            System.out.println(brand.getId() + " --->" + brand.getBrandName());
        }
    }


    public void notebookList() {
        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof Notebook) {
                Notebook n = (Notebook) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s", n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s", n.getProductName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getPerPrice());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getBrand().getBrandName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getStorage());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getScreenSize());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s", n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void cellphoneList() {
        System.out.println("Cep Telefonu Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof MobilePhone) {
                MobilePhone n = (MobilePhone) products.get(i);
                String temp = "|";
                temp += " " + String.format("%-" + 3 + "s", n.getId());
                temp += "|";
                temp += " " + String.format("%-" + 30 + "s", n.getProductName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getPerPrice());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getBrand().getBrandName());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getStorage());
                temp += "|";
                temp += " " + String.format("%-" + 10 + "s", n.getScreenSize());
                temp += "|";
                temp += " " + String.format("%-" + 12 + "s", n.getRam());
                temp += "|";
                System.out.println(temp);
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void productList() {
        notebookList();
        System.out.println();
        cellphoneList();
    }

    public void addProduct(){



    }

    public void deleteProduct(){

    }

    public void filterProductByID(){

    }

    public void filterProductByBrand(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Brand> getBrands() {
        return brands;
    }

    public static void setBrands(ArrayList<Brand> brands) {
        Store.brands = brands;
    }
}
