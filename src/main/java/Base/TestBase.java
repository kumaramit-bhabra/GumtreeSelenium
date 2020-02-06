package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static WebDriver driver;
    public static Properties configProp;
    public static Properties dataFactory;

    public TestBase()
    {
        try
        {
            configProp = new Properties();
            dataFactory = new Properties();
            FileInputStream fisConfig = new FileInputStream("src//main//java//config//config.properties");
            FileInputStream fisDataFactory = new FileInputStream("src//main//java//data//dataFactory.properties");
            configProp.load(fisConfig);
            dataFactory.load(fisDataFactory);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void initialization()
    {
        String browserName = configProp.getProperty("browser");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src//main//java//data//chromedriver.exe");
            driver = new ChromeDriver();
        }

        if(browserName.equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src//main//java//data//geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(configProp.getProperty("URL"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
}
