package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Test extends TestBase{

    private WebDriver driver = Hooks.getDriver();

    @Given("^Estoy en la página Iniciar sesión$")
    public void estoyEnLaPáginaIniciarSesión() throws Throwable {
        Assert.assertTrue(loginPage.loginPageVisualizada());
    }

    @When("^Selecciono el país ‘Kuwait’$")
    public void seleccionoElPaísKuwait() throws Throwable {
        loginPage.paisSeleccionado();
    }

    @When("^Selecciono el operador ‘Zain’$")
    public void seleccionoElOperadorZain() throws Throwable {
        loginPage.operadorSeleccionado();
    }

    @When("^Lleno el cuadro de texto del MSISDN con el valor '(\\d+)'$")
    public void llenoElCuadroDeTextoDelMSISDNConElValor(int arg1) throws Throwable {
        loginPage.ingresarNumero();
    }

    @When("^Hago clic en el botón de inicio de sesión$")
    public void hagoClicEnElBotónDeInicioDeSesión() throws Throwable {
        loginPage.hacerClick();
    }

    @Then("^debería estar en la página de home$")
    public void deberíaEstarEnLaPáginaDeHome() throws Throwable {
        Assert.assertTrue(loginPage.seVisualizaHomePage());
    }

}
