import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageElements{
    public BasketLogic clickCategory(SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        return page (BasketLogic.class);
    }
}
