package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTestclass extends TestBase {

    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        registerPage.clickOnRegisterLink();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = registerPage.verifyTheSigningupiseasy();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.enterFirstName("Jaimin3");
        registerPage.enterLastNameField("Patel");
        registerPage.enterAddressfield("4A Apt Second Avenue");
        registerPage.enterCityField("Broklyn");
        registerPage.enterstateField("New York");
        registerPage.enterZipCode("11220");
        registerPage.enterPhoneNumber("73237236683");
        registerPage.enterSSNNumber("123456789");
        registerPage.enterUserName("Prachi");
        registerPage.enterpassword("12345@");
        registerPage.enterconformpassword("12345@");
        registerPage.clickOnRegisterButton();
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = registerPage.verifyTextforSuccessAfterRegister();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");


    }
}
