package com.shyshko.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"page-header\"]/div[1]/div[2]/ul/li[3]/button")
    private WebElement playButton;

    @FindBy(id = "player-container")
    private WebElement playerContainer;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[2]/a")
    private WebElement reviewsMenuElement;

    private WebDriver driver;

    public ReviewsPage(WebDriver driver) {
        super(driver);
    }

    public void clickReviewsMenuElement() {
        reviewsMenuElement.click();
    }

    public WebElement findPlayButton() {
        return playButton;
    }

    public WebElement findPlayer() {
        return playerContainer;
    }
}
