package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils
{   //Create method
    public void verifyUserIsOnRegisterPage()
    {
        //click on Register button
        clickOnElement(By.id("register-button"));  //click on register button by using reusability method
        //Enter URL of register button
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is NOT on register page");
    }
    //Create method
    public void enterRegistrationDetails()
    {
        //clicking on male option by using this method
        clickOnElement(By.id("gender-male"));

        //enter first name by using typeText method
        typeText(By.name("FirstName"), "Raj");

        //enter last name by using typeText method
        typeText(By.name("LastName"), "Verma");

        //Create object of selectDay
        selectByText(By.name("DateOfBirthDay"), "21");

        //Create object of selectMonth
        selectByText(By.name("DateOfBirthMonth"), "May");

        //Create object of selectYear
        selectByText(By.name("DateOfBirthYear"), "1995");

        //enter email id
        typeText(By.name("Email"), email);

        //enter password  by using typeText method
        typeText(By.name("Password"), password);

        //enter confirm password  by using typeText method
        typeText(By.name("ConfirmPassword"), password);

        //click on register button fill all the information by using this method
        clickOnElement(By.id("register-button"));


    }



}
