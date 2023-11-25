package by.itacademy.kishkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RwTest {
    @Test
    public void testLoginForm() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        RwPage rwPage = new RwPage(driver);
        rwPage.getPage();
        rwPage.clickLoginForm();
        Thread.sleep(1000);
        Assertions.assertEquals("Авторизация", rwPage.getTextLoginFormCheck());
        driver.quit();
    }

    @Test
    public void testLoginWithEmptyField() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        RwPage rwPage = new RwPage(driver);
        rwPage.getPage();
        rwPage.clickLoginForm();
        Thread.sleep(1000);
        rwPage.clickEnterButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Заполните поле", rwPage.getTextEmailErrorMessage());
        Assertions.assertEquals("Заполните поле", rwPage.getTextPasswordErrorMessage());
        driver.quit();
    }

    @Test
    public void testEmptyPasswordInput() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        RwPage rwPage = new RwPage(driver);
        rwPage.getPage();
        rwPage.clickLoginForm();
        Thread.sleep(1000);
        rwPage.sendKeysEmailInput("t23400est@gmail.com");
        rwPage.clickEnterButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Заполните поле", rwPage.getTextPasswordErrorMessage());
        driver.quit();
    }

    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        RwPage rwPage = new RwPage(driver);
        rwPage.getPage();
        rwPage.clickLoginForm();
        Thread.sleep(1000);
        rwPage.sendKeysEmailInput("t23400est@gmail.com");
        rwPage.sendKeysPasswordInput("12345678");
        rwPage.clickEnterButton();
        Thread.sleep(1000);
        Assertions.assertEquals("Пользователь не найден", rwPage.getTextLoginErrorMessage());
        driver.quit();
    }
}
