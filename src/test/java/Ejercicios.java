import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ejercicios {
    /*Ejercicio 1:
    Crear un método que abra el browser y muestre el explorador de google con Chrome*/
    @Test
    public void ejercicio1() {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com");
    }

    /*Ejercicio 2
    Crear un método llamado mostrarTituloTest, que muestre el título del sitio web.*/
    @Test
    public void mostrarTituloTest() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Título de la pagina: " + driver.getTitle());
        System.out.println("Título de la pagina: " + driver.getCurrentUrl());
    }
}
