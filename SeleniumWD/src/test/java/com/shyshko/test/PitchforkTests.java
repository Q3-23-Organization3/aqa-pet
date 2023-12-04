package com.shyshko.test;

import com.shyshko.test.pages.Header;
import com.shyshko.test.pages.HomePage;
import com.shyshko.test.pages.ReviewsPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class PitchforkTests {

    private static WebDriver DRIVER;
    private static HomePage HOME_PAGE;
    private static Header HEADER;

    private static ReviewsPage REVIEWS_PAGE;

    @BeforeAll
    public static void initBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/valeriiashyshko/IdeaProjects/projects/aqa-pet/SeleniumWD/src/main/resources/chromedriver-mac-x64/chromedriver");
        DRIVER = new ChromeDriver();
        DRIVER.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        DRIVER.get("https://pitchfork.com/");
        HEADER = new Header(DRIVER);
        REVIEWS_PAGE = new ReviewsPage(DRIVER);
        HOME_PAGE = new HomePage(DRIVER, HEADER, REVIEWS_PAGE);
    }

    @Test
    void blockVideosIsPresentTest() {
        acceptCookie();
        WebElement blockWithVideos = HOME_PAGE.blockWithVideos();
        DRIVER.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        assertNotNull(blockWithVideos);
        assertEquals("videos", blockWithVideos.getAttribute("id"));
    }

    @Test
    void acceptCookiesTest() {
        assertDoesNotThrow(PitchforkTests::acceptCookie);
    }

    @Test
    void menuElementsCountTest() {
        acceptCookie();
        List<WebElement> menuElements = HEADER.getMenuElements();
        assertEquals(9, menuElements.size());
    }

    @Test
    void isElementPresentTest() {
        acceptCookie();
        String newsMenuElement = HEADER.getNewsMenuElement();
        assertNotNull(newsMenuElement);
        assertEquals("NEWS", newsMenuElement);
    }

    @Test
    void clickToOpenPageTest() {
        acceptCookie();
        assertDoesNotThrow(() -> HEADER.clickReviewsMenuElement());
    }

    @Test
    void clickPlayButtonTest() {
        acceptCookie();
        REVIEWS_PAGE.clickReviewsMenuElement();
        WebElement playButton = REVIEWS_PAGE.findPlayButton();

        assertNotNull(playButton);
        playButton.click();

        WebElement player = REVIEWS_PAGE.findPlayer();
        assertNotNull(player);
        assertTrue(player.isDisplayed());
    }

    @Test
    void playerNotDisplayedIfNotClickedTest() {
        acceptCookie();
        REVIEWS_PAGE.clickReviewsMenuElement();
        REVIEWS_PAGE.findPlayButton();
        //no click
        assertThrows(org.openqa.selenium.NoSuchElementException.class, () -> REVIEWS_PAGE.findPlayer());
    }

    @AfterAll
    public static void quitBrowser() {
        DRIVER.quit();
    }

    private static void acceptCookie() {
        WebElement cookieBanner = DRIVER.findElement(By.id("onetrust-group-container"));
        if (cookieBanner.isDisplayed()) {
            WebElement acceptCookiesButton = DRIVER.findElement(By.id("onetrust-accept-btn-handler"));
            acceptCookiesButton.click();
        }
    }
}
