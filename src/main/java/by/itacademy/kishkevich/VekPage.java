package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VekPage {
    private String enterToAccountFormButtonLocator = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button";
    private String enterToLoginFormButtonLocator = "//*[@id=\"userToolsDropDown\"]//button";
    private String loginSubmitButtonLocator = "//button[@data-testid=\"loginSubmit\"]";
    private String loginFormEmailInputLocator = "//*[@id=\"login-email\"]";
    private String loginFormPasswordInputLocator = "//*[@id=\"login-password\"]";
    private String url = "https://www.21vek.by/";
    private String loginEmailErrorMessage = "//*[@id=\"default-:r0:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";
    private String loginPasswordErrorMessage = "//*[@id=\"default-:r0:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";
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
