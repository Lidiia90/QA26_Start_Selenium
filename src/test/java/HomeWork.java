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
        WebElement element = wd.findElement(By.className("navbar-logged_nav__2Hx7M"));
        WebElement element1 = wd.findElement(By.cssSelector(".navbar-logged_nav__2Hx7M"));

        List<WebElement> containerList = wd.findElements(By.className("container"));
        List<WebElement> containerList1 = wd.findElements(By.cssSelector(".container"));

        //by id
        WebElement container = wd.findElement(By.id("container"));
        WebElement container1 = wd.findElement(By.cssSelector("#root.container"));

        //by attribute
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='#home']"));
        WebElement a3 = wd.findElement(By.cssSelector("[href='#about']"));
        WebElement a4 = wd.findElement(By.cssSelector("[href='#contacts']"));
        WebElement a5 = wd.findElement(By.cssSelector("[href='#add']"));

        //by name
        WebElement inputElement = wd.findElement(By.name("LastName"));
        WebElement inputElements1 = wd.findElement(By.cssSelector("[name='Name']"));
        WebElement inputElement2 = wd.findElement(By.name("Phone"));
        WebElement inputElement3 = wd.findElement(By.name("email"));
        WebElement inputElement4 = wd.findElement(By.name("Address"));
        WebElement inputElement5 = wd.findElement(By.name("description"));

        //By.linkText
        WebElement linkElement = wd.findElement(By.linkText("HOME"));
        WebElement linkElement2 = wd.findElement(By.linkText("ABOUT"));
        WebElement linkElement3 = wd.findElement(By.linkText("CONTACTS"));
        WebElement linkElement4 = wd.findElement(By.linkText("ADD"));



    }
}