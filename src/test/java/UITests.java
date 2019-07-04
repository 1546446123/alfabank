import Pages.MainPage;
import Pages.SearchResultsPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class UITests {

    @Test
    public void SearctDepositTest(){
        MainPage mainPage = open("https://alfabank.ua/ru", MainPage.class);
        String searchValue = "Депозит";
        SearchResultsPage resultsPage =  mainPage.Search(searchValue);
        assertThat(url(), is(String.format("https://alfabank.ua/ru/search?query=%s", Tools.EscapeString(searchValue))));
        String depositsUrl = "https://alfabank.ua/ru/small-business/place-and-multiply/deposits";
        resultsPage.ClickArticleByUrl(depositsUrl);
        assertThat(url(), is(depositsUrl));
    }
}
