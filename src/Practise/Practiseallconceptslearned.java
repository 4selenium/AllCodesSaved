package Practise;

import com.google.common.io.Files;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;


public class Practiseallconceptslearned {
    WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Set up Method");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        System.out.println(" this is just a test");
        System.out.println(" this is just a test2");

    }


    public void tearDown() {
        System.out.println("closing the browser");
        driver.close();
    }

    @Test
    public void myTest1() throws IOException {
        driver.findElement(By.xpath("//input[@name='q']"));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
        String text = driver.findElement(By.xpath("//div[@class='A8SBwf emcav']")).getText();
        if (text.contains("selenium interview questions")) {
            System.out.println("Found the element ");
        }
        driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@value='Google Search']")).click();
        TakesScreenshot screenshotdriver = (TakesScreenshot) driver;
        File srcFile = screenshotdriver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\daddy\\IdeaProjects\\MySeleniumProject\\src\\ClassRoomWork\\Practiseallconcepts.png");
        Files.copy(srcFile, destFile);
        System.out.println(driver.getTitle());
        System.out.println("Comparing actual and expected");
        Assert.assertEquals("Selenium - Google Search", driver.getTitle());
    }

    @Test

    public void myTest3() throws InterruptedException {
        driver.get("https://sqe-automation.blogspot.com/p/sample-pages-for-selenium-practice.html");
        driver.findElement(By.xpath("//a[contains(text(),'Sample JavaScrpt page to Show month and Show Alert')]")).click();
        driver.findElement(By.xpath("//button[@id='Month']")).click();
        wait1();
        //this is just for trial,sorry for spelling mistake


    }

    @Test

    public void myTest4() throws Exception {
        System.out.println("Welcome to test 4");
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sbl1']"));
        System.out.println("My list is " + elements);
        int counter = 0;
        for (WebElement currentElement : elements) {

                System.out.println(currentElement.getText());

                currentElement.click();
                driver.navigate().back();
                driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
                Thread.sleep(5000);
                 elements = driver.findElements(By.xpath("//div[@class='sbl1']"));
                System.out.println(elements);




        }
        counter++;
    }


    @Test
    public void myTest5() throws Exception {
        driver.get("https://sqe-automation.blogspot.com/2018/10/mouse-hover-menu.html");
        WebElement elementMainmenu = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement elementChild = driver.findElement(By.xpath("//a[text()='Yahoo']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementMainmenu)
                .moveToElement(elementChild)
                .click()
                .perform();

        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Yahoo"));
        System.out.println("Program completed");

    }

    @Test
    public void myTest6() {
        driver.get("https://sqe-automation.blogspot.com/2018/09/sample-html-page.html");
        WebElement element = driver.findElement(By.xpath("//input[@name='username']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click()
                .keyDown(element, Keys.SHIFT)
                .sendKeys(element, "Hello")
                .keyUp(element, Keys.SHIFT)
                .perform();


    }

    public void wait1() {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Jan']")));
        System.out.println(driver.findElement(By.xpath("//div[text()='Jan']")).getText());
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Feb']")));
        System.out.println(driver.findElement(By.xpath("//div[text()='Feb']")).getText());
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='March']")));
        System.out.println(driver.findElement(By.xpath("//div[text()='March']")).getText());

    }

    public void myTest7() throws Exception {
        System.out.println("Welcome to test 4");
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sbl1']"));
        System.out.println("My list is " + elements);

            for (int i = 0; i < 2; i++) {
                System.out.println(" i "+ i);
                elements.get(i).click();

                Thread.sleep(5000);
                driver.navigate().back();
                Thread.sleep(5000);
                driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
                elements = driver.findElements(By.xpath("//div[@class='sbl1']"));
                System.out.println("My List "+ elements);




            }


            //driver.navigate().back();


        }
@Test
    public  void myTest8() throws Exception  {



        driver.get("https://www.google.com/");




        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(3000);
        List<WebElement> mylist = driver.findElements(By.xpath("//div[@class='sbl1']"));
        int mysize= mylist.size();
        System.out.println("Size of list is" + mysize);

        List<WebElement> mylist2;

        for(int i=0;i<mysize;i++)
        {
            System.out.println("Getting the list");
            mylist2 = driver.findElements(By.xpath("//div[@class='sbl1']"));
            System.out.println(mylist2.toString());

            System.out.println("Index of i is " + i);
            mylist2.get(i).click();

            mylist2.clear();

            driver.navigate().back();

            driver.findElement(By.name("q")).sendKeys("Selenium");
            Thread.sleep(3000);


        }


    }


@Test
    public void myTest9(){
        driver.get("http://www.naukri.com");
    System.out.println("This is my commit");
    System.out.println("This is my commit on 05Jan19");

}



    }





