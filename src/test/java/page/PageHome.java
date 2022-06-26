package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageHome extends BaseTest {
    public PageHome(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Login")
    WebElement loginButton;

    public void clickLoginButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

}
