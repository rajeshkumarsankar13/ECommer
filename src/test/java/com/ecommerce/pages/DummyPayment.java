package com.ecommerce.pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DummyPayment extends BaseTest{
    public static void main(String[] args) {
        driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
        driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']")).click();
        driver.findElement(By.xpath("//a[text()='Payment Methods']")).click();
        driver.findElement(By.name("fld-e")).sendKeys("testuser@test.com");
        driver.findElement(By.name("fld-p1")).sendKeys("@Abcd1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
