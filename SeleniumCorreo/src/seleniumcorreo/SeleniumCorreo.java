
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
   

    
   driver.quit();                      //Cerrar la instancia del navegador en Web drive 
   
       }  


}
