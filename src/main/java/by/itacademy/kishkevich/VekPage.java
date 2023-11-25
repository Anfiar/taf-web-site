package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VekPage {
    private String enterToAccountFormButtonLocator = "//button[@class=\"styles_userToolsToggler__c2aHe\"]";
    private String enterToLoginFormButtonLocator = "//button[@data-testid=\"loginButton\"]";
    private String loginSubmitButtonLocator = "//button[@data-testid=\"loginSubmit\"]";
    private String loginFormEmailInputLocator = "//*[@id=\"login-email\"]";
    private String loginFormPasswordInputLocator = "//*[@id=\"login-password\"]";
    private String url = "https://www.21vek.by/";
    private String loginEmailErrorMessage = "//div[1]/div[3]/span[@class=\"ErrorMessage-module__message\"]";
    private String loginPasswordErrorMessage = "//div[2]/div[3]/span[@class=\"ErrorMessage-module__message\"]";
    private String declineCookieFormLocator = "//*[@id=\"modal-cookie\"]//button[2]";
    private String cookieFormLocator = "//*[@id=\"modal-cookie\"]/div";
    private WebDriver driver;

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
