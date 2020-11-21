import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestWithPageObject {
    private String titleFirstProductText;

    @BeforeMethod
    public void before() {
        com.codeborne.selenide.Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testSelenide() {

        titleFirstProductText = new MainPageLogic().clickOnCategoryJS()
                .clickCategory(new CategoryPageLogic().laptopCategory)
                .getTitleFirstProductText();
        new BasketLogic().addProductInBasket()
                .checkLabelCount()
                .clickBasket()
                .checkTitleInBasket(titleFirstProductText);
    }
}
