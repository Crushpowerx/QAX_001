package tests.ui_examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.wikipedia.BasePageWikipedia;

import static com.codeborne.selenide.Selenide.open;
import static steps.CommonSteps.checkUrl;

public class Wikipedia extends BasePageWikipedia {

    @DataProvider
    public Object[][] languageCodes() {
        return new Object[][]{
                {"EN"}, {"JA"}, {"RU"}, {"IT"}, {"PT"}, {"ES"}, {"DE"}, {"ZH"}, {"FR"}, {"PL"}
        };
    }

    @Test(dataProvider = "languageCodes")
    public void checkLanguages(String languageCode) {
        open("https://www.wikipedia.org/");
        mainPage.pressButtonWithLanguage(languageCode);
        checkUrl("https://" + languageCode.toLowerCase() + ".wikipedia.org/wiki/", 5);
    }

}
