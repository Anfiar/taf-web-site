package by.itacademy.kishkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {

    private final String loginFormCheckExpectedResult = "Вход";
    private final String emptyEmailTestExpectedResult = "Пожалуйста, заполните поле (Эл. почта)";
    private final String incorrectEmailTestExpectedResult = "Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com";
    private final String emptyPasswordTestExpectedResult = "Пожалуйста, заполните поле (Пароль)";
    private final String notRegisteredUserExpectedResult = "Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.";


    @Test
    public void testLoginForm() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.getPage();
        kvitkiPage.acceptCookieDialog();
        kvitkiPage.clickLoginForm();
        Assertions.assertEquals(loginFormCheckExpectedResult, kvitkiPage.getTextLoginFormCheck());
        driver.quit();
    }

    @Test
    public void testEmptyEmailInput() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.getPage();
        kvitkiPage.acceptCookieDialog();
        kvitkiPage.clickLoginForm();
        Thread.sleep(8000);
        kvitkiPage.clickEmailInput();
        kvitkiPage.clickPasswordInput();
        Thread.sleep(1000);
        Assertions.assertEquals(emptyEmailTestExpectedResult, kvitkiPage.getTextEmailErrorMessage());
        driver.quit();
    }

    @Test
    public void testEmptyPasswordInput() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.getPage();
        kvitkiPage.acceptCookieDialog();
        kvitkiPage.clickLoginForm();
        Thread.sleep(8000);
        kvitkiPage.clickPasswordInput();
        kvitkiPage.clickEmailInput();
        Thread.sleep(1000);
        Assertions.assertEquals(emptyPasswordTestExpectedResult, kvitkiPage.getTextPasswordErrorMessage());
        driver.quit();
    }

    @Test
    public void testIncorrectEmailInput() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.getPage();
        kvitkiPage.acceptCookieDialog();
        kvitkiPage.clickLoginForm();
        Thread.sleep(8000);
        kvitkiPage.sendKeysEmailInput("text");
        kvitkiPage.clickPasswordInput();
        Thread.sleep(1000);
        Assertions.assertEquals(incorrectEmailTestExpectedResult, kvitkiPage.getTextEmailErrorMessage());
        driver.quit();
    }

    @Test
    public void testLoginByNotRegisteredUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.getPage();
        kvitkiPage.acceptCookieDialog();
        kvitkiPage.clickLoginForm();
        Thread.sleep(8000);
        kvitkiPage.sendKeysEmailInput("t23400est@gmail.com");
        Thread.sleep(8000);
        kvitkiPage.sendKeysPasswordInput("12457678");
        kvitkiPage.clickEnterButton();
        Thread.sleep(1000);
        Assertions.assertEquals(notRegisteredUserExpectedResult, kvitkiPage.getTextLoginErrorMessage());
        driver.quit();
    }
}
