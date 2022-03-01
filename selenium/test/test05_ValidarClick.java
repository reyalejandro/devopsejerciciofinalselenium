package main.selenium.test;

import main.selenium.base.*;
import main.selenium.pages.WTSPage;
import org.junit.*;

public class test05_ValidarClick extends TestBase{

    protected WTSPage pagina_test = null;

    @Test
    public void ValidarClick() {
        pagina_test = new WTSPage(driver);
        pagina_test.clickearBoton();
    }
}
