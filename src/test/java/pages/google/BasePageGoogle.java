package pages.google;

import pages.google.actions.GoogleMainPage;
import pages.google.actions.GoogleSearchResultsPage;
import runner.DebugRunner;

public class BasePageGoogle extends DebugRunner {
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    public GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();
}
