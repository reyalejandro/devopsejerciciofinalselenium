package main.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeleniumBase {

    //Atributos
    WebDriver driver;

    //Constructor para traernos driver
    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    //Metodos Wrapper - Envoltorio
    public WebElement findElmnt(By localizador) {
        return driver.findElement(localizador);
    }

    public void clickear(By localizador){
        WebElement element = findElmnt(localizador);
        Boolean isclicked;
        try {
            esperaExplicitaElementoClickeable(localizador,5);
            element.click();
            isclicked= true;
        } catch(Exception e){
            isclicked= false;
        }
        assertTrue(isclicked);
    }

    public void esperaExplicitaElementoClickeable(By localizador, int time) {
        WebDriverWait espera;
        espera = new WebDriverWait(driver, time);
        espera.until(ExpectedConditions.elementToBeClickable(localizador));
    }

    public void esperaExplicitaPrecenciaElemento(By localizador, int time) {
        WebDriverWait espera;
        espera = new WebDriverWait(driver, time);
        espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public String obtenerTexto(By localizador) {
        return findElmnt(localizador).getText();
    }

}