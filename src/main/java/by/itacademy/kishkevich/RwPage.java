package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RwPage {
    String url = "https://pass.rw.by/ru/";
    String loginForm = "/html/body/div[1]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    String emailInput = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[1]/label/div[2]/input";
    String passwordInput = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[2]/div[1]/div/label/div[2]/input";
    String enterButton = "/html/body/div[1]/div[1]/div[7]/div/div/div[2]/form/fieldset/div[3]/input";
    String emailErrorMessage = "//*[@id=\"login-error\"]";
    String passwordErrorMessage = "//*[@id=\"password-error\"]";
    String loginErrorMessage = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]";
    String loginFormCheck = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    WebDriver driver;

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