package utils;

import io.qameta.allure.Step;
import logger.CustomLogger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWorker {

    @Step
    public static void writeToExcelFile(String var1, String var2, String var3) throws IOException {
        String pathToExcel = "src/test/java/data/users/Users.xlsx";
        try (FileInputStream inputStream = new FileInputStream(pathToExcel)) {
            try (Workbook workbook = WorkbookFactory.create(inputStream)) {
                Sheet sheet = workbook.getSheetAt(0);
                Object[][] dataToWrite = {
                        {var1, var2, var3},
                };
                int rowCount = sheet.getLastRowNum();
                for (Object[] data : dataToWrite) {
                    Row row = sheet.createRow(++rowCount);
                    int columnCount = 0;
                    Cell cell = row.createCell(columnCount);
                    cell.setCellValue(rowCount);
                    for (Object field : data) {
                        cell = row.createCell(columnCount++);
                        if (field instanceof String) {
                            cell.setCellValue((String) field);
                        } else if (field instanceof Integer) {
                            cell.setCellValue((Integer) field);
                        }
                    }
                }
                inputStream.close();
                try (FileOutputStream outputStream = new FileOutputStream(pathToExcel)) {
                    workbook.write(outputStream);
                    workbook.close();
                }
            }
        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
        CustomLogger.logger.info("Name: " + var1 + " - Email: " + var3 + " - ok");
    }

}
