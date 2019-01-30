package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/asiya/Documents/Selenium dependencies/Driver/chromedriver");
     WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement inputEmail = driver.findElement(By.id("session_email"));
        inputEmail.sendKeys(new CharSequence[]{"kexesobepu@zsero.com"});

    }

}
