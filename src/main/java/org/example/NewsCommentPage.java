package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsCommentPage extends Utils
{
    public void verifyUserShouldWriteCommentsOnNopCommerceNewReleasePage()
    {
//type in the box of Title
        typeText(By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]"),"Title is given by Khushbu");
//Type comment in the Comment box
        typeText(By.xpath("//textarea[@class=\"enter-comment-text\"]"),"I want to start my online business");
//Click on New Comment Button
        clickOnElement(By.xpath("//button[@name=\"add-comment\"]"));}

    public void verifyUserAddedNewsCommentsSuccessfully()
    {


        //News comment is added and user can see successful message
        String actualMessageOfComment = getTextFromElement(By.xpath("//div[@class=\"notifications\"]/div"));
        String ExpectedMessageOfComment = "News comment is successfully added.";
        Assert.assertEquals(actualMessageOfComment,ExpectedMessageOfComment,"New comment is NOT Done");
        System.out.println("News comment is successfully added.");


    }
}
