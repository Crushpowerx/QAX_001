package pages.wikipedia.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {
    public SelenideElement languageEnglish = $(byXpath("//a[@class='link-box']//strong[text()='English']"));
    public String prepareLanguageXPath = "//a[@class='link-box']//strong[text()=";
}
