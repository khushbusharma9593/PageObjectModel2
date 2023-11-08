package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NikeSearchPage extends Utils
{
public void verifyUserShouldSeeAllNikeProduct()
{
    List<WebElement> titles= driver.findElements(By.xpath("//div[@class=\"details\"]/h2"));
    System.out.println(titles.size());
    List<String>producttitleList =new ArrayList<>();
   for (WebElement ele : titles)
{
    System.out.println(ele.getText());
}
}
}
