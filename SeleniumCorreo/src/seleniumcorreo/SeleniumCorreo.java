package seleniumcorreo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumCorreo {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
   public static void main(String[] args) throws InterruptedException {
  
       
    System.setProperty("webdriver.chrome.driver","C:\\Users\\TOSHIBA\\Downloads\\chromedriver.exe");  //path dewebdriver
       WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();


driver.get("https://accounts.google.com/ServiceLogin?");

//System.out.println(driver.getPageSource());     //obtener el codigofuetne de una pagina
// gmail login
//WebElement searchBox = driver.findElement(By.name("Email"));             //Crear un Elemento ala caja del texto de busqueda
 //searchBox.sendKeys("ChromeDriver"); 

driver.findElement(By.id("username")).sendKeys("atencion3goldenharvest@gmail.com");  //inserccion con llaves
driver.findElement(By.id("next")).click();
driver.findElement(By.id("Passwd")).sendKeys("dosmasdos4");
driver.findElement(By.id("signIn")).click();

// elementos de accion para buscar un elemento
driver.findElement(By.xpath("//*[@title='Google apps']")).click();
driver.findElement(By.id("gb23")).click();

// now talking un-read email form inbox into a list
List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));

// Mailer name for which i want to check do i have an email in my inbox 
String MyMailer = "Udacity";

// real logic starts here
for(int i=0;i<unreademeil.size();i++){
    if(unreademeil.get(i).isDisplayed()==true){
        // now verify if you have got mail form a specific mailer (Note Un-read mails)
        // for read mails xpath loactor will change but logic will remain same
        if(unreademeil.get(i).getText().equals(MyMailer)){
            System.out.println("Yes we have got mail form " + MyMailer);
            // also you can perform more actions here 
            // like if you want to open email form the mailer
            break;
        }else{
            System.out.println("No mail form " + MyMailer);
        }
    }
}