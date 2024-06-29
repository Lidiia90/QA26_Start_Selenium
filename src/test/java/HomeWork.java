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
public void classwork(){
        //parent
        WebElement el = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

        //ancestor or self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

    }

    @Test
    public void homework1() {

        //by Tag name
        WebElement element = wd.findElement(By.tagName("button"));
        WebElement element1 = wd.findElement(By.cssSelector("button"));
        WebElement element2 = wd.findElement(By.xpath("//button"));

        WebElement element3 = wd.findElement(By.tagName("body"));
        WebElement element4 = wd.findElement(By.cssSelector("body"));
        WebElement element31 = wd.findElement(By.xpath("//body"));

        WebElement element5 = wd.findElement(By.tagName("div"));
        WebElement element6 = wd.findElement(By.cssSelector("div"));
        WebElement element32 = wd.findElement(By.xpath("//div"));

        WebElement element7 = wd.findElement(By.tagName("h1"));
        WebElement element8 = wd.findElement(By.cssSelector("h1"));
        WebElement element33 = wd.findElement(By.xpath("//h1"));

        WebElement element9 = wd.findElement(By.tagName("a"));
        WebElement element10 = wd.findElement(By.cssSelector("a"));
        WebElement element34 = wd.findElement(By.xpath("//a"));

        WebElement el9 = wd.findElement(By.tagName("form"));
        WebElement el10 = wd.findElement(By.cssSelector("form"));
        WebElement el34 = wd.findElement(By.xpath("//form"));

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));
        List<WebElement> list1 = wd.findElements(By.xpath("//a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));
        WebElement input2 = wd.findElement(By.xpath("//input"));

        //by Class
        List<WebElement> containerList = wd.findElements(By.className("container"));
        List<WebElement> containerList1 = wd.findElements(By.cssSelector(".container"));
        WebElement element11 = wd.findElement(By.className("container"));
        WebElement element12 = wd.findElement(By.cssSelector(".container"));
        WebElement element13 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element14 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element15 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement element35 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement element16 = wd.findElement(By.className("active"));
        WebElement element17 = wd.findElement(By.cssSelector(".active"));
        WebElement element36 = wd.findElement(By.xpath("//*[@class='active']"));

        //by id
        WebElement element18 = wd.findElement(By.id("root"));
        WebElement element19 = wd.findElement(By.cssSelector("#root.container"));
        WebElement element38 = wd.findElement(By.xpath("//*[@id='root' and contains(@class,'container')]"));
        WebElement el31 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement element20 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement element37 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement element21 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement element22 = wd.findElement(By.name("email"));
        WebElement element39 = wd.findElement(By.xpath("//*[@name='email']"));

        WebElement element23 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement element24 = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        WebElement element25 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement element26 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        WebElement element29 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement element30 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        WebElement element27 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement element28 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement element40 = wd.findElement(By.xpath("//input[@name='password' or @placeholder='Password']"));

        WebElement element41 = wd.findElement(By.cssSelector("[placeholder^='Pas']"));
        WebElement element42 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));

        WebElement element43 = wd.findElement(By.cssSelector("[placeholder*='swo']"));
        WebElement element44 = wd.findElement(By.xpath("//*[contains(@placeholder,'swo')]"));

        WebElement element45 = wd.findElement(By.cssSelector("[placeholder$='rd']"));
        WebElement element46 = wd.findElement(By.xpath("//*[contains(@placeholder,'rd')]"));

        //By.linkText
        WebElement linkElement = wd.findElement(By.linkText("HOME"));
        WebElement linkElement1 = wd.findElement(By.xpath("//a[text()='HOME']"));

        WebElement linkElement2 = wd.findElement(By.linkText("ABOUT"));
        WebElement linkElement3 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
        
    }
}