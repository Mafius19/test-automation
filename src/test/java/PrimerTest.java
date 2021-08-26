import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrimerTest {

    @Test
    public void testInWindows() {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
       System.out.println("Titulo de la pagina " + driver.getTitle());
       System.out.println("Titulo de la pagina " + driver.getCurrentUrl());
    }
}
