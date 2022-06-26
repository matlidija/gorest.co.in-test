package test;

import base.BaseTest;
import com.sun.glass.events.KeyEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import page.*;

import java.awt.*;
import java.util.Random;

public class TestPage extends BaseTest {
    PageHome pageHome;
    PageLogin pageLogin;
    PageMicrosoft pageMicrosoft;
    PageAcess pageAcess;
    PageProfile pageProfile;
    Random ran = new Random();


    @Before
    public void setUpTest(){
        pageHome = new PageHome();
        pageLogin = new PageLogin();
        pageMicrosoft = new PageMicrosoft();
        pageAcess = new PageAcess();
        pageProfile = new PageProfile();
    }
    @Test
    public void loginUser(){
        pageHome.clickLoginButton();
        pageLogin.clickLinkMicrosoft();
        //driver.switchTo().alert().dismiss();
        pageMicrosoft.typeInputFieldMicrosoftEmail("lidija785@outlook.com")
                     .clickNextButton()
                     .typeInputFieldMicrosoftPass("Qwer9874")
                     .clickSingInButton()
                     .clickCheackBoxField()
                     .clickSingInButton();
        pageAcess.clickMyAccountDrop()
                 .clickMyAcc();
        pageProfile.updateUserEdit("Lidija Matic"+ ran.nextInt(99));
        pageProfile.clickUpdateButton();
        Assert.assertTrue(pageProfile.alertMessUpdateIsDisplay());
        Assert.assertEquals("Updated successfully", pageProfile.alertMessUpdateIsGetText());
        pageProfile.clickAlertButtonClose();
        js.executeScript("window.scrollBy(0,200)");
        pageProfile.clickLinkDeleteAcc();
        driver.switchTo().alert().accept();
    }
}
