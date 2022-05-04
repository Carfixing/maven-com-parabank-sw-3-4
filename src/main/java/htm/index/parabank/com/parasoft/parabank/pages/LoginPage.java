package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.xpath("//input[@name='username']");
    By passWordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@value='Log In']");
    By verifyText = By.xpath("//h2[contains(text(),'Customer Login')]");
    By verifyText1= By.xpath("//p[contains(text(),'An internal error has occurred and has been logged')]");
    By verifyText2 =By.xpath("//p[contains(text(),'An internal error has occurred and has been logged')]");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
       sendTextToElement(passWordField,password);
    }

    public void clickonloginbutton(){
        clickOnElement(loginButton);
    }

    public String getverifyText(){
        return getTextFromElement(verifyText);
    }

    public String getverifyText1(){
        return getTextFromElement(verifyText1);
    }

    public String getverifyText2(){
        return getTextFromElement(verifyText2);
    }





}
