package data;

public enum ProjectUrls {
    GOOGLE_MAIN_PAGE("https://www.google.com/");

    private final String url;

    ProjectUrls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
