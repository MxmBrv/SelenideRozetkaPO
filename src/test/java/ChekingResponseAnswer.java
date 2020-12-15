/*
import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ChekingResponseAnswer {

    @Test
    public void checkingResponce() throws IOException {
        open("https://rozetka.com.ua/");
        WebElementsCollection sidebarMenu = (WebElementsCollection) $$(By.xpath("//a[@class='menu-categories__link']"));
        checkingResp(link);

        List<ArrayList> list = new ArrayList<String>;
        for (int i = 0; i < list.size(); i++)
        list.add(i);




    }

    public void checkingResp(String linksOnPage) throws IOException {
        URL url = new URL(linksOnPage);
        HttpsURLConnection http = (HttpsURLConnection)
                url.openConnection();
        int responceCode = http.getResponseCode();
        System.out.println(responceCode);
        if (responceCode != 200) {
            Assert.fail("the status code  is not 200");
        }

    }
}
*/
