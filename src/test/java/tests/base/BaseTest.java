package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public InventoryPage inventoryPage;
    public CartPage cartPage;

    @Parameters({"browser"})
    @BeforeMethod
    @Step("Browser launch")
    public void setUp(ITestContext testContext) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterMethod
    @Step("Browser quit")
    public void tearDown() {

        driver.quit();
    }



}
