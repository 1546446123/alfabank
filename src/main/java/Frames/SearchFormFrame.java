package Frames;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class SearchFormFrame extends ElementsContainer {

    @FindBy(xpath="//*[@class='search-popup']/form/input")
    private SelenideElement searchInput;

    @FindBy(xpath="//*[@class='search-popup']/form/button")
    private SelenideElement searchBnt;

    public void Search(String text){
        searchInput.setValue(text);
        searchBnt.click();
    }
}
