import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        // wd.get("https://telranedu.web.app/home");
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        // wd.navigate().forward();
        // wd.navigate().back();
    }


    @Test
    public void testTableCss(){
        List<WebElement> elementsTR = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("amount of table rows is:"+elementsTR.size());
        List<WebElement> tableColumns = wd.findElements(By.cssSelector("#customers tr th"));
        System.out.println("table columns is:"+tableColumns.size());
        WebElement elementRow3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        System.out.println(elementRow3.getText());
        WebElement elementLastColumpRow3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3) td:last-child"));
        System.out.println(elementLastColumpRow3.getText());







    }
    @AfterMethod
    public void postCondition(){

       // wd.quit();
    }
}