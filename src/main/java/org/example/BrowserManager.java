package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
public void openBrowser()
{
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
    driver.manage().window().maximize();
    driver.get("https://demo.nopcommerce.com/");//nopcommerce website


}
    //Create method to close the browser
   // public void closeBrowser()

    //{
      //  driver.quit();
    //}

}

