package Practise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassPractise {
    WebDriver driver;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
    }
    @After
    public void TearDown(){
        //driver.close();
    }
@Test

    public void myTest1() throws Exception {
        driver.get("https://sqe-automation.blogspot.com/2018/10/mouse-hover-menu.html");
        WebElement elementMainmenu=driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement elementChildmenu= driver.findElement(By.xpath("//a[@id='link1']"));
        navigatetosubmenu(elementChildmenu,elementMainmenu);
        navigateBackward();
        WebElement menu1=driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement child1=driver.findElement(By.xpath("//a[@id='link2']"));
        navigatetosubmenu(child1,menu1);
        navigateBackward();
        WebElement elementMainmenu2=driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement elementchildmenu2= driver.findElement(By.xpath("//a[@id='link3']"));
        navigatetosubmenu(elementchildmenu2,elementMainmenu2);

    }

    @Test
    public void myTest2(){
        driver.get("https://sqe-automation.blogspot.com/2018/09/sample-html-page.html");

        WebElement usernameElement = driver.findElement(By.xpath("//input[@name='username']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(usernameElement).click()
                .keyDown(usernameElement,Keys.SHIFT)
                .sendKeys(usernameElement,"Hello")
                .keyUp(usernameElement,Keys.SHIFT)
                .perform();

        //actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                //.sendKeys(Keys.BACK_SPACE)
                //.sendKeys(Keys.BACK_SPACE).perform();
        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
        Actions action = new Actions(driver);
        //action.moveToElement(passwordElement).click().contextClick(passwordElement).perform();
        action.moveToElement(passwordElement).click().sendKeys("hello").perform();
        WebElement loginElement = driver.findElement(By.xpath("//button[@type='submit']"));
        Actions actions1 = new Actions(driver);
        //actions1.moveToElement(actions1).



    }
    public void navigateBackward () throws Exception{
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().refresh();

    }
    public  void navigatetosubmenu(WebElement elementChildmenu,WebElement elementMainmenu ) {
        Actions actions = new Actions(driver);
        actions.moveToElement(elementMainmenu).moveToElement(elementChildmenu).click().perform();
    }
}
