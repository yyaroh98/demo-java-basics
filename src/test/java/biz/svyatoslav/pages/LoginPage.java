package biz.svyatoslav.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCalculate() {
        By buttonCalculateBy = By.xpath(LoginPageXpath.BUTTON_CALCULATE_XPATH);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    public void sendKeysInputName(String name) {
        By inputNameBy = By.xpath(LoginPageXpath.INPUT_NAME_XPATH);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys(name);
    }

    public void sendKeysInputWeight(String weight) {
        By inputWeightBy = By.xpath(LoginPageXpath.INPUT_WEIGHT_XPATH);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys(weight);
    }

    public void sendKeysInputHeight(String height) {
        By inputWeightBy = By.xpath(LoginPageXpath.INPUT_HEIGHT_XPATH);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys(height);
    }

    public void selectGenderMale() {
        By genderMaleBy = By.xpath(LoginPageXpath.GENDER_MALE_XPATH);
        WebElement genderMaleWebElement = driver.findElement(genderMaleBy);
        genderMaleWebElement.click();
    }

    public String getErrorMessageText() {
        By errorMessageBy = By.xpath(LoginPageXpath.ERROR_MESSAGE_XPATH);
        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);
        return errorMessageWebElement.getText();
    }

    public String getResultMessageText() {
        By messageBy = By.xpath(LoginPageXpath.MESSAGE_XPATH);
        WebElement messageWebElement = driver.findElement(messageBy);
        return messageWebElement.getText();
    }

    public String getHeaderText() {
        By textHeaderBy = By.xpath(LoginPageXpath.TEXT_HEADER_XPATH);
        WebElement textHeaderWebElement = driver.findElement(textHeaderBy);
        return textHeaderWebElement.getText();
    }
}