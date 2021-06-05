package tests.other_examples.excel;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelHelper;

import java.io.IOException;

public class ExcelWriteExample {
    ExcelHelper excelHelper = new ExcelHelper();
    String excelFilePath = "src/test/java/data/users/Users.xls";

    @BeforeClass(alwaysRun = true)
    public void prepareExcelFileBeforeClass() throws IOException {
        String[] headers = new String[] {"email", "password", "first_name", "last_name"};
        excelHelper.prepareExcelFile(excelFilePath, headers);
    }

    @DataProvider
    public Object[][] testAccounts() {
        return new Object[][] {
                {"test1.email@gmail.com", "qwerty", "Ivan", "Petrov"},
                {"test2.email@gmail.com", "qwerty", "Ivan", "Petrov"},
                {"test3.email@gmail.com", "qwerty", "Ivan", "Petrov"},
                {"test4.email@gmail.com", "qwerty", "Ivan", "Petrov"},
                {"test5.email@gmail.com", "qwerty", "Ivan", "Petrov"}
        };
    }

    @Test(dataProvider = "testAccounts")
    public void writeToExcelExample(String email, String password, String firstName, String lastName) {
        Object[] allData = new Object[] {email, password, firstName, lastName};
        excelHelper.writeToExistingExcelFile(excelFilePath, allData);
    }

}
