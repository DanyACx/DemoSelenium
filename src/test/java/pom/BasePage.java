package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    // metodo para hacer click
    public void click(By locator)  throws Exception{
        try{
            driver.findElement(locator).click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el locator: "+locator);
        }
    }

    public void click(WebElement elemento)  throws Exception{
        try{
            elemento.click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el elemento: "+elemento);
        }
    }

    // metodo para ver si el elemento se visualiza en pantalla
    public boolean seVisualiza(By locator) throws Exception {
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se puedo encontrar el lemento: "+locator);
        }
    }

    public String obtenerTexto(WebElement elemento) throws Exception {
        try{
            return elemento.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: "+elemento);
        }
    }

    public String obtenerTexto(By locator) throws Exception {
        try{
            return driver.findElement(locator).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del locator: "+locator);
        }
    }

    public void ingresarTexto(String textoIngresado, By locator) throws Exception{
        try{
            driver.findElement(locator).sendKeys(textoIngresado);
        }catch (Exception e){
            throw new Exception("No se pudo ingresar texto: "+locator);
        }

    }

    public WebElement encontrarElemento(By locator) throws Exception {
        try{
            return driver.findElement(locator);
        }catch (Exception e){
            throw new Exception("No se puedo encontrar al elemento: "+locator);
        }
    }

    public List<WebElement> encontrarElementos(By locator) throws Exception{
        try{
            return driver.findElements(locator);
        }catch (Exception e){
            throw  new Exception("NO se puedo encontrar elementos: "+ locator);
        }
    }

    public void desplazarHaciaAbajo() throws Exception { // hacer scroll hacia abajo de la page
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }catch (Exception e){
            throw  new Exception("NO se pudo desplazar hasta abajo: "+ e);
        }
    }

    public void esperaExplicitaClick(By locator){
        WebDriverWait esperaElemento = new WebDriverWait(driver, 5);
        esperaElemento.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void esperaExplicitaTexto(By locator, String texto){
        WebDriverWait esperaElemento = new WebDriverWait(driver, 5);
        esperaElemento.until(ExpectedConditions.textToBe(locator, texto));
    }

    public void esperaExplicitaImagen(By locator){
        WebDriverWait esperaElemento = new WebDriverWait(driver, 5);
        esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
