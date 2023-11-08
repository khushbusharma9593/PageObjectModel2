package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AppleMacBookCheckOutPage extends Utils
{
public void verifyUserShouldAddToCartAppleMacBookPro()
{
    //Quantity is allowed minimum 2
    typeText(By.xpath("//input[@id=\"product_enteredQuantity_4\"]"),"2");

    //Click on Add to Cart button for purchasing Apple  MacBook Pro 13-inch
    //clickOnElement(By.xpath("//button[@id=\"add-to-cart-button-4\"]"));
    //Tick in the checkbox of terms and condition
driver.findElement(By.xpath("//label[@for=\"termsofservice\"]")).isSelected();
    //Click on CheckOut button
    clickOnElement(By.id("checkout"));
    //After click on CheckOut button new URL is opened
    Assert.assertTrue(driver.getCurrentUrl().contains("onepagecheckout"),"User is on Checkout Page");

}
public void verifyUserShouldFillAllDetailsRegardingCheckoutProcess()
{//Tick in the box of Ship to the same address
    driver.findElement(By.xpath("//label[@for=\"ShipToSameAddress\"]")).isSelected();


    //Select Country Name from dropdown
    selectByText(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"),"United Kingdom");
    //Write City name
    typeText(By.xpath("//input[@name=\"BillingNewAddress.City\"]"),"London");
    //Write Address 1
    typeText(By.name("BillingNewAddress.Address1"),"123, Winter Road");
    //Type Zip /postal code in the box
    typeText(By.id("BillingNewAddress_ZipPostalCode"),"AB12 XZ");
    //Type Phone number in the box
    typeText(By.id("BillingNewAddress_PhoneNumber"),"07878787878");
    //Click on Continue Button
    clickOnElement(By.xpath("//button[@onclick=\"Billing.save()\"]"));
    //Find locator of Shipping method
    clickOnElement(By.xpath("//div[@class=\"page-body checkout-data\"]/ol/li[3]"));
    //Click on Continue Button for shipping method
    clickOnElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]"));


}
public void verifyUserIsOnPaymentMethodOption()
{//Find locator of Payment Method
    clickOnElement(By.xpath("//div[@class=\"page-body checkout-data\"]/ol/li[4]"));

    //Click on credit card option
    clickOnElement(By.xpath("//input[@value=\"Payments.Manual\"]"));
    //click on Continue Button
    clickOnElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]"));


}
}
