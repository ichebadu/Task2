import java.io.IOException;
import java.util.Scanner;


public class Customers {
    private String productName;
    private double productPrice;
    private double productQuantity;

    public Customers(String productName, double productPrice, double ProductQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = ProductQuantity;

    }
    public Customers(){
        super();
    }

    public String getName() {

        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {

        this.productPrice = productPrice;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    Products products = new Products();


    public void operation (){
        System.out.println("you have entered customers mode");
    }

    public void buy(Customers list) throws IOException {

        ProductReader accessProduct = new ProductReader();
        accessProduct.reader("src/main/resources/Products.xlsx");
        System.out.println("Enter Product Name");

        String name;
        double price= 0;
        double  quantity = 0;

        Scanner scanProductName = new Scanner(System.in);
        String inputProduct = scanProductName.nextLine();

        for (int i = 0; i < accessProduct.reader("src/main/resources/Products.xlsx").size(); i++) {
            String stockProductName = accessProduct.reader("src/main/resources/Products.xlsx").get(i).getProductName();

            if (stockProductName.equals(inputProduct)) {


                name = accessProduct.reader("src/main/resources/Products.xlsx").get(i).getProductName();
                price = accessProduct.reader("src/main/resources/Products.xlsx").get(i).getProductPrice();
                quantity = accessProduct.reader("src/main/resources/Products.xlsx").get(i).getProductQuantity();

                System.out.println( " You have bought " + quantity + " quantity " + " of " + name + " at " + price );
                return;
            }
        }
        System.out.println("OUT OF STOCK");
        return;
    }
}
