package com.shyshko.test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    private static WebDriver DRIVER;

    @BeforeAll
    public static void initBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/valeriiashyshko/IdeaProjects/projects/aqa-pet/SeleniumWD/src/main/resources/chromedriver-mac-x64/chromedriver");
        DRIVER = new ChromeDriver();
        DRIVER.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
    }

    @Test
    public void successfulLoginTest() {
        DRIVER.get("https://the-internet.herokuapp.com/login");
        DRIVER.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        DRIVER.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
        DRIVER.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
    }

    @Test
    public void failedLoginTest() {
        DRIVER.get("https://the-internet.herokuapp.com/login");
        DRIVER.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        DRIVER.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword123");
        DRIVER.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
    }

    @AfterAll
    public static void quitBrowser() {
        DRIVER.quit();
    }
}
