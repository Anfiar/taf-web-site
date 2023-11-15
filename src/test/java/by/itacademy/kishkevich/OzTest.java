package by.itacademy.kishkevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OzTest {
    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        OzPage ozPage = new OzPage();
        driver.get(ozPage.url);
        driver.findElement(By.xpath(ozPage.enterToLoginFormButtonLocator)).click();
        driver.findElement(By.xpath(ozPage.loginFormByEmailLocator)).click();
        driver.findElement(By.xpath(ozPage.loginFormEmailInputLocator)).sendKeys("test99@gmail.com");
        driver.findElement(By.xpath(ozPage.loginFormPasswordInputLocator)).sendKeys("12345");
        driver.findElement(By.xpath(ozPage.loginFormSubmitButtonLocator)).click();
        Thread.sleep(1000);
        assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", driver.findElement(By.xpath(ozPage.loginErrorMessage)).getText());
        driver.quit();
    }

    @Test
    public void testEnterButton() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        OzPage ozPage = new OzPage();
        driver.get(ozPage.url);
        driver.findElement(By.xpath(ozPage.enterToLoginFormButtonLocator)).click();
        Thread.sleep(1000);
        assertEquals("Вход", driver.findElement(By.xpath(ozPage.loginPopupIntroLocator)).getText());
        driver.quit();
    }
}
