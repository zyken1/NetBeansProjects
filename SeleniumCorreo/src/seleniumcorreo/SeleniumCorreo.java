
package seleniumcorreo;

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
    
    //driver.findElement(By.id("Email")).sendKeys("atencion3goldenharvest@gmail.com");
    driver.findElement(By.id("identifierId")).sendKeys("atencion3goldenharvest@gmail.com");
    
   var value = this.browserbot.findElement("id=someInput").value;
    if (value == "Slanec is the best!") {
    this.browserbot.findElement("id=someButton").click();
}

    
    
    //driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);             //detecta la entrada de teclas
    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();             //busqueda del boton siguiente
    driver.findElement(By.name("hiddenPassword")).sendKeys("goldenupn@#33");
    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();   
 
        //dentro del correo
    driver.findElement(By.xpath("(//span[@name='SOLUCIONES ENERGETICAS'])[2]")).click();
    driver.findElement(By.linkText("Recibidos")).click();
    
        //Salir del correo
     Thread.sleep(5000);
     driver.quit();          //Cerrar la instancia del navegador en Web drive 
   
       }  
}




