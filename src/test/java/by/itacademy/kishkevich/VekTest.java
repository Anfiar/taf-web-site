package by.itacademy.kishkevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VekTest {
    @Test
    public void testLoginWithEmptyField() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage();
        driver.get(vekPage.url);

        if (driver.findElement(By.xpath(vekPage.cookieFormLocator)) != null) {
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
        }

        driver.findElement(By.xpath(vekPage.enterToAccountFormButtonLocator)).click();
        driver.findElement(By.xpath(vekPage.enterToLoginFormButtonLocator)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(vekPage.loginSubmitButtonLocator)).click();
        assertEquals("Электронная почта не указана", driver.findElement(By.xpath(vekPage.loginEmailErrorMessage)).getText());
        assertEquals("Пароль не указан", driver.findElement(By.xpath(vekPage.loginPasswordErrorMessage)).getText());
        driver.quit();
    }

    @Test
    public void testLoginWithoutEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage();
        driver.get(vekPage.url);

        if (driver.findElement(By.xpath(vekPage.cookieFormLocator)) != null) {
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
        }

        driver.findElement(By.xpath(vekPage.enterToAccountFormButtonLocator)).click();
        driver.findElement(By.xpath(vekPage.enterToLoginFormButtonLocator)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(vekPage.loginFormPasswordInputLocator)).sendKeys("123456789");
        driver.findElement(By.xpath(vekPage.loginSubmitButtonLocator)).click();
        assertEquals("Электронная почта не указана", driver.findElement(By.xpath(vekPage.loginEmailErrorMessage)).getText());
        driver.quit();
    }

    @Test
    public void testLoginWithoutPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage();
        driver.get(vekPage.url);

        if (driver.findElement(By.xpath(vekPage.cookieFormLocator)) != null) {
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
        }

        driver.findElement(By.xpath(vekPage.enterToAccountFormButtonLocator)).click();
        driver.findElement(By.xpath(vekPage.enterToLoginFormButtonLocator)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(vekPage.loginFormEmailInputLocator)).sendKeys("test889@gmail.com");
        driver.findElement(By.xpath(vekPage.loginSubmitButtonLocator)).click();
        assertEquals("Пароль не указан", driver.findElement(By.xpath(vekPage.loginPasswordErrorMessage)).getText());
        driver.quit();
    }

    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage();
        driver.get(vekPage.url);

        if (driver.findElement(By.xpath(vekPage.cookieFormLocator)) != null) {
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
            driver.findElement(By.xpath(vekPage.declineCookieFormLocator)).click();
        }

        driver.findElement(By.xpath(vekPage.enterToAccountFormButtonLocator)).click();
        driver.findElement(By.xpath(vekPage.enterToLoginFormButtonLocator)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(vekPage.loginFormEmailInputLocator)).sendKeys("test889@gmail.com");
        driver.findElement(By.xpath(vekPage.loginFormPasswordInputLocator)).sendKeys("123456789");
        driver.findElement(By.xpath(vekPage.loginSubmitButtonLocator)).click();
        Thread.sleep(1000);
        assertEquals("Нет такого аккаунта. \n" +
                "Зарегистрироваться?", driver.findElement(By.xpath(vekPage.loginEmailErrorMessage)).getText());
        driver.quit();
    }
}
