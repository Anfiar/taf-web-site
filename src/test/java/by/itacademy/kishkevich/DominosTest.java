package by.itacademy.kishkevich;

import by.itacademy.kishkevich.pages.DominosPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest {
    private String itemInOrderExpectedResult = "Маргарита";

    @Test
    public void testMargaritaOrder() {
        DominosPage dominosPage = new DominosPage();
        dominosPage.getPage();
        dominosPage.clickPopupClose();
        dominosPage.clickMargaritaAddToBasketButton();
        dominosPage.clickBasketButton();
        Assertions.assertEquals(itemInOrderExpectedResult, dominosPage.getTextItemInBasket());
    }
}
