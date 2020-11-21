import org.testng.Assert;
import static com.codeborne.selenide.Condition.text;

public class BasketLogic extends BasketPageElements {

    public BasketLogic addProductInBasket() {
        ProductInBasket.click();
        return this;
    }

    public BasketLogic checkLabelCount() {
        labelCount.shouldHave(text("1"));
        return this;
    }

    public String getTitleFirstProductText() {
        String titleFirstProductText = titleFirstProduct.text();
        return titleFirstProductText;

    }

    public BasketLogic clickBasket() {
        basket.click();
        return this;
    }

    public String getTitleProductInBasket() {
        String titleBasketProductText = titleBasketProduct.text();
        return titleBasketProductText;
    }

    public BasketLogic checkTitleInBasket(String expectedTitleText) {

        String titleBasketProductText = getTitleProductInBasket();

        Assert.assertEquals(titleBasketProductText, expectedTitleText);
        return this;
    }

}
