package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageProfile extends BaseTest {
    public PageProfile(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user_display_name")
    WebElement updateUser;
    @FindBy(id = "google_esf")
    WebElement iframeBoby;
    @FindBy(xpath = "//input[@name='commit']")
    WebElement updateButton;
    @FindBy(css = ".alert-info")
    WebElement alertMessUpdate;
    @FindBy(css = ".btn-close")
    WebElement alertButtonClose;
    @FindBy(xpath = "//a[contains(text(),'I Understand Delete My Account')]")
    WebElement linkDeleteAcc;

    public void clickLinkDeleteAcc(){
        wdwait.until(ExpectedConditions.elementToBeClickable(linkDeleteAcc));
        linkDeleteAcc.click();
    }

    public void clickAlertButtonClose(){
        wdwait.until(ExpectedConditions.elementToBeClickable(alertButtonClose));
        alertButtonClose.click();
    }

    public String alertMessUpdateIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(alertMessUpdate));
        return alertMessUpdate.getText();

    }
    public boolean alertMessUpdateIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(alertMessUpdate));
        return alertMessUpdate.isDisplayed();
    }

    /*public void swichToFrame(){
        wdwait.until(ExpectedConditions.elementToBeClickable(iframeBoby));
        driver.switchTo().frame(iframeBoby);
        wdwait.until(ExpectedConditions.elementToBeClickable(updateButton));
        updateButton.click();
        driver.switchTo().defaultContent();
    }*/
    public void clickUpdateButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(updateButton));
        updateButton.click();
    }

    public void updateUserEdit(String ime){
        wdwait.until(ExpectedConditions.elementToBeClickable(updateUser));
        updateUser.clear();
        updateUser.sendKeys(ime);
    }
}
