package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class LoginPage extends BaseTest {
    WebDriver driver;
    //constructor
    public LoginPage(WebDriver lDriver)
    {
        this.driver=lDriver;
        PageFactory.initElements(driver,this);
        driver.navigate().to("https://www.bestbuy.com/identity/signin?token=tid%3Ad8f2b715-b74b-11ef-8502-0affe49eaa41");
    }

    @FindBy(name="fld-e") WebElement uname;

    @FindBy(name="fld-p1") WebElement pass;

    @FindBy(xpath="//button[@type='submit']") WebElement loginButton;

    public void loginToPortal(String username, String password) {
        // TODO Auto-generated method stub
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginButton.click();
    }

    public void dashboardportal(String dash) throws IOException
    {
        String actualdash= driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
        System.out.println(actualdash);

        if(actualdash.equals(dash))
        {
            System.out.println("Test Passed");

        }
        else
        {
            captureScreenShot(driver,"fetchDashboardText");
        }
        assertEquals(dash, actualdash);


    }

    public void captureScreenShot(WebDriver driver, String fetchDashboardText) {
    }

    private void assertEquals(String dash, String actualdash) {
    }
}
