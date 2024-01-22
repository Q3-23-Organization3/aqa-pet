package com.shyshko.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "videos")
    private WebElement videosElement;
    private WebDriver driver;
    private Header header;
    private ReviewsPage reviewsPage;

    public WebElement blockWithVideos() {
        return videosElement;
    }

    public HomePage(WebDriver driver, Header header, ReviewsPage reviewsPage) {
        super(driver);
        this.header = header;
        this.reviewsPage = reviewsPage;
        PageFactory.initElements(driver, this);
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
