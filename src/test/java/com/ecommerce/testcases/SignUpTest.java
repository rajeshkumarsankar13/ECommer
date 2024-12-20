package com.ecommerce.testcases;

import com.ecommerce.pages.BaseTest;
import com.ecommerce.pages.SignUpPage;
import org.testng.annotations.Test;


public class SignUpTest extends BaseTest {
    @Test
    public void verifySignUp() {
        SignUpPage sp = new SignUpPage(driver);
        String firstname = "Rajeshkumar";
        String lastname = "Sankar";
        String Email = "testuser@test.com";
        String password = "Test123456$";
        String repassword = "Test123456$";
        String Phone = "123456789";
        sp.SignUpToPortal(firstname, lastname, Email, password, repassword, Phone);
    }
}
