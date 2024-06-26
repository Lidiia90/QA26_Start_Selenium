import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///Users/lidashpektorovska/%D0%94%D0%BE%D0%BA%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8C%20%D1%81%20%D0%A0%D0%B0%D0%B1%20%D1%81%D1%82%D0%BE%D0%BB%D0%B0/HI%20TECH/AVTOMATION%20%D0%BF%D0%BE%D0%B2%D1%82%D0%BE%D1%80%D0%BD%D1%8B%D0%B8%CC%86%20%D0%BA%D1%83%D1%80%D1%81/LESSON/2%20lesson/21.index.html");
    }
    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }

    @Test
    public void cssLocators() {
        //by tagName
        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> a = wd.findElements(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.cssSelector("a"));
        //a.size();

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        //by Class
        WebElement divContainer = wd.findElement(By.className("container"));
        WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navList = wd.findElements(By.className("nav-item"));
        List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

        //by Id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
       //start
        WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        //end
        WebElement inputName2 = wd.findElement(By.cssSelector("[placeholder$='name']"));
        //contains
        WebElement inputName3 = wd.findElement(By.cssSelector("[placeholder*='your']"));

        WebElement a2 = wd.findElement(By.cssSelector("[href='#item3']"));

        //by name
        WebElement inputS = wd.findElement(By.name("surename"));
        WebElement inputS1 = wd.findElement(By.cssSelector("[name='surename']"));

        //By.linkText && By.partialLinkText
        WebElement a3  = wd.findElement(By.linkText("Item 1"));
        WebElement a4  = wd.findElement(By.partialLinkText("m 1"));


    }
}