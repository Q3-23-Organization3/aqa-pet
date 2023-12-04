package com.shyshko.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static final By VIDEOS = By.id("videos");
    private WebDriver driver;
    private Header header;
    private ReviewsPage reviewsPage;

    public WebElement blockWithVideos() {
        return driver.findElement(VIDEOS);
    }

    public HomePage(WebDriver driver, Header header, ReviewsPage reviewsPage) {
        this.driver = driver;
        this.header = header;
        this.reviewsPage = reviewsPage;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ReviewsPage getReviewsPage() {
        return reviewsPage;
    }

    public void setReviewsPage(ReviewsPage reviewsPage) {
        this.reviewsPage = reviewsPage;
    }
}
