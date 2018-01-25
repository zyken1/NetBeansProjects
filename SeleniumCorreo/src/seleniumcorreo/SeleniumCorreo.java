
package seleniumcorreo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCorreo {
    
       public static void main(String[] args) throws InterruptedException {
       
    // Optional, if not specified, WebDriver will search your path
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\chromedriver.exe"); 
         WebDriver driver = new ChromeDriver();
         //  Wait For Page To Load
        // Put a Implicit wait, this means that any search for elements on the page
         driver.get("https://mail.google.com/");
         driver.manage().window().maximize();
    driver.findElement(By.cssSelector("a.maia-button.button-download.mobile-is-hidden.get-started.go-to-drive")).click();
    //driver.findElement(By.id("Email")).sendKeys("atencion3goldenharvest@gmail.com");
    //driver.findElement(By.cssSelector("span > svg")).click();
    //driver.findElement(By.cssSelector("#identifierLink > div.vdE7Oc.f3GIQ > p")).click();
    driver.findElement(By.linkText("Iniciar sesión")).click();
    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
    driver.findElement(By.id("identifierId")).sendKeys("atencion3goldenharvest@gmail.com");
    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("goldenupn@#33");
    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();   
  
    
   //driver.quit();          //Cerrar la instancia del navegador en Web drive 
   
       }  


}
