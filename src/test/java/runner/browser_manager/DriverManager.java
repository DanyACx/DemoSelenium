package runner.browser_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class DriverManager {

    protected WebDriver driver; // Este atributo se hereda

    protected abstract void createDriver();

    public void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(){
        if(driver == null){
            createDriver();
        }

        return driver;
    }
}
