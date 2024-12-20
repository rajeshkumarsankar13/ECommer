package com.ecommerce.pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ShopByBrand extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Brands']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Apple']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='iPhone']")).click();
        Thread.sleep(2000);
    }
}
