package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageFactory.BootstrapDatePickerPO;
import testBase.TestBase;

/**
 * Created by norah on 8/26/2021.
 */
public class BootstrapDatePickerTest extends TestBase{
   private BootstrapDatePickerPO bootstrapDatePickerPO;

    public void BootStrapDatePickerUnitTest(){
        bootstrapDatePickerPO = PageFactory.initElements(driver, BootstrapDatePickerPO.class);


    }
}
