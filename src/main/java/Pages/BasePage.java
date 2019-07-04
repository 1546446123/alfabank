package Pages;

import Frames.MainMenuFrame;
import Frames.SearchFormFrame;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class BasePage {

	@FindBy(xpath="//*[@class='container']")
	private MainMenuFrame mainMenu;

	@FindBy(xpath="//*[@class='search-popup']")
    SearchFormFrame searchFormFrame;

    public SearchResultsPage Search(String text){
        mainMenu.ClickSearch();
        searchFormFrame.Search(text);
        return page(SearchResultsPage.class);
    }
}
