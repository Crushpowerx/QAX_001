package pages.google.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.google.locators.GoogleMainPageLocators;

public class GoogleMainPage extends GoogleMainPageLocators {

    @Step("Fill the field search")
    public void fillFieldSearch(String value) {
        fieldSearch.sendKeys(value);
        CustomLogger.logger.info(value + " - ok");
    }

    @Step("Click the button search")
    public void clickButtonSearch() {
        buttonSearch.click();
        CustomLogger.logger.info("ok");
    }

}
