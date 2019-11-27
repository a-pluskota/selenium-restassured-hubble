package org.hubblesite;

import org.hubblesite.api.response.NewsDetailsResponseJsonModel;
import org.hubblesite.ui.AbstractPage;
import org.hubblesite.ui.HubblesitePage;
import org.hubblesite.ui.WebDriverConfig;
import org.hubblesite.ui.WebbtelescopePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewsDetailsPageTests {

    private WebDriver driver;
    private String name;
    private String newsId;
    private String url;
    private String mission;

    private NewsDetailsResponseJsonModel newsDetailsResponseJsonModel;
    private AbstractPage testPage;

    public NewsDetailsPageTests(
            String newsDetailsId
    ) {

        this.driver = WebDriverConfig.getWebDriver();

        this.newsDetailsResponseJsonModel = new NewsDetailsResponseTests(newsDetailsId)
                .extractNewsDetailsResponseJsonModel();

        this.mission = newsDetailsResponseJsonModel.getMission();
        this.name = newsDetailsResponseJsonModel.getName();
        this.url = newsDetailsResponseJsonModel.getUrl();
        this.newsId = newsDetailsResponseJsonModel.getNewsId();

    }

    @BeforeEach
    public void setUp(){

        setUpTestingPage();

        driver.get(url);

    }

    @AfterEach
    public void turnOf(){

        driver.quit();
    }

    private void setUpTestingPage(){

        if (mission.equals("hubble")) {

            this.testPage = new HubblesitePage(driver);

        } else if (mission.equals("james_webb")) {

            this.testPage = new WebbtelescopePage(driver);

        } else {

            throw new InvalidParameterException("Unknown mission in response.");
        }

    }

    @Test
    public void testPageUrl(){

        assertEquals(
                url,
                driver.getCurrentUrl(),
                "Page url is not corrected."
        );
    }

    @Test
    public void testPageTitle() {

        assertTrue(
                testPage.isNameDisplayed(),
                "Page title is not correctly displayed.");

        assertEquals(
                name,
                testPage.getName(),
                "Page title do not contains correct value.");
    }

    @Test
    public void testPageReleasedId() {

        assertTrue(
                testPage.isReleaseIdDisplayed(),
                "Page released date is not correctly displayed.");

        assertTrue(
                testPage
                        .getReleaseId()
                        .contains(newsId),
                "Page released date do not contains correct value.");
    }




}
