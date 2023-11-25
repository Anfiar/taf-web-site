package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String url = "https://www.kvitki.by";
    private String cookieDialog = "//div[@id=\"CybotCookiebotDialog\"]";
    private String cookieDialogAccept = "//button[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String loginForm = "//app-user-account-link[@tabindex=\"0\"]";
    private String loginFormCheck = "//*[@id=\"mat-tab-label-0-0\"]//span[@class=\"mdc-tab__text-label\"]";
    private String emailInput = "//input[@type=\"email\"]";
    private String passwordInput = "//input[@type=\"password\"]";
    private String enterButton = "//button[@class=\"ng-tns-c28-4\"]";
    private String emailErrorMessage = "//app-email-input/app-field-error";
    private String passwordErrorMessage = "//app-password-input/app-field-error";
    private String loginErrorMessage = "//div[@class=\"info-text\"]";
    private WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(url);
    }

    public void acceptCookieDialog() {
        if (driver.findElement(By.xpath(cookieDialog)) != null) {
            driver.findElement(By.xpath(cookieDialogAccept)).click();
        }
    }

    public void clickLoginForm() {
        driver.findElement(By.xpath(loginForm)).click();
    }

    public void clickEmailInput() {
        driver.findElement(By.xpath(emailInput)).click();
    }

    public void clickPasswordInput() {
        driver.findElement(By.xpath(passwordInput)).click();
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
