package biz.svyatoslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    @Test
    public void test0() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String textHeaderXpath = "/html/body/table/tbody/tr[1]/td";
        By textHeaderBy = By.xpath(textHeaderXpath);
        WebElement textHeaderWebElement = webDriver.findElement(textHeaderBy);
        String actual = textHeaderWebElement.getText();
        Assertions.assertTrue(actual.contains("Расчет веса"), "Должно было быть расчёт веса!"); // метод contains() возвращает либо true либо false
    }

    @Test
    public void test1() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath); // стратегия поиска
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("186");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath); // стратегия поиска
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("82");

        String genderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderXpath); // стратегия поиска
        WebElement genderWebElement = webDriver.findElement(genderBy);
        genderWebElement.click();

        String xpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By by = By.xpath(xpath);
        WebElement webElement = webDriver.findElement(by);
        webElement.click();
    }

    @Test
    public void test2() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("186");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath); // стратегия поиска
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("186");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath); // стратегия поиска
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("82");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath); // стратегия поиска
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("18600");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath); // стратегия поиска
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("82");

        String genderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderXpath);
        WebElement genderWebElement = webDriver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath); // стратегия поиска
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("18600");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath); // стратегия поиска
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("82");

        String genderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderXpath);
        WebElement genderWebElement = webDriver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath); // стратегия поиска
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath); // стратегия поиска
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("18600");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath); // стратегия поиска
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("8200");

        String genderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderXpath);
        WebElement genderWebElement = webDriver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = webDriver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = webDriver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.";

        Assertions.assertEquals(expected, actual);
    }
}