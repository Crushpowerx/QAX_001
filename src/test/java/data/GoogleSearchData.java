package data;

public enum GoogleSearchData {
    GOOGLE_SEARCH_DATA_1("XPath Helper"),
    GOOGLE_SEARCH_DATA_2("Selenium");

    private final String value;

    GoogleSearchData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
