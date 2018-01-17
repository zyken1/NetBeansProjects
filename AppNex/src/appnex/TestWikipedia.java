/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Nex
 */
public class TestWikipedia {
   public static void main(String[] args) {
       
   WebDriver driver = new FirefoxDriver();
   driver.get("htttp://www.wikipedia.com");  //obtener el enlace deseado
   WebElement link;
   link = driver.findElement(By.linktext("English"));  //busca el elemento enla pagina web
   }  
}
