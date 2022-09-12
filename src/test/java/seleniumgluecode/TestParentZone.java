package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestParentZone extends TestBase{

    @Given("^Estoy en la vista Iniciar sesión$")
    public void estoyEnLaVistaIniciarSesión() throws Throwable {
        Assert.assertTrue(parentZonePage.loginPageVisualizada());
    }

    @When("^Ingreso mis credenciales$")
    public void ingresoMisCredenciales() throws Throwable {
        parentZonePage.paisSeleccionado();
        parentZonePage.operadorSeleccionado();
        parentZonePage.ingresarNumero();
    }

    @When("^Hago click en inicio de sesión e ingreso al Home$")
    public void hagoClickEnInicioDeSesiónEIngresoAlHome() throws Throwable {
        parentZonePage.hacerClick();
    }

    @When("^Hago click en menu$")
    public void hagoClickEnMenu() throws Throwable {
        parentZonePage.hacerClickBotonMenu();
    }

    @When("^Seleccione opción Parent Zone$")
    public void seleccioneOpciónParentZone() throws Throwable {
        parentZonePage.hacerClickOpcionParentZone();
    }

    @Then("^debería estar en la página Parent Zone$")
    public void deberíaEstarEnLaPáginaParentZone() throws Throwable {
        parentZonePage.seVisualizaParentZonePage();
    }
}
