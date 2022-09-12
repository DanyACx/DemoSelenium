package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver){
        super(driver);
    }


    By tituloLocator = By.xpath("/html/body/app-root/mge-en/mge-login/div/div[3]/h3"); // Please enter your...
    By listaPaisLocator = By.name("country");
    By listaOperadorLocator = By.name("operator");
    By numeroOperadorLocator = By.name("phoneNumber");
    By botonLocator = By.xpath("/html/body/app-root/mge-en/mge-login/div/div[4]/form/div[4]/button"); // Enter boton
    By iconoHomeLocator = By.xpath("/html/body/app-root/mge-en/mge-shell/mge-navbar-default/mge-navbar-shell/nav/div/a/img[1]"); // Icono de home

    By iconoMenuHomeLocator = By.id("toggle-navbar"); // home

    By opcionAccountLocator = By.xpath("/html/body/app-root/mge-en/mge-shell/mge-navbar-default/mge-navbar-shell/nav/div/div/ul/li[1]/a");

    By MyAccountLocator = By.xpath("/html/body/app-root/mge-en/mge-shell/main/mge-th-pages/div/mge-profile/div/div[1]/div[2]/div[2]/div[2]/h5");

    String textoTitulo = "Please enter your details to start the magic.";

    public boolean loginPageVisualizada() throws Exception {
        Thread.sleep(2000);
        return this.obtenerTexto(tituloLocator).equals(textoTitulo);
    }

    public String paisSeleccionado() throws Exception {
        Thread.sleep(2000);
        WebElement lista = this.encontrarElemento(listaPaisLocator);
        List<WebElement> opciones = lista.findElements(By.tagName("option"));

        for(int i=0; i<opciones.size(); i++){
            if(this.obtenerTexto(opciones.get(i)).equals("Kuwait")){
                this.click(opciones.get(i));
            }
        }

        String opcionSeleccionada = "";
        for (int i=0; i<opciones.size(); i++){
            if(opciones.get(i).isSelected())
                opcionSeleccionada = this.obtenerTexto(opciones.get(i));
        }

        return opcionSeleccionada;
    }

    public String operadorSeleccionado() throws Exception {
        Thread.sleep(2000);
        WebElement lista = this.encontrarElemento(listaOperadorLocator);
        List<WebElement> opciones = lista.findElements(By.tagName("option"));

        for(int i=0; i<opciones.size(); i++){
            if(this.obtenerTexto(opciones.get(i)).equals("Zain")){
                this.click(opciones.get(i));
            }
        }

        String opcionSeleccionada = "";
        for (int i=0; i<opciones.size(); i++){
            if(opciones.get(i).isSelected())
                opcionSeleccionada = this.obtenerTexto(opciones.get(i));
        }

        return opcionSeleccionada;
    }

    public void ingresarNumero() throws Exception {
        this.ingresarTexto("2022051801", numeroOperadorLocator);
    }

    public void hacerClick() throws Exception { // para el boton del login y el boton de menu y opcion "My Account"
        this.click(botonLocator);
        Thread.sleep(2000);
    }

    public boolean seVisualizaHomePage() throws Exception {
        Thread.sleep(2000);
        return this.seVisualiza(iconoHomeLocator);
    }

    public void hacerClickBotonMenu() throws Exception { // el boton de menu
        this.click(iconoMenuHomeLocator);
        Thread.sleep(2000);
    }

    public void hacerClickOpcionAccount() throws Exception { // opcion "My Account"
        this.click(opcionAccountLocator);
        Thread.sleep(2000);
    }

    public boolean seVisualizaMyAccountPage() throws Exception {
        Thread.sleep(2000);
        return this.seVisualiza(MyAccountLocator);
    }

}
