package Practise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import com.google.common.base.Function;

public class JunitLearn {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void myTest1() throws InterruptedException {


        driver.findElement(By.xpath("//input[@title='Search'][@name='q']")).click();
        driver.findElement(By.xpath("//input[@title='Search'][@name='q']")).sendKeys("Selenium");
        List<WebElement> elements = driver.findElements(By.xpath("//input[@value='Google Search']"));
        //Thread.sleep(3000);

        //driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@value='Google Search']")).click();
        int counter = 0;
        for (WebElement currentElement : elements) {
            if (counter == 0) {
                currentElement.click();
            }
            counter++;


        }


    }

    @Test
    public void test3() {
        driver.get("https://sqe-automation.blogspot.com/2018/09/function-myfunction-document.html");
        driver.findElement(By.xpath("//button[@id='Month']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='March']")));
        System.out.println(driver.findElement(By.xpath("//div[text()='March']")).getText());
    }

    @Test
    public void test4() {
        driver.get("https://sqe-automation.blogspot.com/2018/09/function-myfunction-document.html");
        driver.findElement(By.xpath("//button[@id='Month']")).click();
        Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(7))
                .pollingEvery(Duration.ofMillis(700))
                .ignoring(NoSuchElementException.class);


        WebElement myTextElement = fluentwait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                System.out.println("Finding the element from fluent wait ");
                return driver.findElement(By.xpath("//div[text()='March']"));


            }

        });
        System.out.println(driver.findElement(By.xpath("//div[text()='March']")).getText());
    }


}




