package com.shyshko.test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    private static WebDriver driver;

    @BeforeAll
    public static void initBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/valeriiashyshko/IdeaProjects/projects/aqa-pet/SeleniumWD/src/main/resources/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
    }

    @BeforeEach
    public void setUp() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void successfulLoginTest() {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        driver.quit();
    }

    @Test
    public void failedLoginTest() {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword123");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        driver.quit();
    }
}