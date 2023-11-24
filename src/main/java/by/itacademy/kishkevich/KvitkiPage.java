package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    String url = "https://www.kvitki.by";
    String cookieDialog = "//*[@id=\"CybotCookiebotDialog\"]";
    String cookieDialogAccept = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    String loginForm = "/html/body/div[3]/div[2]/div/app-user-account-link";
    String loginFormCheck = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    String emailInput = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    String passwordInput = "/html/body/div[8]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div/input";
    String enterButton = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-ui-button/button";
    String emailErrorMessage = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error";
    String passwordErrorMessage = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error";
    String loginErrorMessage = "//*[@id=\"mat-mdc-dialog-1\"]/div/div/app-info-dialog-content/div[3]";
    WebDriver driver;

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





