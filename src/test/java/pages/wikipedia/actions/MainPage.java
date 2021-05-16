package pages.wikipedia.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import org.testng.Assert;
import pages.wikipedia.locators.MainPageLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends MainPageLocators {

    @Step
    public void pressButtonWithLanguageEnglish() {
        languageEnglish.click();
        CustomLogger.logger.info("ok");
    }

    @Step
    public void pressButtonWithLanguage(String countryCode) {
        $(byXpath(prepareLanguageXPath + "'" + transformCountryCodeToLanguage(countryCode) + "']")).click();
        CustomLogger.logger.info(countryCode + " - ok");
    }

    @Step
    public String transformCountryCodeToLanguage(String countryCode) {
        switch (countryCode) {
            case "EN":
                return "English";
            case "JA":
                return "日本語";
            case "RU":
                return "Русский";
            case "IT":
                return "Italiano";
            case "PT":
                return "Português";
            case "ES":
                return "Español";
            case "DE":
                return "Deutsch";
            case "ZH":
                return "中文";
            case "FR":
                return "Français";
            case "PL":
                return "Polski";
            default:
                Assert.fail("Country code " + countryCode + " not found!");
        }
        return null;
    }

}
