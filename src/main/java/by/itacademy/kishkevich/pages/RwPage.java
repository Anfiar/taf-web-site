package by.itacademy.kishkevich.pages;

import by.itacademy.kishkevich.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RwPage {
    private String url = "https://pass.rw.by/ru/";
    private String loginForm = "//a[@data-target=\"#auth-popup\"]";
    private String emailInput = "//input[@name=\"login\"]";
    private String passwordInput = "//input[@name=\"password\"]";
    private String enterButton = "//input[@name=\"dologin\"]";
    private String emailErrorMessage = "//*[@id=\"login-error\"]";
    private String passwordErrorMessage = "//*[@id=\"password-error\"]";
    private String loginErrorMessage = "//div[@class=\"danger standalone\"]";
    private String loginFormCheck = "//div[@class=\"auth-modal__title h3\"]";
    private WebDriver driver;

    public RwPage() {
        this.driver = MyDriver.getDriver();
    }

    public void getPage() {
        driver.get(url);
    }

    public void clickLoginForm() {
        driver.findElement(By.xpath(loginForm)).click();
    }

    public void sendKeysEmailInput(String email) {
        driver.findElement(By.xpath(emailInput)).sendKeys(email);
    }

    public void sendKeysPasswordInput(String password) {
        driver.findElement(By.xpath(passwordInput)).sendKeys(password);
    }

    public void clickEnterButton() {
        driver.findElement(By.xpath(enterButton)).click();
    }

    public String getTextEmailErrorMessage() {
        return driver.findElement(By.xpath(emailErrorMessage)).getText();
    }

    public String getTextPasswordErrorMessage() {
        return driver.findElement(By.xpath(passwordErrorMessage)).getText();
    }

    public String getTextLoginFormCheck() {
        return driver.findElement(By.xpath(loginFormCheck)).getText();
    }

    public String getTextLoginErrorMessage() {
        return driver.findElement(By.xpath(loginErrorMessage)).getText();
    }
}
