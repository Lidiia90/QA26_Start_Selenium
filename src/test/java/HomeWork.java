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
        WebElement element = wd.findElement(By.tagName("button"));
        WebElement element1 = wd.findElement(By.cssSelector("button"));
        WebElement element2 = wd.findElement(By.xpath("//button"));

        WebElement element3 = wd.findElement(By.tagName("body"));
        WebElement element4 = wd.findElement(By.cssSelector("body"));

        WebElement element5 = wd.findElement(By.tagName("div"));
        WebElement element6 = wd.findElement(By.cssSelector("div"));

        WebElement element7 = wd.findElement(By.tagName("h1"));
        WebElement element8 = wd.findElement(By.cssSelector("h1"));

        WebElement element9 = wd.findElement(By.tagName("a"));
        WebElement element10 = wd.findElement(By.cssSelector("a"));

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //by Class
        List<WebElement> containerList = wd.findElements(By.className("container"));
        List<WebElement> containerList1 = wd.findElements(By.cssSelector(".container"));
        WebElement element11 = wd.findElement(By.className("container"));
        WebElement element12 = wd.findElement(By.cssSelector(".container"));
        WebElement element13 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element14 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element15 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement element16 = wd.findElement(By.className("active"));
        WebElement element17 = wd.findElement(By.cssSelector(".active"));

        //by id
        WebElement element18 = wd.findElement(By.id("root"));
        WebElement element19 = wd.findElement(By.cssSelector("#root.container"));
        WebElement el31 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement element20 = wd.findElement(By.cssSelector("[href='/home']"));

        WebElement element21 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement element22 = wd.findElement(By.name("email"));

        WebElement element23 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement element24 = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        WebElement element25 = wd.findElement(By.cssSelector("[placeholder^='Em'"));
        WebElement element26 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        WebElement element27 = wd.findElement(By.cssSelector("[placeholder$='il'"));
        WebElement element28 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement element29 = wd.findElement(By.cssSelector("[placeholder*='ma'"));
        WebElement element30 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        //password

        //By.linkText
        WebElement linkElement = wd.findElement(By.linkText("HOME"));
        WebElement linkElement2 = wd.findElement(By.linkText("ABOUT"));
      
    }
}