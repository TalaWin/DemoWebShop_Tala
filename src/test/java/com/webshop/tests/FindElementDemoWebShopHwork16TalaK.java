package com.webshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementDemoWebShopHwork16TalaK {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.get("https://demowebshop.tricentis.com");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @AfterMethod
//    public void tearDown() {
//
//        driver.quit();
//    }
//
//    @Test
//    public void findElementByCssSelector() {
//        driver.findElement(By.cssSelector("[href='/register']"));
//        click(By.cssSelector("a[href='/register']"));
//        driver.findElement(By.cssSelector("#small-searchterms"));
//        driver.findElement(By.cssSelector(".top-menu [href='/books']"));
//
//
//        WebElement register = driver.findElement(By.cssSelector("[href='/register']"));
//        System.out.println("Register href: " + register.getAttribute("href"));
//
//        WebElement searchInput = driver.findElement(By.cssSelector("#small-searchterms"));
//        System.out.println("Search placeholder: " + searchInput.getAttribute("placeholder"));
//
//        WebElement booksMenu = driver.findElement(By.cssSelector(".top-menu [href='/books']"));
//        System.out.println("Books href: " + booksMenu.getAttribute("href"));
//    }
//
//    @Test
//    public void findElementsByXpath() {
//
//        WebElement barNotification =
//                driver.findElement(By.xpath("//*[@id='bar-notification']"));
//        System.out.println("Notification title: " + barNotification.getAttribute("title"));
//
//        WebElement closeNotificationBtn =
//                driver.findElement(By.xpath("//div[@id='bar-notification']//span[@class='close']"));
//        System.out.println("Close button class: " + closeNotificationBtn.getAttribute("class"));
//
//        WebElement logoImg =
//                driver.findElement(By.xpath("//div[@class='header-logo']//a/img"));
//        System.out.println("Logo image alt: " + logoImg.getAttribute("alt"));
//
//        WebElement headerLinks =
//                driver.findElement(By.xpath("//div[@class='header-links']"));
//        System.out.println("Header links class: " + headerLinks.getAttribute("class"));
//
//        WebElement registerLink =
//                driver.findElement(By.xpath("//div[@class='header-links']//a[@href='/register']"));
//        System.out.println("Register link text: " + registerLink.getText());
//
//        WebElement topMenu =
//                driver.findElement(By.xpath("//div[@class='header-menu']//ul[@class='top-menu']"));
//        System.out.println("Top menu tag: " + topMenu.getTagName());
//
//        WebElement booksMenuItem =
//                driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/books']"));
//        System.out.println("Books menu text: " + booksMenuItem.getText());
//
//        WebElement flyoutCart =
//                driver.findElement(By.xpath("//div[@id='flyout-cart']"));
//        System.out.println("Flyout cart displayed: " + flyoutCart.isDisplayed());
//
//
//        WebElement miniShoppingCart =
//                driver.findElement(By.xpath("//div[@id='flyout-cart']//div[@class='mini-shopping-cart']"));
//        System.out.println("Mini-cart class: " + miniShoppingCart.getAttribute("class"));
//
//        WebElement footerDisclaimer =
//                driver.findElement(By.xpath("//div[@class='footer']//div[@class='footer-disclaimer']"));
//        System.out.println("Footer text: " + footerDisclaimer.getText());
//    }
//
//
//    @Test
//    public void userCanRegister() {
//        driver.get("https://demowebshop.tricentis.com/register");
//
//
//        driver.findElement(By.id("FirstName")).sendKeys("Tala");
//        driver.findElement(By.id("LastName")).sendKeys("Valchuk");
//        driver.findElement(By.id("Email"))
//                .sendKeys("tala+" + System.currentTimeMillis() + "@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("StrongPass123!");
//        driver.findElement(By.id("ConfirmPassword")).sendKeys("StrongPass123!");
//
//
//        click(By.cssSelector("[href='/register']"));
//
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement result = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.cssSelector(".result")     // можно и By.xpath("//*[contains(@class,'result')]"), но лучше CSS
//                )
//        );
//        String text = result.getText();
//        System.out.println("Res:[" + text + "]");
//    }
//

}
