package tests.other_examples.excel;

import org.testng.annotations.Test;
import utils.ExcelHelper;

import java.io.IOException;

public class ExcelReadExample {
    ExcelHelper excelHelper = new ExcelHelper();
    String excelFilePath = "src/test/java/data/users/Users.xls";

    @Test
    public void readFromExcelExample() throws IOException {
        System.out.println(excelHelper.getDataFromExcel(excelFilePath));
    }

}
