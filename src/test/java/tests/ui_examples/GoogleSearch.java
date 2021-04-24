package tests.ui_examples;

import com.codeborne.selenide.Selenide;
import data.GoogleSearchData;
import data.ProjectUrls;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.google.BasePageGoogle;

import static com.codeborne.selenide.Selenide.open;

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
        googleSearchResultsPage.checkForResult(GoogleSearchData.GOOGLE_SEARCH_DATA_1.getValue());
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
