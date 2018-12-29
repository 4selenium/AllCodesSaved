package ClassRoomWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class JavascriptTest {
    WebDriver driver;



    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
         driver = new ChromeDriver();


    }


    public void myTest1()  {

        driver.get("http://www.thenextweb.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        System.out.println("Scrolling page finsished");





    }
    @Test
    public void myTest2()  {

        driver.get("http://www.google.com/");

        WebElement myElmnt =driver.findElement(By.xpath("//*[@name='q']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click()", myElmnt);﻿
        System.out.println(" we could not finish the test ");




    }

}

