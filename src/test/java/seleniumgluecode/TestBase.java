package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.LoginPage;
import pom.MyAccountPage;
import pom.ParentZonePage;
import pom.VideoInteractivoTS3Page;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();

    protected LoginPage loginPage = new LoginPage(driver);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver);

    protected ParentZonePage parentZonePage = new ParentZonePage(driver);

    protected VideoInteractivoTS3Page videoInteractivoTS3_1Page = new VideoInteractivoTS3Page(driver);


}
