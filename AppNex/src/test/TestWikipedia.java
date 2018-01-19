package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Nex
 */
public class TestWikipedia {
   public static void main(String[] args) throws InterruptedException {
       
   // WebDriver driver = new FirefoxDriver();
   System.setProperty("webdriver.ie.driver", "C:\\Users\\TOSHIBA\\Downloads\\IEDriverServer.exe");
   //WebDriver driver  = new ChromeDriver();
	   WebDriver driver = new InternetExplorerDriver(); 
   
   driver.get("http://www.wikipedia.org");            /*obtener el enlace deseado*/
   WebElement link;
       System.out.println(driver.getPageSource());     //obtener el codigofuetne de una pagina
   link = driver.findElement(By.linkText("Español"));  //Basic el elemento enla pagina web
   link.click();
   Thread.sleep(5000);                //tiempo a esperar en lo que carga 
   WebElement searchBox;              //Crear un Elemento ala caja del texto de busqueda
   searchBox = driver .findElement(By.id("searchInput"));     //Cuadro de  busqueda
   searchBox.sendKeys("Software");     //Se escribe en el cuadro de busqueda 
   searchBox.submit();
   Thread.sleep(5000);                 //le ponemos una espera de nuevo
   driver.quit();                      //Cerrar la instancia del navegador en Web drive 
   
  
   }  
}
