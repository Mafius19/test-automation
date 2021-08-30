import org.openqa.selenium.*;
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

    /*Ejercicio 5
    Crear un método llamado bbcMundoListas
    Ingresar al sitio https://www.bbc.com/mundo
    Mostrar todos los elementos li y su texto*/
    @Test
    public void bbcMundoListas() {
        String URL_BBC = "https://www.bbc.com/mundo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_BBC);

        List<WebElement> listaLi = driver.findElements(By.tagName("li"));
        System.out.println("La cantidad de links del sitio son: " + listaLi.size());
        System.out.println("************ Elementos li ************");
        for (WebElement li:listaLi) {
            if (!li.getText().isEmpty()) {
                System.out.println(li.getText());
            }
        }
        System.out.println("**************************************");
        driver.close();
    }
    /*Ejercicio 6
    Crear un método llamado spotifyTitleTest
    Debe inicializar https://www.spotify.com
    Validar que el título del sitio sea Escuchar es todo - Spotify.
    Si lo es, debe indicar “Test Passed!!” sino, debe mostrar “Test failed"*/
    @Test
    public void spotifyTitleTest() {
        String URL_Spotify = "https://www.spotify.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Spotify);
        String titulo =driver.getTitle();
        System.out.println("Título de la pagina: " + titulo);
        if (titulo.equals("Escuchar es todo - Spotify")){
            System.out.println("Test Passed!!");
        } else {
            System.out.println("Test Failed");
        }
    }

    /*Ejercicio 7
    Crear un método llamado getWindowsSizeTest
    Abrir el explorador con google.com
    Obtener y mostrar el ancho y alto de la página
    Setear un nuevo tamaño de pantalla 1024x768*/
    @Test
    public void getWindowSizeTest() {
        String URL_Google = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Google);

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        System.out.println("El largo actual es: " + height );
        System.out.println("El ancho actual es: " + width);

        Dimension dimension = new Dimension(1024,768);
        driver.manage().window().setSize(dimension);
        System.out.println("Actualizando el ancho y el largo...");

        height = driver.manage().window().getSize().getHeight();
        width = driver.manage().window().getSize().getWidth();

        System.out.println("El largo actual es: " + height);
        System.out.println("El ancho actual es: " + width);
    }

    /*Ejercicio 8
    Crear un método llamado getGoogleDriver que inicialice un sitio web www.google.com.
    Debe retornar un objeto de tipo Webdriver*/
    @Test
    public WebDriver getGoogleDriver() {
        String URL_Google = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Google);
        return driver;
    }

    /*Ejercicio 9
    Crear un método llamado getDriver que inicialice un sitio web que recibe por parámetro.
    Debe retornar un objeto de tipo Webdriver*/
    @Test
    public WebDriver getDriver() {
        String URL_Github = "https://www.github.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Github);
        return driver;
    }

    /*Ejercicio 10
    Crear un método llamado searchInGoogle
    Acceder a google.com
    Ingresar en el buscador, la palabra “WebElement” y presionar enter.*/
    @Test
    public void searchInGoogle() {
        String URL_Google = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Google);

        WebElement searcher = driver.findElement(By.name("q"));

        searcher.sendKeys("WebElement" + Keys.RETURN);
        //Otra solucion posible:
        //WebElement searchInput = driver.findElement(By.name("btnK"));
        //searcher.sendKeys("WebElement");
        //searchInput.submit();
    }

    /*Ejercicio 11
    Crear un método llamado searchInGoogleAndGoBack
    Acceder a google.com
    Imprimir el título del sitio
    Buscar: WebElement y presionar ENTER
    Volver atras
    Refrescar la página
    Ir hacia adelante*/
    @Test
    public void searchInGoogleAndGoBack() {
        String URL_Google = "https://www.google.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Google);

        WebElement searcher = driver.findElement(By.name("q"));
        searcher.sendKeys("WebElement" + Keys.RETURN);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

    /*Ejercicio 12
    Crear un método llamado facebookPageTest
    Abrir un navegador con facebook: https://www.facebook.com/
    Mostrar la cantidad de div que existen (utilizando tagname)
    Mostrar el texto de todos los tipos a (hipervínculos)
    Mostrar la cantidad de botones que tiene la página
    Mostrar los textos de los botones que se encuentran en la página*/
    @Test
    public void facebookPageTest() {
        String URL_Facebook = "https://www.facebook.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Facebook);

        List<WebElement> listaDivs = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs que hay son: " + listaDivs.size());

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("========Textos en hipervínculos========");
        for (WebElement link:listaLinks) {
            System.out.println(link.getText());
        }
        System.out.println("======================================");

        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));
        System.out.println("La cantidad de buttons que hay son: " + listaBotones.size());

        System.out.println("========Textos en botones========");
        for (WebElement boton:listaBotones) {
            System.out.println(boton.getText());
        }
        System.out.println("==================================");
        driver.quit();
    }

    /*Ejercicio 13
    Crear un método de test llamado sendKeysToFacebook
    Ir a Facebook https://www.facebook.com/
    Completar el email y contraseña con los datos: test@test.com y holamundo
    respectivamente
    Hacer click en login*/
    @Test
    public void sendKeysToFacebook() {
        String URL_Facebook = "https://www.facebook.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Facebook);

        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.name("login"));

        username.sendKeys("test@test.com");
        password.sendKeys("holamundo");
        loginBtn.click();
        driver.quit();
    }
    /*Ejercicio 14
    Subir este ejercicio en a github en una rama nueva llamada selenium/ejercicio1.
    Crear una pull request y agregar a jcblimop como revisor.
    Crear un método con un nombre a seleccionar
    Acceder a Netflix: https://www.netflix.com/ar/
    Mostrar los elementos h1 y h2 que hay en el sitio
    Refrescar la página
    Mostrar el texto de los botones que se encuentran en la página
    Mostrar la cantidad de elementos div que contiene el sitio
    Obtener y mostrar el título de la página
    Mostrar la cantidad de elementos de tipos link*/
    @Test
    public void NetflixTest() {
        String URL_Netflix = "https://www.netflix.com/ar/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Netflix);

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        System.out.println("========Textos en H1========");
        for (WebElement h1:listaH1) {
            System.out.println(h1.getText());
        }
        System.out.println("========================================");

        System.out.println("==============Textos en H2==============");
        for (WebElement h2:listaH2) {
            System.out.println(h2.getText());
        }
        System.out.println("========================================");

        driver.navigate().refresh();

        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));

        System.out.println("============Textos en botones===========");
        for (WebElement boton:listaBotones) {
            System.out.println(boton.getText());
        }
        System.out.println("========================================");

        List<WebElement> listaDivs = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs que hay son: " + listaDivs.size());

        String titulo = driver.getTitle();
        System.out.println("El titulo de la pagina es: " + titulo);

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de hipervínculos <a> que hay son: " + listaLinks.size());

        driver.quit();
    }

}
