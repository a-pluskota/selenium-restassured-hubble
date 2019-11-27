package org.hubblesite.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver;

    public AbstractPage(
            WebDriver driver
    ) {
        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public abstract boolean isNameDisplayed();

    public abstract String getName();

    public abstract boolean isReleaseIdDisplayed();

    public abstract String getReleaseId();

}
