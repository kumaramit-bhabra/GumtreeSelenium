package Pages;

import Base.TestBase;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import util.CommonMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SearchResultPage extends TestBase
{
    ArrayList<WebElement> urlListWithSearch = new ArrayList<>();
    CommonMethod commonMethod = new CommonMethod();
    SoftAssert softAssert = new SoftAssert();

    public void validateSearchResultWindowTitle()
    {
        driver.getTitle();
    }

    public void identifyLink(String filter)
    {
        List <WebElement> urlList = driver.findElements(By.cssSelector(dataFactory.getProperty("searchResultPageUrlLink")+filter+"]"));

        for(int i = 0 ; i <urlList.size(); i++)
        {
            String url = urlList.get(i).getAttribute("href");

            if (!url.contains("google"))
            {
                urlListWithSearch.add(urlList.get(i));
            }
        }
    }

    public void clickOnLink()
    {
        for (int j = 0; j < urlListWithSearch.size() ; j++)
        {
            String urlToBeOpened = "";
            urlToBeOpened = urlListWithSearch.get(j).getAttribute("href");

            /* Cast webdriver object to Javascript Executor object. */
            JavascriptExecutor jsExecutor = (JavascriptExecutor)this.driver;

            /* Javascript that will create new Tab Window. */
            String jsOpenNewWindow = "window.open('"+urlToBeOpened+"');";
            jsExecutor.executeScript(jsOpenNewWindow);
        }
    }

    public void validateTitleAndCount() throws InterruptedException
    {
        Set<String> windowHandleSet = this.driver.getWindowHandles();

        if(windowHandleSet!=null)
        {
            Iterator<String> it = windowHandleSet.iterator();
            int windowIterator = 0;

            while(it.hasNext())
            {
                boolean title = false;
                boolean count = false;
                String windowHandleStr = it.next();
                String totalCountHavingText = "";
                int totalPrdCountWithOutComma = 0;
                String pageTitle;

                if (windowIterator > 0)
                {
                    this.driver.switchTo().window(windowHandleStr);
                    Thread.sleep(10000);
                    pageTitle = this.driver.getTitle();

                    if(pageTitle.length() > 0)
                    {
                        title = true;
                        softAssert.assertTrue(title, "Page is not having any title");
                    }
                    totalCountHavingText = this.driver.findElement(By.cssSelector(dataFactory.getProperty("countText"))).getText();
                    totalPrdCountWithOutComma = commonMethod.getNumberExtractFromText(totalCountHavingText);

                    if(totalPrdCountWithOutComma > 0)
                    {
                        count = true;
                        softAssert.assertTrue(count, "Count is zero");
                    }
                    softAssert.assertAll();
                    this.driver.close();
                }
                windowIterator++;
            }
        }
    }
}