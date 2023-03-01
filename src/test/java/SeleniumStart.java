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

       wd.findElement(By.xpath("//h1"));
        List<WebElement> elementsDiv = wd.findElements(By.xpath("//div"));
        System.out.println(elementsDiv.size());
        List<WebElement> elementsA = wd.findElements(By.xpath("//div/a"));
        System.out.println(elementsA.size());

        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));
         wd.findElement(By.cssSelector("div.login_login__3EHKB"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("div#root"));
        wd.findElement(By.xpath("//div[@id='root']"));
        wd.findElement(By.xpath("//*[contains(@id,'root')]"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
        wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        wd.findElement(By.xpath("//*[contains(@class,'navbar-component_nav__1X_4m')]"));
       wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.xpath("//a[@class='active']"));
        wd.findElement(By.xpath("//a[@aria-current='page']"));


         wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//a[@href='/login']"));
        wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[3]"));

        wd.findElement(By.cssSelector("input[placeholder='Email']"));
        wd.findElement(By.xpath("//input[@placeholder='Email']"));
        wd.findElement(By.xpath("//input[@name='email']"));
        wd.findElement(By.xpath("//*[contains(@name,'email')]"));


         wd.findElement(By.cssSelector("input[placeholder='Password']"));
        wd.findElement(By.xpath("//*[contains(@placeholder,'Password')]"));
        wd.findElement(By.xpath("//input[@placeholder='Password']"));
        wd.findElement(By.xpath("//input[last()]"));
        wd.findElement(By.xpath("//input[position()=1]"));
        wd.findElement(By.xpath("//input[position()=2]"));
         wd.findElement(By.cssSelector("[name*='password']"));
        wd.findElement(By.xpath("//input[@name='password']"));

        wd.findElement(By.cssSelector("button[name='login']"));
        wd.findElement(By.cssSelector("button[name='registration']"));
        wd.findElement(By.xpath("//div[@class='login_login__3EHKB']//form/button[1]"));
        wd.findElement(By.xpath("//form/button[1]"));
        wd.findElement(By.xpath("//form/button[2]"));
        wd.findElement(By.xpath("//form/button[.='Login']"));
        wd.findElement(By.xpath("//button[contains(.,'Login')]"));
        wd.findElement(By.xpath("//button[@type='submit'][1]"));
        wd.findElement(By.xpath("//button[@type='submit'][2]"));
        wd.findElement(By.xpath("//button[@name='registration']"));


        wd.findElement(By.cssSelector("a[href='/home']"));
        wd.findElement(By.cssSelector("a[href='/about']"));
        wd.findElements(By.xpath("//a[@href='/home']"));
        wd.findElements(By.xpath("//a[@href='/about']"));
        wd.findElements(By.xpath("//a[contains(.,'HOME')]"));
        wd.findElements(By.xpath("//a[contains(.,'ABOUT')]"));
        wd.findElement(By.xpath("//a[text()='LOGIN']"));


    }







    @AfterMethod
    public void postCondition(){
    //wd.close();
    wd.quit();
    }
}