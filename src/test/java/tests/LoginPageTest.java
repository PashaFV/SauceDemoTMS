package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void loginWithoutUsername() {
        loginPage.openPage();
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required", "Сообщение об ошибке не появилось");

    }

    @Test
    public void loginWithoutPassword() {
        loginPage.openPage();
        loginPage.login("standard_user", "");


    }

    @Test
    public void loginWithInvalidData() {
        loginPage.openPage();
        loginPage.login("usertest", "12345");
        loginPage.getErrorMessage();

    }

    @Test
    public void loginWithoutAnyData() {
        loginPage.openPage();
        loginPage.login("", "");

    }
}
