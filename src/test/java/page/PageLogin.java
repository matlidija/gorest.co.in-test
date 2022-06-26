package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageLogin extends BaseTest {
    public PageLogin(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Microsoft")
    WebElement linkMicrosoft;

    public void clickLinkMicrosoft(){
        wdwait.until(ExpectedConditions.elementToBeClickable(linkMicrosoft));
        linkMicrosoft.click();
    }
}
