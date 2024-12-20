package com.ecommerce.testcases;

import com.ecommerce.pages.BaseTest;
import com.ecommerce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @Test
    public void verifyLogin() throws IOException {
        LoginPage lp = new LoginPage(driver);
        String username = "testuser@test.com";
        String password = "Test123456$";
        lp.loginToPortal(username, password);
    }

}
