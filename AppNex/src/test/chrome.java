
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
    
       public static void main(String[] args) throws InterruptedException {
       
    // Optional, if not specified, WebDriver will search your path
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\chromedriver.exe"); 
         WebDriver driver = new ChromeDriver();
   driver.get("http://www.google.com/xhtml");            /*obtener el enlace deseado*/
      // System.out.println(driver.getPageSource());     //obtener el codigofuetne de una pagina
   Thread.sleep(5000);                //tiempo a esperar en lo que carga 
   WebElement searchBox = driver.findElement(By.name("q"));             //Crear un Elemento ala caja del texto de busqueda
   searchBox.sendKeys("ChromeDriver");     //Se escribe en el cuadro de busqueda 
   searchBox.submit();
   Thread.sleep(5000);                 //le ponemos una espera de nuevo
   driver.quit();                      //Cerrar la instancia del navegador en Web drive 
    
       }  


}
