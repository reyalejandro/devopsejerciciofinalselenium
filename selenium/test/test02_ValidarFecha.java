package main.selenium.test;

import main.selenium.base.*;
import main.selenium.pages.WTSPage;
import org.junit.*;

public class test02_ValidarFecha extends TestBase{

    protected WTSPage pagina_test = null;

    @Test
    public void ValidarTitulo() {
        pagina_test = new WTSPage(driver);
        pagina_test.validarTextoFecha();
    }
}
