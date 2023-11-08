package org.example;

import org.testng.annotations.Test;

import java.time.Duration;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LogInPage logInPage=new LogInPage();
    NewsCommentPage newsCommentPage= new NewsCommentPage();
    NikeSearchPage nikeSearchPage = new NikeSearchPage();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Test
    public void verifyUserShouldBeLoginSuccessfully()
    {
        homePage.verifyUserIsOnLoginPage();
        logInPage.verifyUserShouldAbleToLogInSuccessfully();

    }


    @Test
    public void verifyUserShouldBeAbleToAcceptAlertMessageOnSearchButtonSuccessfully()
    {
        homePage.clickOnSearchButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//Using below method to Accept PopUp message
        driver.switchTo().alert().accept();
    }
    @Test
    public void verifyUserShouldBeAbleToAcceptAlertMessageOnVoteButtonSuccessfully()
    {
        homePage.clickOnVoteButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        //Using getText method to Alert PopUp message
        String voteText = driver.switchTo().alert().getText();
        System.out.println(voteText);



    }
    @Test
    public void verifyUserShouldBeAbleToChangeCurrencySuccessfully(){
        homePage.selectDropDownCurrency();
        homePage.verifyCurrencyIsChanged();
    }
    @Test
    public void verifyUserShouldBeAbleToAddedNewsCommentsSuccessfully()
    {
        homePage.verifyUserShouldBeClickOnDetailsOptionOfNewRelease();
        newsCommentPage.verifyUserShouldWriteCommentsOnNopCommerceNewReleasePage();
        newsCommentPage.verifyUserAddedNewsCommentsSuccessfully();
    }
    @Test
    public void verifyUserShouldBeAbleToSeeAllNikeProductsSuccessfully()
    {
        homePage.verifyUserShouldClickOnSearchButton();
        //driver.switchTo().alert().accept();
        nikeSearchPage.verifyUserShouldSeeAllNikeProduct();

    }
}

