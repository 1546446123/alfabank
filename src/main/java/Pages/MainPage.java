package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
	@FindBy(xpath="//*[@class='new-search-popup']")
	private SelenideElement searchIcon;

	@FindBy(xpath="//*[@class='search-popup']/form/input")
	private SelenideElement searchInput;

    @FindBy(xpath="//*[@class='search-popup']/form/button")
	private SelenideElement searchBnt;

    public void Search1(String text){
        searchIcon.click();
        searchInput.setValue(text);
        searchBnt.click();
    }
}
