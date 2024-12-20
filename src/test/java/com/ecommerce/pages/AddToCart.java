package com.ecommerce.pages;

import org.openqa.selenium.By;

public class AddToCart extends BaseTest{
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        driver.findElement(By.id("gh-search-input")).sendKeys("mobiles samsung");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='header-search-icon']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Samsung - Galaxy S24 Ultra 256GB - Titanium Violet (Verizon)')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("transactions-page__yes")).click();
        driver.findElement(By.xpath("//button[@class='c-button c-button-secondary c-button-lg c-button-block transactions-page__continue-button']")).click();
    }
}
