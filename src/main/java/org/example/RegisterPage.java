
//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium.By
import org.openqa.selenium.By;
//Assertions in TestNG is Use to verify that the expected result and the actual result matched or not.
import org.testng.Assert;

import static org.example.BasePage.driver;

//extends keyword Is used to Inherit child class(RegisterPage) from parent class(Utils).
public class RegisterPage extends Utils{
    //we can access the members of a class within the class itself nd we can't access them outside the class.
//By.className Initializes a new instance of the By class.
//By.id locate a particular web element using the value of its id attribute.
//By.name to identify the elements of a webpage
    String reg = "register";
    private By _icoregister = By.className("ico-register");
    private By _genderField = By.id("gender-Female");
    private By _firstNameField = By.id("FirstName");
    private By _lastNameField = By.id("LastName");
    private By _DateOfBirthDateField = By.name("DateOfBirthDay");
    private By _DateOfBirthMonthField = By.name("DateOfBirthMonth");
    private By _DateOfBirthYear = By.name("DateOfBirthYear");
    private By _emailField = By.id("Email");
    private By _CompanyField = By.id("Company");
    private By _NewsLetterField = By.id("Newsletter");
    private By _PasswordField = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButtonField = By.id("register-button");
    public void verifyUserIsOnRegistrationPage(){
//AssertFalse method asserts that a specified condition is false
        Assert.assertEquals(reg, "register", "Your registration completed");
    }

    public void enterRegistrationDetails(){
        //.clickOnElement() command works to simulate user click
        clickOnElement(_icoregister);
        clickOnElement(_genderField);
        //to input content in editable text fields or password fields in a webpage.
        typeText(_firstNameField,"Mansi");
        typeText(_lastNameField,"Patel");
        //The <select> element is used to create a drop-down list.
        selectFromDropdownByVisibleText(_DateOfBirthDateField,"31");
        selectFromDropdownByVisibleText(_DateOfBirthMonthField,"July");
        selectFromDropdownByVisibleText(_DateOfBirthYear,"1994");
        typeText(_emailField,"Mansi" +getTimeStamp()+"@yahoo.com");
        typeText(_CompanyField,"Demo Company");
        clickOnElement(_NewsLetterField);
        typeText(_PasswordField,"Mansi Patel");
        typeText(_ConfirmPassword,"Mansi Patel");
        WaitForElementToBeClickable(_registerSubmitButtonField,50);
        clickOnElement(_registerSubmitButtonField);
    }


}
