package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pom.MyAccountPage;

public class TestMyAccount extends TestBase{

    @Given("^Estoy en el page Iniciar sesión$")
    public void estoyEnElPageIniciarSesión() throws Throwable {
        Assert.assertTrue(myAccountPage.loginPageVisualizada());
    }

    @When("^Ingreso mis credenciales de acceso$")
    public void ingresoMisCredencialesDeAcceso() throws Throwable {
        myAccountPage.paisSeleccionado();
        myAccountPage.operadorSeleccionado();
        myAccountPage.ingresarNumero();
    }

    @When("^Hago click en el botón de inicio de sesión e ingreso al Home$")
    public void hagoClickEnElBotónDeInicioDeSesiónEIngresoAlHome() throws Throwable {
        myAccountPage.hacerClick();
    }

    @When("^Hago click en botón menu$")
    public void hagoClickEnBotónMenu() throws Throwable {
        myAccountPage.hacerClickBotonMenu();
    }

    @When("^Seleccione opción My Account$")
    public void seleccioneOpciónMyAccount() throws Throwable {
        myAccountPage.hacerClickOpcionAccount();
    }

    @Then("^debería estar en la página My Account$")
    public void deberíaEstarEnLaPáginaMyAccount() throws Throwable {
        myAccountPage.seVisualizaMyAccountPage();
    }
}
