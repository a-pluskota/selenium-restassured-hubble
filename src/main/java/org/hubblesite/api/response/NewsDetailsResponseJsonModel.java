package org.hubblesite.api.response;

import java.util.List;

/**
 * This class provides a list news details response model that allows
 * easy reading and validation of data received from the server.
 */
public class NewsDetailsResponseJsonModel {

    private String name;
    private String news_id;
    private String url;
    private String publication;
    private String mission;
    private String _abstract;
    private String credits;
    private String thumbnail;
    private String thumbnailRetina;
    private String thumbnail1x;
    private String thumbnail2x;
    private String keystoneImage1x;
    private String keystoneImage2x;
    private List<Integer> releaseImages = null;

    public String getName() {
        return name;
    }

    public String getNewsId() {
        return news_id;
    }

    public String getUrl() {
        return url;
    }

    public String getPublication() {
        return publication;
    }

    public String getMission() {
        return mission;
    }

    public String get_abstract() {
        return _abstract;
    }

    public String getCredits() {
        return credits;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getThumbnailRetina() {
        return thumbnailRetina;
    }

    public String getThumbnail1x() {
        return thumbnail1x;
    }

    public String getThumbnail2x() {
        return thumbnail2x;
    }

    public String getKeystoneImage1x() {
        return keystoneImage1x;
    }

    public String getKeystoneImage2x() {
        return keystoneImage2x;
    }

    public List<Integer> getReleaseImages() {
        return releaseImages;
    }
}
