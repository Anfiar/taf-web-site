package by.itacademy.kishkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTempoTest extends BaseTest {
    private String itemInBusketExpectedResult = "Пицца \"Маргарита\" (31см)";

    @Test
    public void testOrderMargarita() throws InterruptedException {
        PizzaTempoPage pizzaTempoPage = new PizzaTempoPage(driver);
        pizzaTempoPage.getPage();
        pizzaTempoPage.clickPizzaButton();
        pizzaTempoPage.clickMargaritaSizeButton();
        pizzaTempoPage.clickMargaritaOrderButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickAddToBasketButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickBasketButton();
        Assertions.assertEquals(itemInBusketExpectedResult, pizzaTempoPage.getTextItemInBasket());
    }
}
