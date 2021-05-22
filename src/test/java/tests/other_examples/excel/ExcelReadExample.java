package tests.other_examples.excel;

import org.testng.annotations.Test;
import utils.ExcelWorker;

import java.io.IOException;

public class ExcelReadExample {
    ExcelWorker excelWorker = new ExcelWorker();
    String excelFilePath = "src/test/java/data/users/Users.xls";

    @Test
    public void readFromExcelExample() throws IOException {
        System.out.println(excelWorker.getDataFromExcel(excelFilePath));
    }

}
