import java.io.IOException;




public class  CashierService  {

    ProductReader productReader = new ProductReader();

    public void productAccess (){
        try {

            System.out.println(productReader.reader("src/main/resources/Products.xlsx"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}