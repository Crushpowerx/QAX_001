package tests.ui_examples;

import data.GoogleSearchData;
import data.ProjectUrls;
import org.testng.annotations.Test;
import pages.google.BasePageGoogle;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSearch extends BasePageGoogle {

    @Test
    public void checkGoogleSearch() {
        open(ProjectUrls.GOOGLE_MAIN_PAGE.getUrl());
        googleMainPage.fillFieldSearch(GoogleSearchData.GOOGLE_SEARCH_DATA_1.getValue());
        googleMainPage.clickButtonSearch();
        googleSearchResultsPage.checkForResult(GoogleSearchData.GOOGLE_SEARCH_DATA_1.getValue());
    }

}
