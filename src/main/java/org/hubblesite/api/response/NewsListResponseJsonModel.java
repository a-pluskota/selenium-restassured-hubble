package org.hubblesite.api.response;

/**
 * This class provides a list news list response model that allows
 * easy reading and validation of data received from the server.
 */
public class NewsListResponseJsonModel {

    private String newsId;
    private String name;
    private String url;

    public String getNewsId() {
        return newsId;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
