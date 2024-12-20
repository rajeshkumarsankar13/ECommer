package com.ecommerce.testcases;

import com.ecommerce.pages.BaseTest;
import org.testng.annotations.Test;

public class NavigateTest extends BaseTest {
    @Test
    //Navigate the Page
    public void navigate(){
    driver.navigate().to("https://www.bestbuy.com/");
    driver.navigate().refresh();
    }
    @Test
    //Get Current Page Title
    public void title() {
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);
    }
    @Test
    //Get Current Url
    public void url() {
        String url = driver.getCurrentUrl();
        System.out.println("URL : " + url);
    }

}
