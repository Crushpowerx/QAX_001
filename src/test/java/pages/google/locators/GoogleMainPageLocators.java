package pages.google.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPageLocators {
    public SelenideElement buttonSearch = $(byXpath("//div[@class='tfB0Bf']//input[@value='Поиск в Google']"));
    public SelenideElement fieldSearch = $(byXpath("//input[@title='Поиск']"));
}
