import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {

    WebDriver wd;


    @BeforeMethod
    public void preCondition(){
    System.out.println("Opening web-site");
    wd = new ChromeDriver();
   // wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/home");
       // wd.navigate().forward();
       // wd.navigate().back();

    }
    @Test
    public void findElementsOnPage(){

         wd.findElement(By.cssSelector(".container"));
         wd.findElement(By.cssSelector("div.login_login__3EHKB"));
        wd.findElement(By.cssSelector("[class^='cont']"));
        wd.findElement(By.cssSelector("[class$='iner']"));
       wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
       wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
       wd.findElement(By.cssSelector("[class^='navb']"));
       wd.findElement(By.cssSelector("[class*='navbar-component']"));
       wd.findElement(By.cssSelector(".active"));
       wd.findElement(By.cssSelector("[class^='act']"));
       wd.findElement(By.cssSelector("[class$='tive']"));
        wd.findElement(By.cssSelector("[href='/login']"));

         wd.findElement(By.cssSelector("input[placeholder='Email']"));
        wd.findElement(By.cssSelector("[name='email']"));
         wd.findElement(By.cssSelector("[name^='ema']"));
         wd.findElement(By.cssSelector("input[placeholder='Password']"));
         wd.findElement(By.cssSelector("[name*='password']"));
         wd.findElement(By.cssSelector("input[name$='word']"));

         wd.findElement(By.cssSelector("button[name='login']"));
         wd.findElement(By.cssSelector("[name^='log']"));
         wd.findElement(By.cssSelector("[name$=gin]"));
         wd.findElement(By.cssSelector("button[name='registration']"));
         wd.findElement(By.cssSelector("[name^='regis']"));
         wd.findElement(By.cssSelector("[name$='ation']"));
         wd.findElement(By.cssSelector("a[href='/home']"));
         wd.findElement(By.cssSelector("a[href='/about']"));
         wd.findElement(By.cssSelector("a[href^='/abo']"));
         wd.findElement(By.cssSelector("[href$='out']"));
         wd.findElement(By.cssSelector("div#root"));
        wd.findElements(By.cssSelector("div[class='login_login__3EHKB'] >form>button:last-child"));
        wd.findElements(By.cssSelector("div[class='login_login__3EHKB'] >form>button:first-child"));

        List<WebElement> elements = wd.findElements(By.cssSelector("div h1"));
        System.out.println("result="+elements.size());

    }







    @AfterMethod
    public void postCondition(){
    //wd.close();
    wd.quit();
    }
}