package by.itacademy.kishkevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VekTest {
    @Test
    public void testLoginWithEmptyField() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage(driver);

        vekPage.getPage();
        Thread.sleep(1000);
        if (vekPage.findCookieForm() != null) {
            vekPage.clickDeclineCookie();
            vekPage.clickDeclineCookie();
        }

        vekPage.clickAccountFormButton();
        vekPage.clickLoginFormButton();
        Thread.sleep(1000);
        vekPage.clickSubmitButton();

        assertEquals("Электронная почта не указана", vekPage.getTextEmailErrorMessage());
        assertEquals("Пароль не указан", vekPage.getTextPasswordErrorMessage());

        driver.quit();
    }

    @Test
    public void testLoginWithoutEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage(driver);

        vekPage.getPage();
        Thread.sleep(1000);
        if (vekPage.findCookieForm() != null) {
            vekPage.clickDeclineCookie();
            vekPage.clickDeclineCookie();
        }

        vekPage.clickAccountFormButton();
        vekPage.clickLoginFormButton();
        Thread.sleep(1000);
        vekPage.sendKeysPasswordInput("123456789");
        vekPage.clickSubmitButton();

        assertEquals("Электронная почта не указана", vekPage.getTextEmailErrorMessage());

        driver.quit();
    }

    @Test
    public void testLoginWithoutPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage(driver);

        vekPage.getPage();
        Thread.sleep(1000);
        if (vekPage.findCookieForm() != null) {
            vekPage.clickDeclineCookie();
            vekPage.clickDeclineCookie();
        }

        vekPage.clickAccountFormButton();
        vekPage.clickLoginFormButton();
        Thread.sleep(1000);
        vekPage.sendKeysEmailInput("test889@gmail.com");
        vekPage.clickSubmitButton();

        assertEquals("Пароль не указан", vekPage.getTextPasswordErrorMessage());

        driver.quit();
    }

    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        VekPage vekPage = new VekPage(driver);

        vekPage.getPage();
        Thread.sleep(1000);
        if (vekPage.findCookieForm() != null) {
            vekPage.clickDeclineCookie();
            vekPage.clickDeclineCookie();
        }

        vekPage.clickAccountFormButton();
        vekPage.clickLoginFormButton();
        Thread.sleep(1000);
        vekPage.sendKeysEmailInput("test889@gmail.com");
        vekPage.sendKeysPasswordInput("123456789");
        vekPage.clickSubmitButton();
        Thread.sleep(1000);

        assertEquals("Нет такого аккаунта. \n" + "Зарегистрироваться?", vekPage.getTextEmailErrorMessage());

        driver.quit();
    }
}
