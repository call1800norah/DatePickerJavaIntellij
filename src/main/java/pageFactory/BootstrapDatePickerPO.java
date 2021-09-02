package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

/**
 * Created by norah on 8/26/2021.
 */
public class BootstrapDatePickerPO {

   @FindBy(xpath = "//div/h1[text()=\'Bootstrap Date Pickers Example\']")
    public WebElement pageHeader;

   @FindBy(xpath = "//div[@class='panel-heading' and text()='Date Example :']")
    public WebElement dateExampleHeader;

   @FindBy(xpath = "//div[@class='panel-heading' and text()='Date Range Example :']")
    public WebElement dateRangeExampleHeader;

   @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/ul/li")
    public List<WebElement> dateExampleList;

   @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/ul/li")
    public List<WebElement> dateRangeExampleList;

   @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/h4")
    public WebElement dateExampleSelectDate;

   @FindBy(xpath = "//*[@id=\"sandbox-container2\"]/h4")
    public WebElement dateRangeExampleSelectDate;

   @FindBy(xpath = "//div[@class='input-group date']//input")
    public WebElement inputDate;

   @FindBy(xpath = "//div[@class='input-daterange input-group']//input[@placeholder='Start date']")
    public WebElement inputStartDate;

   @FindBy(xpath = "//div[@class='input-daterange input-group']//input[@placeholder='End date']")
    public WebElement inputEndDate;





}
