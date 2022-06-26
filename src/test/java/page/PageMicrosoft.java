package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageMicrosoft extends BaseTest {
    public PageMicrosoft(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "i0116")
    WebElement inputFieldMicrosoftEmail;
    @FindBy(id = "idSIButton9")
    WebElement nextButton;
    @FindBy(id = "i0118")
    WebElement inputFieldMicrosoftPass;
    @FindBy(id = "idSIButton9")
    WebElement singInButton;
    @FindBy(id = "KmsiCheckboxField")
    WebElement cheackBoxField;

    public PageMicrosoft clickCheackBoxField(){
        wdwait.until(ExpectedConditions.elementToBeClickable(cheackBoxField));
        cheackBoxField.click();
        return this;
    }

    public PageMicrosoft clickSingInButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();
        return this;
    }

    public PageMicrosoft typeInputFieldMicrosoftPass(String pass){
        wdwait.until(ExpectedConditions.elementToBeClickable(inputFieldMicrosoftPass));
        inputFieldMicrosoftPass.clear();
        inputFieldMicrosoftPass.sendKeys(pass);
        return this;
    }

    public PageMicrosoft clickNextButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
        return this;
    }

    public PageMicrosoft typeInputFieldMicrosoftEmail(String email){
        wdwait.until(ExpectedConditions.elementToBeClickable(inputFieldMicrosoftEmail));
        inputFieldMicrosoftEmail.clear();
        inputFieldMicrosoftEmail.sendKeys(email);
        return this;
    }

}
