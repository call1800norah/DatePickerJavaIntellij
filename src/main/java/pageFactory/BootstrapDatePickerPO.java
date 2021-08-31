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
    public WebElement PageHeader;

   @FindBy(xpath = "//div[@class='panel-heading' and text()='Date Example :']")
    public WebElement DateExampleHeader;

   @FindBy(xpath = "//div[@class='panel-heading' and text()='Date Range Example :']")
    public WebElement DateRangeExampleHeader;

   @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/ul/li")
    public List<WebElement> DateExampleList;

   @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/ul/li")
    public List<WebElement> DateRangeExampleList;

   @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/h4")
    public WebElement DateExampleSelectDate;

   @FindBy(xpath = "//*[@id=\"sandbox-container2\"]/h4")
    public WebElement DateRangeExampleSelectDate;

   @FindBy(xpath = "//div[@class='input-group date']//input")
    public WebElement InputDate;

   @FindBy(xpath = "//div[@class='input-daterange input-group']//input[@placeholder='Start date']")
    public WebElement InputStartDate;

   @FindBy(xpath = "//div[@class='input-daterange input-group']//input[@placeholder='End date']")
    public WebElement InputEndDate;





}
