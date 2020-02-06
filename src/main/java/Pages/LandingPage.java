package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class LandingPage extends TestBase
{
    SearchResultPage searchResultPage;

    public LandingPage()
    {
        super();
        initialization();
    }

    public boolean validateLandingPage()
    {
        boolean lp = false;
        lp = driver.getTitle().equals(dataFactory.getProperty("landingPgTitle"));
        return lp;
    }

    public SearchResultPage searchByKeywordAndSelect(String keyword)
    {
        String searchListText;
        WebElement searchTxtBox = driver.findElement(By.cssSelector(dataFactory.getProperty("landingPgSearchTxtBox")));
        searchTxtBox.sendKeys(keyword);

        List<WebElement> searchList= driver.findElements(By.cssSelector(dataFactory.getProperty("landingPgSearchList")));


        for(int i = 0; i<searchList.size(); i++)
        {
            searchListText = searchList.get(i).getText();
            if (searchListText.equalsIgnoreCase(keyword))
            {
                searchList.get(i).click();
                searchResultPage = new SearchResultPage();
                break;
            }
        }
        //return new SearchResultPage();
        return searchResultPage;
    }

}
