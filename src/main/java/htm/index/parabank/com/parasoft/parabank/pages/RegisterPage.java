package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By clickRegLink = By.xpath("//a[contains(text(),'Register')]");
    By verifyText = By.className("title");
    By firstNamefield = By.id("customer.firstName");
    By lastNamefield = By.id("customer.lastName");
    By Addressfield = By.id("customer.address.street");
    By cityfield = By.id("customer.address.city");
    By statefield = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By userName = By.id("customer.username");
    By password = By.id("customer.password");
    By conformpassword = By.id("repeatedPassword");
    By clickRegButton = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    By verifyTextforSuccess = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public void clickOnRegisterLink(){
        clickOnElement(clickRegLink);
    }

    public String verifyTheSigningupiseasy(){
        return getTextFromElement(verifyText);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNamefield,firstName);
    }

    public void enterLastNameField(String lastname){
        sendTextToElement(lastNamefield,lastname);
    }

    public void enterAddressfield(String address){
        sendTextToElement(Addressfield,address);
    }

    public void enterCityField(String city){
        sendTextToElement(cityfield,city);
    }

    public void enterstateField(String state){
        sendTextToElement(statefield,state);
    }

    public void enterZipCode(String zipcode1){
        sendTextToElement(zipCode,zipcode1);
    }

    public void enterPhoneNumber(String phNo){
        sendTextToElement(phone,phNo);
    }

    public void enterSSNNumber(String ssn1){
        sendTextToElement(ssn,ssn1);
    }

    public void enterUserName(String username){
        sendTextToElement(userName, username);
    }

    public void enterpassword(String password1){
        sendTextToElement(password , password1);
    }

    public void enterconformpassword(String conpassword){
        sendTextToElement(conformpassword,conpassword);
    }

    public void clickOnRegisterButton(){
        clickOnElement(clickRegButton);
    }

    public String verifyTextforSuccessAfterRegister(){
        return getTextFromElement(verifyTextforSuccess);
    }
}
