package by.itacademy.kishkevich;

import by.itacademy.kishkevich.pages.PizzaTempoPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTempoTest extends BaseTest {
    private String pizzaInBusketExpectedResult = "Пицца 'Маргарита' (31см)";
    private String drinkInBusketExpectedResult = "Вода мин. Бонаква среднегазированая 1л";

    @Test
    public void testOrderMargarita() throws InterruptedException {
        PizzaTempoPage pizzaTempoPage = new PizzaTempoPage();
        pizzaTempoPage.getPage();
        pizzaTempoPage.clickPizzaButton();
        pizzaTempoPage.clickMargaritaSizeButton();
        pizzaTempoPage.clickMargaritaOrderButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickAddToBasketButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickBasketButton();
        Assertions.assertEquals(pizzaInBusketExpectedResult, pizzaTempoPage.getTextPizzaInBasket());
    }

    @Test
    public void testOrderMargaritaAndBonaqua() throws InterruptedException {
        PizzaTempoPage pizzaTempoPage = new PizzaTempoPage();
        pizzaTempoPage.getPage();
        pizzaTempoPage.clickPizzaButton();
        pizzaTempoPage.clickMargaritaSizeButton();
        pizzaTempoPage.clickMargaritaOrderButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickAddToBasketButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickDrinkButton();
        pizzaTempoPage.clickBonuaquaOrderButton();
        Thread.sleep(1000);
        pizzaTempoPage.clickBasketButton();
        Assertions.assertEquals(pizzaInBusketExpectedResult, pizzaTempoPage.getTextPizzaInBasket());
        Assertions.assertEquals(drinkInBusketExpectedResult, pizzaTempoPage.getTextDrinkInBasket());
    }
}
