package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RwPage {
    private String url = "https://pass.rw.by/ru/";
    private String loginForm = "/html/body/div[1]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    private String emailInput = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[1]/label/div[2]/input";
    private String passwordInput = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String enterButton = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[3]/input";
    private String emailErrorMessage = "//*[@id=\"login-error\"]";
    private String passwordErrorMessage = "//*[@id=\"password-error\"]";
    private String loginErrorMessage = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]";
    private String loginFormCheck = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private WebDriver driver;

    public RwPage(WebDriver driver) {
        this.driver = driver;
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
