package tests.other_examples.csv;

import data.users.Users;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;

import static utils.CsvWorker.parseCsvData;
import static utils.CsvWorker.writeToCSVFile;

public class CsvExample {
    String pathToCSV = "src/test/java/data/users/Users.csv";

    @DataProvider
    public Iterator<Object[]> testUsersData() throws IOException {
        return parseCsvData(pathToCSV);
    }

    @Test(dataProvider = "testUsersData")
    public void parseCsvInDataProviderExample(String name, String email, String password) {
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
    }

    @Test
    public void writeToCsvExample() throws IOException {
        writeToCSVFile(Users.USER_1.getFirstName(), Users.USER_1.getEmail(), Users.USER_1.getPassword(), true);
    }

    @Test
    public void readScvExample() throws IOException {
        String email = "";
        String password = "";
        for (Iterator<Object[]> it = parseCsvData(pathToCSV); it.hasNext(); ) {
            Object[] row = it.next();
            if (!it.hasNext()) {
                email = (String) row[1];
                password = (String) row[2];
            }
        }
        System.out.println(email);
        System.out.println(password);
    }

}
