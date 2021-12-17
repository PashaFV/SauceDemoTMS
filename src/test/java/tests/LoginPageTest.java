package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class LoginPageTest extends BaseTest {


    @Test (dataProvider = "loginData")
    public void negativeLoginTest(String userName, String password, String errorMessage) {
        loginPage.openPage();
        loginPage.login(userName, password);
        Assert.assertEquals(loginPage.getErrorMessage(), errorMessage, "Сообщение об ошибке не появилось");

    }


    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"","secret_sauce","Epic sadface: Username is required"},
                {"standard_user","","Epic sadface: Password is required"},
                {"usertest","12345","Epic sadface: Username and password do not match any user in this service"},
                {"locked_out_user","secret_sauce","Epic sadface: Sorry, this user has been locked out."},

        };
    }

}
