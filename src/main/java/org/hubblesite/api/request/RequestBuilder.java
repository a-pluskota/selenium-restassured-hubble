package org.hubblesite.api.request;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static com.jayway.restassured.RestAssured.given;

/**
 * This class provides methods for building and sending requests to hubblesite API.
 */
public class RequestBuilder {

    private String requestUrl;
    private static final String HUBBLESITE_URL = "http://hubblesite.org";
    private static final String HUBBLESITE_NEWS_ROUTE = "/api/v3/news";
    private static final String HUBBLESITE_DETAILS_OF_A_NEWS_ROUTE = "/api/v3/news_release/";

    /**
     * The default constructor performs operations on the news list.
     */
    public RequestBuilder() {

        this.requestUrl = HUBBLESITE_URL
                .concat(HUBBLESITE_NEWS_ROUTE);
    }

    /**
     * When a news id is specified when creating the object,
     * requests will be built for that news.
     *
     * @param newsDetailsId
     */
    public RequestBuilder(
            String newsDetailsId
    ) {

        this.requestUrl = HUBBLESITE_URL
                .concat(HUBBLESITE_DETAILS_OF_A_NEWS_ROUTE)
                .concat(newsDetailsId);
    }

    private RequestSpecification bulidRequestSpecification() {

        return given()
                .contentType("application/json")
                .log()
                .all(true);
    }

    /**
     * Uses RESTassured to send request to hubblesite API.
     *
     * @return Response with the data from hubblesite API
     */
    public Response sendRequest( ) {

        return bulidRequestSpecification()
                .when()
                .get(requestUrl);
    }
}
