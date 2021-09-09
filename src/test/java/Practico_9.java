import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practico_9 {

    //metodo auxiliar para obtener el driver en una linea
    public static WebDriver getDriver( String url) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
    /*Ejercicio 1
    Crear un método de test llamado forgotAccountTest
    Ir a Facebook https://www.facebook.com/
    Validar que el título sea “Facebook - Inicia sesión o regístrate”
    Hacer click en ¿Olvidaste tu contraseña?
    Validar que el título sea “¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook”
    Validar que la url sea diferente a “https://www.facebook.com/”*/
    @Test
    public static void forgotAccountTest(){
        WebDriver driver = getDriver("https://www.facebook.com");
        System.out.println("titulo " + driver.getTitle());

        driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook");
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.facebook.com/", "Se deberia estar en otra url" );

    }

    /*Ejercicio 2
    Crear un método de test llamado forgotAccountPartialLinkTest
    Ir a Facebook https://www.facebook.com/
    Hacer click en “¿Olvidaste” utilizando el partialLink
    Agregar un assert que el título sea “¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook”*/
    @Test
    public void forgotAccountPartialLinkTest() {
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.partialLinkText("¿Olvidaste")).click();

        Assert.assertEquals(driver.getTitle(),
                "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook",
                "Se debería estar en la sección de olvidaste tu contraseña");
    }

}
