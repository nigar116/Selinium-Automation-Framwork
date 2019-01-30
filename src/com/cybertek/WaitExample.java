package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/uft/Desktop/selenium dependencies/drivers/Chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");


// username tutorial
// password tutorial
        driver.findElement(By.name("userName")).sendKeys("tutorial");
        driver.findElement(By.name("password")).sendKeys("tutorial");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}