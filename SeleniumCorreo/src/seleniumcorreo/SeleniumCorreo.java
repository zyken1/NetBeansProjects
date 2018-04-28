
package seleniumcorreo;

import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCorreo {

       public static void main(String[] args) throws InterruptedException {
       
    // Optional, if not specified, WebDriver will search your path
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\Selenium\\chromedriver.exe"); 
         WebDriver driver = new ChromeDriver();
        
         //  Wait For Page To Load 
         driver.get("https://mail.google.com/");
         driver.manage().window().maximize();
       
          System.out.println(driver.getTitle());

        
    //driver.findElement(By.id("Email")).sendKeys("atencion3goldenharvest@gmail.com");
    //String expPageTitle = "Email";
    
     driver.getPageSource();
        //waitForPageLoad( );
    driver.findElement(By.id("identifierId")).sendKeys("atencion3goldenharvest@gmail.com");
    Thread.sleep(200);
    driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();  //busqueda del boton siguiente
    //driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();   
    
    //driver.getPageSource();  //codigo de la pagina
            

//CONTRASEÑA
    //driver.findElement(By.cssSelector("input.whsOnd zHQkBf")).sendKeys("goldenupn@#33");
    //driver.findElement(By.id("Passwd")).sendKeys("goldenupn@#33");
    //driver.findElement(By.name("password")).clear();
    // driver.findElement(By.name("password")).sendKeys("goldenupn@#33");
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //driver.get("https://www.flipkart.com");
    driver.findElement(By.xpath("//input[@aria-label='Introduce tu contraseña' and @name='password']")).sendKeys("goldenupn@#33");
    driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
    Thread.sleep(300);
    //dom
    //web elements
    
        //dentro del correo
    driver.findElement(By.xpath("(//span[@name='SOLUCIONES ENERGETICAS'])[2]")).click();
    driver.findElement(By.linkText("Recibidos")).click();
    
       
    
    //Salir del correo
    //  Thread.sleep(5000);
    //  driver.quit();          //Cerrar la instancia del navegador en Web drive 
   
       }  
}