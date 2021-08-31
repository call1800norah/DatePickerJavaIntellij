package testBase;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.TimeoutException;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;



import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * Created by norah on 8/26/2021.
 */
public class TestBase {
    public WebDriver driver;

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

    public void WaitForDisplayed(WebElement element) {
        Assert.assertNotNull("The element returned as null.", element);

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        try {
            wait.until(e->element.isDisplayed());
            Assert.assertTrue("element was not displayed.", element.isDisplayed());


        } catch (TimeoutException e) {
            Assert.assertFalse("WaitForDisplayed timed out in 30seconds", element.isDisplayed());
            System.out.println(e.getMessage());
        }
    }
    public void VerifyElementList(List<WebElement> elements, List<String> strList){
        for(WebElement e:elements){
            WaitForDisplayed(e);
            CompareElementListToStringList(elements, strList);
        }
    }
    public void CompareElementListToStringList(List<WebElement> elements, List<String> strList){
        int i = 0;
        for(String s:strList){
            Assert.assertTrue(s.equals(elements.get(i).getText().trim()));
            i++;
        }
    }
    }
