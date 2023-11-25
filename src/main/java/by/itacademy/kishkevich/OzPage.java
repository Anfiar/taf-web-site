package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    private String enterToLoginFormButtonLocator = "//div[@class=\"user-bar__item\"]";
    private String loginFormByEmailLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    private String loginFormEmailInputLocator = "//*[@id=\"loginForm\"]//input[@type=\"email\"]";
    private String loginFormPasswordInputLocator = "//*[@id=\"loginForm\"]//input[@type=\"password\"]";
    private String loginFormSubmitButtonLocator = "//*[@id=\"loginForm\"]/button";
    private String url = "https://oz.by/";
    private String loginErrorMessage = "//*[@id=\"test\"]/div/div";
    private String loginPopupIntroLocator = "//*[@id=\"loginPopupIntro\"]";
    private WebDriver driver;

    public OzPage(WebDriver driver){
        this.driver = driver;
    }

    public void getPage(){
        driver.get(url);
    }

    public void clickLoginFormButton() {
        driver.findElement(By.xpath(enterToLoginFormButtonLocator)).click();
    }

    public void clickLoginFormByEmail() {
        driver.findElement(By.xpath(loginFormByEmailLocator)).click();
    }

    public void sendKeysEmailInput(String email) {
        driver.findElement(By.xpath(loginFormEmailInputLocator)).sendKeys(email);
    }

    public void sendKeysPasswordInput(String password) {
        driver.findElement(By.xpath(loginFormPasswordInputLocator)).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(By.xpath(loginFormSubmitButtonLocator)).click();
    }

    public String getTextLoginError() {
        return driver.findElement(By.xpath(loginErrorMessage)).getText();

    }

    public String getTextPopupIntro() {
        return driver.findElement(By.xpath(loginPopupIntroLocator)).getText();

    }
}
