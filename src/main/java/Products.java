
public class  Products {
    private String productName;
    private  double productQuantity;
    private double productPrice;
    private String productCategory;
    private String productStock;

    public Products() {
        super();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Products (String productName, double productQuantity, double productPrice,String productCategory, String productStock){
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStock = productStock;
    }



    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", productStock='" + productStock + '\'' +
                '}';
    }
}
