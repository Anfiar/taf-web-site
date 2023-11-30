package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private String url = "https://dominos.by/";
    private String popup = "//img[@class='popup-banner__image']";
    private String popupClose = "//button[@data-test-type='close']";
    private String margaritaAddToBasketButton = "//div[@data-code='MGRC']//div[@data-test='product-card-actions']";
    private String basketButton = "//div[@class='cart-button']";
    private String itemInBasket = "//div[@class='cart-button__mini-bag-products-wrapper']//div[@class='product-card__title']";
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(url);
    }

    public void clickPopupClose() {
        if (driver.findElement(By.xpath(popup)) != null) {
            driver.findElement(By.xpath(popupClose)).click();
        }
    }

    public void clickMargaritaAddToBasketButton() {
        driver.findElement(By.xpath(margaritaAddToBasketButton)).click();
    }

    public void clickBasketButton() {
        driver.findElement(By.xpath(basketButton)).click();
    }

    public String getTextItemInBasket() {
        return driver.findElement(By.xpath(itemInBasket)).getText();
    }
}
