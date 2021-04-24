package data;

public enum ProjectUrls {
    GOOGLE_MAIN_PAGE("https://www.google.com/"),
    WIKIPEDIA_MAIN_PAGE("");

    private final String url;

    ProjectUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
