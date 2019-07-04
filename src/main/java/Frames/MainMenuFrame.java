package Frames;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuFrame extends ElementsContainer {
    @FindBy(xpath="//*[@class='new-search-popup']")
    private SelenideElement searchIcon;

    public void ClickSearch(){
        searchIcon.click();
    }
}
