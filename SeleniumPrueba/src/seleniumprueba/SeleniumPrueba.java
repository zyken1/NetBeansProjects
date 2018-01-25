
package seleniumprueba;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumPrueba {
    
       public static void main(String[] args) throws InterruptedException {
       

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Downloads\\chromedriver.exe"); 
         WebDriver driver = new ChromeDriver();
   driver.get("http://www.google.com/xhtml");         /*obtener el enlace deseado*/
   
           
   //Crear un Elemento ala caja del texto de busqueda
    driver.findElement(By.id("lst-ib")).clear();   //nombre del ID es BUSCAR  en el navegador 
    
    driver.findElement(By.id("lst-ib")).sendKeys("selenium");
    driver.findElement(By.name("btnK")).click();                                //da lick en el boton buscar
    driver.findElement(By.linkText("Selenium - Wikipedia, la enciclopedia libre")).click();
    //driver.findElement(By.cssSelector("li.toclevel-2.tocsection-7 > a > span.toctext")).click();   dezplazala pagina web
    driver.findElement(By.linkText("Última versión estable")).click();
    driver.findElement(By.linkText("wikificado")).click();

    
   driver.quit();                      //Cerrar la instancia del navegador en Web drive 
   
       }  


}
