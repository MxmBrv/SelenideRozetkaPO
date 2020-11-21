import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPageElements {
    SelenideElement ProductInBasket = $(By.xpath("(//button[contains(@class,'buy-button')])[1]"));
    SelenideElement labelCount = $(By.xpath("//span[@class='header-actions__button-counter']"));
    SelenideElement titleFirstProduct = $(By.xpath("(//a[@class='goods-tile__heading'])[1]"));
    SelenideElement basket = $(By.xpath("//li[@class='header-actions__item header-actions__item_type_cart']"));
    SelenideElement titleBasketProduct = $(By.xpath("//a[@class ='cart-product__title']"));
}
