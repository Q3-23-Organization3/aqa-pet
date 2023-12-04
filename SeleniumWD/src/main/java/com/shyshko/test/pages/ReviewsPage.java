package com.shyshko.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewsPage {

    private static final By PLAY_BUTTON = By.xpath("//*[@id=\"page-header\"]/div[1]/div[2]/ul/li[3]/button");
    private static final By PLAYER = By.id("player-container");

    private static final By MENU_ELEMENT_REVIEWS = By.xpath("//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[2]/a");

    private WebDriver driver;

    public ReviewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickReviewsMenuElement() {
        driver.findElement(MENU_ELEMENT_REVIEWS).click();
    }

    public WebElement findPlayButton() {
        return driver.findElement(PLAY_BUTTON);
    }

    public WebElement findPlayer() {
        return driver.findElement(PLAYER);
    }
}
