package tests.ui_examples;

import com.codeborne.selenide.Selenide;
import data.GoogleSearchData;
import data.ProjectUrls;
import org.testng.annotations.*;
import pages.google.BasePageGoogle;

import static com.codeborne.selenide.Selenide.open;
import static steps.CommonSteps.checkUrl;

public class GoogleSearch extends BasePageGoogle {

    @Parameters({"country", "word"})
    @BeforeMethod
    public void openGoogleMainPage(String country, String word) {
        open(ProjectUrls.GOOGLE_MAIN_PAGE.getUrl());
        System.out.println("Enable VPN for country " + country);
        System.out.println(word);
    }

    @Test
    public void checkGoogleSearch1() {
        googleMainPage.fillFieldSearch(GoogleSearchData.GOOGLE_SEARCH_DATA_1.getValue());
        googleMainPage.clickButtonSearch();
        googleSearchResultsPage.checkForResult(GoogleSearchData.GOOGLE_SEARCH_DATA_2.getValue());
        checkUrl("https://5element.ua/", 10);
    }

    @Test
    public void checkGoogleSearch2() {
        googleMainPage.fillFieldSearch(GoogleSearchData.GOOGLE_SEARCH_DATA_2.getValue());
        googleMainPage.clickButtonSearch();
        googleSearchResultsPage.checkForResult(GoogleSearchData.GOOGLE_SEARCH_DATA_2.getValue());
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }

}
