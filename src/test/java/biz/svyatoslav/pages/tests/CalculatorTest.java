package biz.svyatoslav.tests;

import biz.svyatoslav.pages.LoginPage;
import biz.svyatoslav.pages.LoginPageMessages;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorTest {

    @Test
    public void test0() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getHeaderText();
        Assertions.assertTrue(loginPage.getHeaderText().contains("Расчёт веса"), "Тексты отличаются");
    }

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_ALL, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_HEIGHT_AND_INVALID_WEIGHT_AND_GENDER, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputHeight("180");
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_AND_INVALID_WEIGHT_AND_GENDER, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputWeight("85");
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_AND_INVALID_HEIGHT_AND_GENDER, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_NAME_AND_INVALID_HEIGHT_AND_WEIGHT, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.sendKeysInputHeight("180");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.INVALID_WEIGHT, loginPage.getErrorMessageText(), "Тексты отличаются");
    }

    @Test
    public void test7() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("20");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.RESULT_LESS_WEIGHT, loginPage.getResultMessageText(), "Тексты отличаются");
    }

    @Test
    public void test8() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("70");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.RESULT_IDEAL_WEIGHT, loginPage.getResultMessageText(), "Тексты отличаются");
    }

    @Test
    public void test9() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("100");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.RESULT_NORMAL_OVER_WEIGHT, loginPage.getResultMessageText(), "Тексты отличаются");
    }

    @Test
    public void test10() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("John");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("150");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        Assertions.assertEquals(LoginPageMessages.RESULT_OVER_WEIGHT, loginPage.getResultMessageText(), "Тексты отличаются");
    }
}