package tests.ui_examples;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExamples {

    @Test
    public void test1() {
        openPage("https://www.google.com/");
        fillTheFieldSearch("XPath Helper");
        clickButtonSearch();
        checkForResult("XPath Helper");
    }

    @Step
    public void openPage(String url) {
        open(url);
    }

    @Step
    public void fillTheFieldSearch(String value) {
        $(byXpath("//input[@title='Поиск']")).sendKeys(value);
    }

    @Step
    public void clickButtonSearch() {
        $(byXpath("//div[@class='tfB0Bf']//input[@value='Поиск в Google']")).click();
    }

    @Step
    public void checkForResult(String value) {
        $(byXpath("//h3[text()='" + value + "']")).shouldBe(Condition.visible);
    }

}
