
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
   driver.get("http://www.google.com/xhtml");         /*obtener el enlace deseado*/
   //System.out.println(driver.getPageSource());     //obtener el codigofuetne de una pagina
   //Thread.sleep(1000);                             //tiempo a esperar en lo que carga 
           
   //Crear un Elemento ala caja del texto de busqueda
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("selenium");
    driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("Selenium - Wikipedia, la enciclopedia libre")).click();
    
   driver.quit();                      //Cerrar la instancia del navegador en Web drive 
   
       }  


}
