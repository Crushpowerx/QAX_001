package pages.google.actions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.google.locators.GoogleSearchResultsLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchResultsPage extends GoogleSearchResultsLocators {

    @Step("Check for result")
    public void checkForResult(String value) {
        $(byXpath(prepareXPathSearchResult + "'" + value + "']")).shouldBe(Condition.visible);
    }

}
