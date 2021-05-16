package tests.excel;

import data.users.Users;
import org.testng.annotations.Test;

import java.io.IOException;

import static utils.ExcelWorker.writeToExcelFile;

public class ExcelExample {

    @Test
    public void writeToExcelExample() throws IOException {
        writeToExcelFile(Users.USER_1.getFirstName(), Users.USER_1.getEmail(), Users.USER_1.getPassword());
    }

}
