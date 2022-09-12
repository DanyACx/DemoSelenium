package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestVideoInteractivoTS3_1 extends TestBase{

    @Given("^Voy a Iniciar sesión$")
    public void voyAIniciarSesión() throws Throwable {
        Assert.assertTrue(videoInteractivoTS3_1Page.loginPageVisualizada());
    }

    @When("^Ingreso credenciales$")
    public void ingresoCredenciales() throws Throwable {
        videoInteractivoTS3_1Page.paisSeleccionado();
        videoInteractivoTS3_1Page.operadorSeleccionado();
        videoInteractivoTS3_1Page.ingresarNumero();
    }

    @When("^Click en inicio de sesión e ingreso al Home$")
    public void clickEnInicioDeSesiónEIngresoAlHome() throws Throwable {
        videoInteractivoTS3_1Page.hacerClick();
    }

    @When("^Click en imagen de TS(\\d+)$")
    public void clickEnImagenDeTS(int arg1) throws Throwable {
        videoInteractivoTS3_1Page.hacerClickIconoTS3();
    }

    @When("^Me desplazo hasta el final$")
    public void meDesplazoHastaElFinal() throws Throwable {
        videoInteractivoTS3_1Page.desplazarHaciaAbajo();
    }

    @When("^Selecciono imagen de games$")
    public void seleccionoImagenDeGames() throws Throwable {
        videoInteractivoTS3_1Page.hacerClickIconoGames();
    }

    @When("^Selecciono imagen de videos interactivos$")
    public void seleccionoImagenDeVideosInteractivos() throws Throwable {
        videoInteractivoTS3_1Page.hacerClickIconoVideosIteractivos();
    }

    @Then("^debería ver video del Quiz (\\d+)$")
    public void deberíaVerVideoDelQuiz(int arg1) throws Throwable {
        videoInteractivoTS3_1Page.seVisualizaVideoInteractivo_1();
    }
}
