package by.itacademy.kishkevich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OzTest {
    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        OzPage ozPage = new OzPage(driver);

        ozPage.getPage();
        ozPage.clickLoginFormButton();
        ozPage.clickLoginFormByEmail();
        ozPage.sendKeysEmailInput("test99@gmail.com");
        ozPage.sendKeysPasswordInput("12345");
        ozPage.clickSubmitButton();
        Thread.sleep(1000);

        assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", ozPage.getTextLoginError());

        driver.quit();
    }

    @Test
    public void testEnterButton() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        OzPage ozPage = new OzPage(driver);

        ozPage.getPage();
        ozPage.clickLoginFormButton();
        Thread.sleep(1000);

        assertEquals("Вход", ozPage.getTextPopupIntro());

        driver.quit();
    }
}
