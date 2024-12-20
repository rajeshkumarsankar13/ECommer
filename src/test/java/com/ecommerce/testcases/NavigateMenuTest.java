package com.ecommerce.testcases;

import com.ecommerce.pages.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigateMenuTest extends BaseTest {
    @Test
    public void Navigate(){
        driver.navigate().to("https://www.bestbuy.com/");
        driver.navigate().refresh();
    }
    @Test
    public void Menu(){
        driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
        driver.findElement(By.xpath("//button[text()='TV & Home Theater']")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
