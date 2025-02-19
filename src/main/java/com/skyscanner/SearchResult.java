package com.skyscanner;

public class SearchResult {
    private String city;
    private String Kind;
    private String title;

    public String getCity() {
        return city;
    }

    public String getKind() {
        return Kind;
    }

    public String getTitle() {
        return title;
    }

    public SearchResult(String city, String kind, String title) {
        this.city = city;
        Kind = kind;
        this.title = title;
    }
}
