package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OzPage {
    String enterToLoginFormButtonLocator = "//*[@id=\"top-page\"]/header/div[1]/div/div[1]/a";
    String loginFormByEmailLocator = "//*[@id=\"loginFormLoginEmailLink\"]";
    String loginFormEmailInputLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[1]/input";
    String loginFormPasswordInputLocator = "//*[@id=\"loginForm\"]/div[2]/div[1]/div[2]/input";
    String loginFormSubmitButtonLocator = "//*[@id=\"loginForm\"]/button";
    String url = "https://oz.by/";
    String loginErrorMessage = "/html/body/div[1]/div/div/div[1]/div/div/div[1]/div[3]/div/div[1]/form/div[2]/div[2]/div/div/div";
    String loginPopupIntroLocator = "//*[@id=\"loginPopupIntro\"]";
    WebDriver driver;

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
