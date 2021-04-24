package tests.ui_examples;

import data.GoogleSearchData;
import data.ProjectUrls;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.google.BasePageGoogle;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSearch extends BasePageGoogle {

    @BeforeMethod
    public void openGoogleMainPage() {
        open(ProjectUrls.GOOGLE_MAIN_PAGE.getUrl());
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

}
