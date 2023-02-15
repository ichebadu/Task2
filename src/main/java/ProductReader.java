import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class  ProductReader {
    private String fileread;

    public List<Products> reader(String fileread) throws IOException {

            List<Products> productLists = new ArrayList<>();

            File file = new File(fileread);
            FileInputStream fileInputStream = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            int row = sheet.getLastRowNum();
            for(int i = 1; i < row; i++){
                String productName = sheet.getRow(i).getCell( 1).getStringCellValue();
                double productQuantity = sheet.getRow(i).getCell(2).getNumericCellValue();
                double productPrice = sheet.getRow(i).getCell( 3).getNumericCellValue();
                String productCategory = sheet.getRow(i).getCell(4).getStringCellValue();
                String productStock = sheet.getRow(i).getCell(5).getStringCellValue();


                Products product = new Products(productName,productQuantity,productPrice,productCategory,productStock);
                productLists.add(product);
            }
        return productLists;
    }

}
