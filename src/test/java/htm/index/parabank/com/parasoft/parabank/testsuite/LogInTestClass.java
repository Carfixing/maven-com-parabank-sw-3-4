package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTestClass extends TestBase {
    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("jaimin3");
        loginPage.enterPassword("12345@");
        loginPage.clickonloginbutton();
        String expectedMessage = "Accounts Overview";
        String actualMessage =loginPage.getverifyText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");

    }
    @Test
    public void verifyTheErrorMessage() {
        loginPage.enterUserName("kal");
        loginPage.enterPassword("12453@");
        loginPage.clickonloginbutton();
        String expectedMessage ="The username and password could not be verified.";
        String actualMessage =loginPage.getverifyText1();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterUserName("Tomato");
        loginPage.enterPassword("12456@");
        loginPage.clickonloginbutton();
        String expectedMessage = "Customer Login";
        String actualMessage = loginPage.getverifyText2();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }

}
