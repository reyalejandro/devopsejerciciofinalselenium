package main.selenium.test;

import main.selenium.base.*;
import main.selenium.pages.WTSPage;
import org.junit.*;

public class test04_ValidarTextoDeploy extends TestBase{

    protected WTSPage pagina_test = null;

    @Test
    public void ValidarTextoDeploy() {
        pagina_test = new WTSPage(driver);
        pagina_test.validarTextoDeploy();
    }
}
