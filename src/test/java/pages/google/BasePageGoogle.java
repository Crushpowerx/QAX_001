package pages.google;

import pages.google.actions.GoogleMainPage;
import pages.google.actions.GoogleSearchResultsPage;
import runner.SelenoidRunner;

public class BasePageGoogle extends SelenoidRunner {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
}
