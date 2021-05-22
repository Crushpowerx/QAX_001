package tests.ui_examples;

import com.sun.jna.Platform;
import data.google.ProjectUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.sleep;

public class SeleniumExample {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        if (Platform.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        } else if (Platform.isMac()) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver_mac");
        } else if (Platform.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        }
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get(ProjectUrls.GOOGLE_MAIN_PAGE.getUrl());
        String buttonSearchXPath = "//div[@class='FPdoLc tfB0Bf']//input[@value='Поиск в Google']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(buttonSearchXPath)));
        driver.findElement(By.xpath(buttonSearchXPath)).click();
        sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
