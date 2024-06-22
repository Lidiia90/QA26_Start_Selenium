import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void homework1() {

        //by Tag name
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //by Class
        List<WebElement> containerList = wd.findElements(By.className("container"));
        List<WebElement> containerList1 = wd.findElements(By.cssSelector(".container"));

        //by id
        WebElement container1 = wd.findElement(By.cssSelector("#root.container"));

        //by attribute
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder='Password']"));

        //By.linkText
        WebElement linkElement = wd.findElement(By.linkText("HOME"));
        WebElement linkElement2 = wd.findElement(By.linkText("ABOUT"));
      
    }
}