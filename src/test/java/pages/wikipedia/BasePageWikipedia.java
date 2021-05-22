package pages.wikipedia;

import pages.wikipedia.actions.MainPage;
import runner.SelenoidRunner;

public class BasePageWikipedia extends SelenoidRunner {
    public MainPage mainPage = new MainPage();
}
