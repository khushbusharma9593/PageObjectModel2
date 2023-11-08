package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils
{
public void clickOnRegisterButton()
{
    clickOnElement(By.linkText("Register"));
}
    public void verifyUserIsOnLoginPage()
    {
        //Click on log in button by below css locator
        clickOnElement(By.xpath("//a[@class=\"ico-login\"]"));

        //check the URL of login
        Assert.assertTrue(driver.getCurrentUrl().contains("login"),"User is NOT on Log in page");


    }
public void clickOnSearchButton()
{   //Click on Search button using xpath
    clickOnElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));

}

public void clickOnVoteButton()
{   //Click on vote button by using xpath
    clickOnElement(By.xpath("//button[@id=\"vote-poll-1\"]"));
}



    By _currency = (By.id("customerCurrency"));
public void selectDropDownCurrency() {
    selectByText(_currency, currency);
}


public void verifyCurrencyIsChanged()
{
    SoftAssert softAssert = new SoftAssert();
    List<WebElement> productList = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
    for (WebElement ele : productList){
        System.out.println(ele.getText());
        softAssert.assertTrue(ele.getText().contains("€"),"$ not found"+ele.getText());
        System.out.println("This is Euro currency");


    }
    softAssert.assertAll();
}

public void verifyUserShouldBeClickOnDetailsOptionOfNewRelease()
{   //Click on details option of nopCommerceNewRelease heading
    clickOnElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a[@href=\"/nopcommerce-new-release\"]"));
    //Check URL of New Release Button
    Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce-new-release"),"User is NOT on New Release Page");
}

public void verifyUserShouldClickOnSearchButton()
{     //Type Nike Product in the box
    typeText(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]"),"Nike");

    //Click on Search button using xpath
    clickOnElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));

    //Check URL of the search button
    Assert.assertTrue(driver.getCurrentUrl().contains("search?q=Nike"),"User is NOT on Nike Search Page");

}



}
