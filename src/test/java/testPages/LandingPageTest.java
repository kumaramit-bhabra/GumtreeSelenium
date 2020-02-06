package testPages;

import Base.TestBase;
import Pages.LandingPage;
import Pages.SearchResultPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;

public class LandingPageTest extends TestBase
{
    LandingPage landingPage = new LandingPage();
    SearchResultPage searchResultPage;

    @Given("^user is on landing page$")
    public void isUserOnLandingPageTest()
    {
        Assert.assertTrue("User is not on the landing Page",landingPage.validateLandingPage());
    }

    @And("search for product by entering text {string} and selects it")
    public void search_for_product_by_entering_text(String keyword){
        searchResultPage = landingPage.searchByKeywordAndSelect(keyword);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
