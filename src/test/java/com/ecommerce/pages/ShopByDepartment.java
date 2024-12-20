package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ShopByDepartment extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='TV & Home Theater']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='TVs by Brand']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Samsung TVs']")).click();
        Thread.sleep(2000);
    }
}
