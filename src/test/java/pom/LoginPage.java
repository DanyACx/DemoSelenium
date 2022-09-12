package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    // Elementos de pa page Login
    By tituloLocator = By.xpath("/html/body/app-root/mge-en/mge-login/div/div[3]/h3"); // Please enter your...
    By listaPaisLocator = By.name("country");
    By listaOperadorLocator = By.name("operator");
    By numeroOperadorLocator = By.name("phoneNumber");
    By botonLocator = By.xpath("/html/body/app-root/mge-en/mge-login/div/div[4]/form/div[4]/button"); // Enter boton
    By iconoHomeLocator = By.xpath("/html/body/app-root/mge-en/mge-shell/mge-navbar-default/mge-navbar-shell/nav/div/a/img[1]"); // Icono de home

    String textoTitulo = "Please enter your details to start the magic.";

    public boolean loginPageVisualizada() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaTexto(tituloLocator, textoTitulo);
        return this.obtenerTexto(tituloLocator).equals(textoTitulo);
    }

    public String paisSeleccionado() throws Exception {
      //  Thread.sleep(2000);
        this.esperaExplicitaClick(listaPaisLocator);
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
        //Thread.sleep(2000);
        this.esperaExplicitaClick(listaOperadorLocator);
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

    public void hacerClick() throws Exception {
        this.esperaExplicitaClick(botonLocator);
        this.click(botonLocator);
       // Thread.sleep(2000);
    }

    public boolean seVisualizaHomePage() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaImagen(iconoHomeLocator);
        return this.seVisualiza(iconoHomeLocator);
    }

}
