package com.webshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShopLocatorsHomework {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void LocatorsAndCssSelectorsTest() {

        WebElement byId = driver.findElement(By.id("small-searchterms"));

        WebElement byName = driver.findElement(By.name("NewsletterEmail"));

        WebElement byClassName = driver.findElement(By.className("cart-qty"));

        WebElement byTagName = driver.findElement(By.tagName("h2"));
        System.out.println(byTagName.getText()); // Welcome to our store

        WebElement byLinkText = driver.findElement(By.linkText("Books"));

        WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Book"));

        WebElement byXpath = driver.findElement(By.xpath("//div[@class='topic-html-content-title']//h2"));

        driver.findElement(By.cssSelector(".header-logo a"));

        // by attribute (key=value)
        driver.findElement(By.cssSelector("input[id='small-searchterms']"));

        // contains (*=)
        driver.findElement(By.cssSelector("a[href*='/electronics']"));

        // starts-with (^=)
        driver.findElement(By.cssSelector("input[id^='small']"));

        // ends-with ($=)
        driver.findElement(By.cssSelector("img[src$='.png']"));

        //найти любой <h2> через css
        WebElement h2 = driver.findElement(By.cssSelector("h2"));
        System.out.println(h2.getText()); // Welcome to our store

        //by class
        driver.findElement(By.cssSelector(".header"));

        //by tag and class
        driver.findElement(By.cssSelector("input.search-box-button"));

        //by tag and two classes
        driver.findElement(By.cssSelector("div.block.block-category-navigation"));

        //by tag, class and an attribute
        driver.findElement(By.cssSelector("input.button-1.newsletter-subscribe-button[value='Subscribe']"));
    }

}
