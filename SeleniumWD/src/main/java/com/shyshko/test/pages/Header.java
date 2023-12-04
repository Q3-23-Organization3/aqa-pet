package com.shyshko.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Header {
    private static final By MENU_ELEMENTS = By.xpath("//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul");
    private static final By MENU_ELEMENT_NEWS = By.xpath("//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[1]/a");
    private static final By MENU_ELEMENT_REVIEWS = By.xpath("//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[2]/a");

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getMenuElements() {
        WebElement element = driver.findElement(MENU_ELEMENTS);
        return element.findElements(By.tagName("li"));
    }

    public String getNewsMenuElement() {
        return driver.findElement(MENU_ELEMENT_NEWS).getText();
    }

    public void clickReviewsMenuElement() {
        driver.findElement(MENU_ELEMENT_REVIEWS).click();
    }
}
