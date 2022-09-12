package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://mlm.kantoo.com/#/en/en/auth/login");
        //driver.manage().window().maximize();
        Dimension dimension = new Dimension(300, 800);
        driver.manage().window().setSize(dimension);
    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
    } //

    public static WebDriver getDriver(){
        return driver;
    }
}
