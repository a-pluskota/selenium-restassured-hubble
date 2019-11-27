package org.hubblesite;

import com.jayway.restassured.response.ValidatableResponse;
import org.hubblesite.api.request.RequestBuilder;
import org.hubblesite.api.response.NewsDetailsResponseJsonModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewsDetailsResponseTests {

    protected ValidatableResponse validatableResponseFromNewsDetails;

    public NewsDetailsResponseTests(
            String newsDetailsId
    ) {

        this.validatableResponseFromNewsDetails = new RequestBuilder(newsDetailsId)
                .sendRequest()
                .then()
                .assertThat();
    }

    @BeforeEach
    public void before() {

        validatableResponseFromNewsDetails
                .log()
                .all(true);
    }

    protected NewsDetailsResponseJsonModel extractNewsDetailsResponseJsonModel() {

        return validatableResponseFromNewsDetails
                .extract()
                .as(NewsDetailsResponseJsonModel.class);
    }

    @Test
    public void testNewsDetailsResponseHttpStatusCode(){

        validatableResponseFromNewsDetails
                .statusCode(200);
    }

    @Test
    public void testNewsDetailsResponseJsonModel(){

        extractNewsDetailsResponseJsonModel();

    }

}
