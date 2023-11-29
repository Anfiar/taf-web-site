package by.itacademy.kishkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaTempoPage {

    private String url = "https://www.pizzatempo.by/";
    private String pizzaButton = "//img[@alt=\"Пицца\"]";
    private String margaritaOrderButton = "//*[@id=\"1\"]//div[@class=\"order-btn\"]";
    private String margaritaSizeButton = "//*[@id=\"1\"]//div[@class=\"pizza-size choiser\"]//div[3]";
    private String addToBasketButton = "//div[@id=\"order_pizza_popup\"]//div[@class=\"order-btn\"]";
    private String basketButton = "//div[@class=\"basket-top\"]/div[@class=\"bs-price-col\"]";
    private String itemInBasket = "//div[@id=\"basket_expand\"]//div[@class=\"cart-product-name title\"]";
    WebDriver driver;

    public PizzaTempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(url);
    }

    public void clickPizzaButton() {
        driver.findElement(By.xpath(pizzaButton)).click();
    }

    public void clickMargaritaSizeButton() {
        driver.findElement(By.xpath(margaritaSizeButton)).click();
    }

    public void clickMargaritaOrderButton() {
        driver.findElement(By.xpath(margaritaOrderButton)).click();
    }

    public void clickAddToBasketButton() {
        driver.findElement(By.xpath(addToBasketButton)).click();
    }

    public void clickBasketButton() {
        driver.findElement(By.xpath(basketButton)).click();
    }

    public String getTextItemInBasket() {
        return driver.findElement(By.xpath(itemInBasket)).getText();
    }
}
