package com.webshop.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class CreateAccountTests extends TestBase {

    @Test
    public void userCanRegister() {

        click(By.cssSelector("[href='/register']"));

        type(By.id("FirstName"), "Tala");
        type(By.id("LastName"), "Valchuk");
        type(By.id("Email"), "tala+" + System.currentTimeMillis() + "@gmail.com");
        type(By.id("Password"), "StrongPass123!");
        type(By.id("ConfirmPassword"), "StrongPass123!");

        click(By.id("register-button"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".result"))
        );

        Assert.assertTrue(result.getText().contains("Your registration completed"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".result")),
                "Элемент с результатом регистрации не найден!");
    }
}
