package Practise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demoaut1 {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp( String browser){
        if(browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
            driver = new FirefoxDriver();


        }



    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test

    public void myTest1(){
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        Assert.assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
        WebElement element= driver.findElement(By.xpath("//img[@src='/images/banner2.gif']"));
        System.out.println(element.getText());
        Assert.assertTrue(element.isDisplayed());



    }

}
