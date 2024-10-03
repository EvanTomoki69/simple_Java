package etg.example.com;

import java.time.Duration;

// Importing Selenium library
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Importacion de los paquetes hechos a medida 
import etg.example.com.packs.HelloPack;
import etg.example.com.packs.HourPack;

// Importacion del framework de testing
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NonVanillaApp {
    
    //@Test
    public static void main(String[] args) {
        // Implementacion de los paquetes especiales
        HelloPack salute = new HelloPack();
        salute.msg();

        HourPack time = new HourPack();
        time.hour();

        // Configuracion de Selenium
        WebDriverManager.chromedriver().setup();
        WebDriver etgDriver = new ChromeDriver();
        WebDriverWait timeStoppu = new WebDriverWait(etgDriver, Duration.ofSeconds(10));
        
        // Navegar al sitio web
        etgDriver.get("https://hoonigan.com");
        etgDriver.manage().window().maximize();
        String HoonTitle = etgDriver.getTitle();
        System.out.println("Page title is: " + HoonTitle);
        
        WebElement HoonButton = timeStoppu.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Shop Now']")));
        HoonButton.click();
        System.out.println("Done");

        // Cerrar el buscador
        //etgDriver.quit();
    }
}