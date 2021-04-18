package tests.ui_examples;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExamples {

    @Test
    public void test1() {
        open("https://www.google.com/");
        $(byXpath("//input[@title='Поиск']")).sendKeys("xpath helper");
        $(byXpath("//div[@class='tfB0Bf']//input[@value='Поиск в Google']")).click();
        $(byXpath("//h3[text()='XPath Helper']")).shouldBe(Condition.visible);
    }

}
