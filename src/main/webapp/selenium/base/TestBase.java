package main.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    //conteniene las configuraciones basicas de los test a ejecutar
    //atributos
    protected WebDriver driver; // navegador

    @BeforeClass
    public static void initialiseBrowser(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupBrowser(){
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
        driver.get("http://172.18.74.140:8081/rps/");
    }

    @After
    public void close(){
        if(driver != null){
            driver.close();
        }
    }

}
