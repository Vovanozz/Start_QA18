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

        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("active"));
        wd.findElement(By.tagName("form"));
        WebElement email = wd.findElement(By.name("email"));
        WebElement password = wd.findElement(By.name("password"));
        List<WebElement> buttonList = wd.findElements(By.tagName("button"));
        WebElement buttonEl=buttonList.get(0);
        WebElement buttonEl1=buttonList.get(1);
        List<WebElement> inputList = wd.findElements(By.tagName("input"));
        WebElement inputEl=inputList.get(0);
        WebElement inputEl1=inputList.get(1);
        WebElement login = wd.findElement(By.linkText("LOGIN"));
        System.out.println(login.getAttribute("href"));
        wd.findElement(By.partialLinkText("LOG"));
        WebElement about = wd.findElement(By.linkText("ABOUT"));
        WebElement home = wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("ABO"));
        wd.findElement(By.partialLinkText("HO"));
        List<WebElement> divList = wd.findElements(By.tagName("div"));
        System.out.println(divList.size());
        wd.findElement(By.id("root"));
        List<WebElement> h1List = wd.findElements(By.tagName("h1"));
        System.out.println(h1List.size());
         wd.findElement(By.tagName("h2"));
         wd.findElement(By.tagName("h3"));

    }







    @AfterMethod
    public void postCondition(){
    wd.close();
   // wd.quit();
    }
}