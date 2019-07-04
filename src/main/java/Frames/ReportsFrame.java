package Frames;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ReportsFrame extends ElementsContainer {

    @FindBy(xpath="//*[@id='search_articles_container']/a[*]")
    private ElementsCollection articles;

    private SelenideElement getArticleByUrl(String url){
        SelenideElement result = null;
        for (SelenideElement e: articles) {
            String h = e.attr("href");
            if (h.equals(url))
            {
                result = e;
                break;
            }
        }
        return result;
    }

    public void ClickArticleByUrl(String url){
        SelenideElement element = getArticleByUrl(url);
        element.click();
    }
}
