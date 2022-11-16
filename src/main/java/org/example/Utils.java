package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

import static org.example.BasePage.driver;

public class Utils extends BasePage {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //to input content in editable text fields or password fields in a webpage.
    public void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // verifying messages, errors, asserting WebElements, and many more.
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    //The TIMESTAMP data type is used for values that contain both date and time parts.
    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }
    //enables WebDriver to check if one or more web elements are visible
    public void waitForElementToBeVisible(By by, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //enables WebDriver to check if one or more web elements are clickable
    public void WaitForElementToBeClickable(By by,int duration) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));


    }
    //These methods check that the URL is an expected one. With the timeout parameter that needs to be provided to the method
    public void WaitForUrlTobe(String url,int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));

    }
    //that allows the user to choose one value from a list
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //that allows the user to choose one value from a list

    public static void selectFromDropDownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    // creating dropdown method to select value from list
    public static void selectFromDropDownByIndex(By by, int num) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
}