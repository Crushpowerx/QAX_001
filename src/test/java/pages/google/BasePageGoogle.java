package pages.google;

import pages.google.actions.GoogleMainPage;
import pages.google.actions.GoogleSearchResultsPage;
import runner.Debug;

public class BasePageGoogle extends Debug {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
}
