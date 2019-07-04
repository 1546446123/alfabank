package Pages;

import Frames.ReportsFrame;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {
	@FindBy(xpath="//*[@class='search_reports_tabs js_tabs'] ")
	private ReportsFrame reportsFrame;

	public void ClickArticleByUrl(String url){
	    reportsFrame.ClickArticleByUrl(url);
    }

}
