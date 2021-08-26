package testBase;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * Created by norah on 8/26/2021.
 */
public class TestBase {
    WebDriver driver;

    @Before
    public void initialize(){
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
         driver = new ChromeDriver();

        //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        //maximize window
        driver.manage().window().maximize();

        //Open browser with desired URL
        driver.get(("https://www.seleniumeasy.com/test/basic-first-form-demo.html"));
        Assert.assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", driver.getTitle());
    }

    //Test cleanup
    @After
    public void TestClean() {
        driver.quit();
    }

}
