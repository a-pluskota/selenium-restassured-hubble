package org.hubblesite;

import com.jayway.restassured.response.ValidatableResponse;
import org.hubblesite.api.request.RequestBuilder;
import org.hubblesite.api.response.NewsListResponseJsonModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewsListResponseTests {

    protected ValidatableResponse validatableResponseFromNewsList;

    public NewsListResponseTests(){

        this.validatableResponseFromNewsList = new RequestBuilder()
                .sendRequest()
                .then()
                .assertThat();
    }

    @BeforeEach
    public void before() {

        validatableResponseFromNewsList
                .log()
                .all(true);
    }

    private NewsListResponseJsonModel[] extractNewsListResponseJsonModel(){

        return validatableResponseFromNewsList
                .extract()
                .as(NewsListResponseJsonModel[].class);
    }

    @Test
    public void testNewsListResponseHttpStatusCode(){

        validatableResponseFromNewsList
                .statusCode(200);
    }

    @Test
    public void testNewsListResponseJsonModel(){

        extractNewsListResponseJsonModel();

    }



}
