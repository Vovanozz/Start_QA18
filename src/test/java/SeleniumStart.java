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
    public void findElement(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
        WebElement div = wd.findElement(By.tagName("div"));
        List<WebElement> divList = wd.findElements(By.tagName("div"));
        System.out.println(divList.size());
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h2 = wd.findElement(By.tagName("h2"));
        WebElement h3 = wd.findElement(By.tagName("h3"));
        List<WebElement> h1List = wd.findElements(By.tagName("h1"));
        System.out.println(h1List.size());

        WebElement home = wd.findElement(By.linkText("HOME"));
       System.out.println(home.getAttribute("href"));
        WebElement about = wd.findElement(By.linkText("ABOUT"));
        System.out.println(about.getAttribute("href"));
        WebElement login = wd.findElement(By.linkText("LOGIN"));
        System.out.println(login.getAttribute("href"));

        WebElement partialTextLogin = wd.findElement(By.partialLinkText("LOG"));
        WebElement partialTextAbout = wd.findElement(By.partialLinkText("ABO"));
        WebElement partialTextHome = wd.findElement(By.partialLinkText("HO"));

        WebElement root = wd.findElement(By.id("root"));
        WebElement container = wd.findElement(By.className("container"));
        WebElement active = wd.findElement(By.className("active"));
        WebElement element1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));



    }


    @AfterMethod
    public void postCondition(){
    wd.close();
   // wd.quit();
    }
}