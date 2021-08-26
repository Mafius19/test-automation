import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicios {
    /*Ejercicio 1
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

    /*Ejercicio 3
    Crear un método llamado bbcMundTest
    Ingresar al sitio https://www.bbc.com/mundo
    Mostrar la cantidad de <h1>
    Imprimir títulos h1
    Mostrar la cantidad de <h2>
    Imprimir títulos h2*/
    @Test
    public void bbcMundTest() {
        String URL_BBC = "https://www.bbc.com/mundo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_BBC);

        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de elementos H1 del sitio son: " + listaH1s.size());
        System.out.println("****** Elementos H1 ******");
        for (WebElement H1:listaH1s) {
            System.out.println(H1.getText());
        }
        System.out.println("**************************");


        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de elementos H2 del sitio son: " + listaH2s.size());
        System.out.println("****** Elementos H2 ******");
        for (WebElement H1:listaH2s) {
            System.out.println(H1.getText());
        }
        System.out.println("**************************");

        driver.close();
    }

    /*Ejercicio 4
    Crear un método llamado bbcMundoLinks
    Ingresar al sitio https://www.bbc.com/mundo
    Mostrar el texto de todos los links*/
    @Test
    public void bbcMundoLink() {
        String URL_BBC = "https://www.bbc.com/mundo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_BBC);

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de links del sitio son: " + listaLinks.size());
        System.out.println("************ Links ************");
        for (WebElement link:listaLinks) {
            if (!link.getText().isEmpty()) {
                System.out.println(link.getText());
            }
        }
        System.out.println("*******************************");
        driver.close();
    }
}
