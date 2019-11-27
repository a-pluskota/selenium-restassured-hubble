package org.hubblesite.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HubblesitePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='news-listing__intro']//h2")
    private WebElement titleH2;

    @FindBy(xpath = "//span[@class='news-release-id']")
    private WebElement newsReleaseId;

    public HubblesitePage(
            WebDriver driver
    ) {
        super(driver);
    }

    @Override
    public boolean isNameDisplayed() {

        return titleH2.isDisplayed();
    }

    @Override
    public String getName() {

        return titleH2.getText();
    }

    @Override
    public boolean isReleaseIdDisplayed() {

        return newsReleaseId.isDisplayed();
    }

    @Override
    public String getReleaseId() {

        return newsReleaseId
                .getText();
    }

}
