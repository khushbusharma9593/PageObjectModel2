package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AppleMacBookProPage extends Utils
{
    public void verifyUserShouldClickOnAppleMacBookOption()
    { //Type Apple MacBook Pro 13-inch Product in the box
        typeText(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]"),"Apple MacBook Pro 13-inch");

        //Click on Search button using xpath
        clickOnElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));


        //Click on Apple MacBook Pro 13-inch Option by using xpath
        //clickOnElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/h2/a"));
        //Check URL of Apple MacBook on next page
        Assert.assertTrue(driver.getCurrentUrl().contains("apple-macbook-pro-13-inch"),"User is NOT on Apple MacBook Pro 13-inch page");

        //Click on Shopping Cart button after anything Add to cart
        clickOnElement(By.xpath("//span[@class=\"cart-label\"]"));
        //Click on Go To Cart button
        clickOnElement(By.xpath("//button[@class=\"button-1 cart-button\"]"));
        //Check URL of the Shopping cart
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"),"User is Not on Shopping Cart Page");


    }

}
