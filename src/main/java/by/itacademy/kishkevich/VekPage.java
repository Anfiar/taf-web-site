package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VekPage {
    String enterToAccountFormButtonLocator = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button";
    String enterToLoginFormButtonLocator = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    String loginSubmitButtonLocator = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    String loginFormEmailInputLocator = "//*[@id=\"login-email\"]";
    String loginFormPasswordInputLocator = "//*[@id=\"login-password\"]";
    String url = "https://www.21vek.by/";
    String loginEmailErrorMessage = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    String loginPasswordErrorMessage = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]";
    String declineCookieFormLocator = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[2]";
    String cookieFormLocator = "//*[@id=\"modal-cookie\"]/div";
    WebDriver driver;

    public VekPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(url);
    }

    public void clickAccountFormButton() {
        driver.findElement(By.xpath(enterToAccountFormButtonLocator)).click();
    }

    public void clickLoginFormButton() {
        driver.findElement(By.xpath(enterToLoginFormButtonLocator)).click();
    }

    public void clickSubmitButton() {
        driver.findElement(By.xpath(loginSubmitButtonLocator)).click();
    }

    public void sendKeysEmailInput(String email) {
        driver.findElement(By.xpath(loginFormEmailInputLocator)).sendKeys(email);
    }

    public void sendKeysPasswordInput(String password) {
        driver.findElement(By.xpath(loginFormPasswordInputLocator)).sendKeys(password);
    }

    public String getTextEmailErrorMessage() {
        return driver.findElement(By.xpath(loginEmailErrorMessage)).getText();
    }

    public String getTextPasswordErrorMessage() {
        return driver.findElement(By.xpath(loginPasswordErrorMessage)).getText();
    }

    public void clickDeclineCookie() {
        driver.findElement(By.xpath(declineCookieFormLocator)).click();
    }

    public WebElement findCookieForm() {
        return driver.findElement(By.xpath(cookieFormLocator));
    }
}
