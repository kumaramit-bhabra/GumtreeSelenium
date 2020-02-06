package testPages;

import Base.TestBase;
import Pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultPageTest extends TestBase
{

    SearchResultPage searchResultPage = new SearchResultPage();

    @Then("search result window should be displayed")
    public void isSearchResultWindowDisplayedTest() throws InterruptedException
    {

        searchResultPage.validateSearchResultWindowTitle();
    }

    @And("Identify links having {string} in the URL")
    public void identifyLinkHavingText(String filter)
    {
        searchResultPage.identifyLink(filter);
    }

    @And("Click on each link")
    public void clickOnEachLink()
    {
        searchResultPage.clickOnLink();
    }

    @And("For each opened link validate title and count displayed")
    public void validateTheTitleAndCount() throws InterruptedException {
        searchResultPage.validateTitleAndCount();
    }
}
