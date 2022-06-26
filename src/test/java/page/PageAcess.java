package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageAcess extends BaseTest {
    public PageAcess(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "MyAccountDropDown")
    WebElement myAccountDrop;
    @FindBy(linkText = "My Account")
    WebElement myAcc;

    public PageAcess clickMyAcc(){
        wdwait.until(ExpectedConditions.elementToBeClickable(myAcc));
        myAcc.click();
        return this;
    }

    public PageAcess clickMyAccountDrop(){
        wdwait.until(ExpectedConditions.elementToBeClickable(myAccountDrop));
        myAccountDrop.click();
        return this;
    }
}
