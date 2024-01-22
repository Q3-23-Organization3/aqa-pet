package com.shyshko.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header extends BasePage {

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul")
    private WebElement menuElements;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[1]/a")
    private WebElement menuElementNews;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/div[6]/header/div[2]/div[2]/nav/ul/li[2]/a")
    private WebElement menuElementReviews;

    private WebDriver driver;

    public Header(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getMenuElements() {
        WebElement element = menuElements;
        return element.findElements(By.tagName("li"));
    }
//    public List<WebElement> getMenuElements() {
//        WebElement element = driver.findElement(MENU_ELEMENTS);
//        return element.findElements(By.tagName("li"));
//    }

    public String getMenuElementsNews() {
        return menuElementNews.getText();
    }

    public void clickReviewsMenuElement() {
        menuElementReviews.click();
    }
}
