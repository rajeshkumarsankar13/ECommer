package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseTest {
    WebDriver driver;
    //constructor
    public SignUpPage(WebDriver lDriver)
    {
        this.driver=lDriver;
        PageFactory.initElements(driver,this);
        driver.navigate().to("https://www.bestbuy.com/identity/newAccount?token=tid%3Ac2d1ac36-b7b1-11ef-85a5-027965307d8d");
    }

    @FindBy(name="firstName") WebElement fname;
    @FindBy(name="lastName") WebElement lname;
    @FindBy(id="email") WebElement email;
    @FindBy(name="fld-p1") WebElement pass;
    @FindBy(id="reenterPassword") WebElement repass;
    @FindBy(name="phone") WebElement phone;
    @FindBy(xpath="//button[contains(text(),'Create an Account')]") WebElement createaccount;

    public void SignUpToPortal(String firstname, String lastname, String Email, String password, String repassword, String Phone) {
        // TODO Auto-generated method stub
        fname.sendKeys(firstname);
        lname.sendKeys(lastname);
        email.sendKeys(Email);
        pass.sendKeys(password);
        repass.sendKeys(repassword);
        phone.sendKeys(Phone);
        createaccount.click();
    }


}
