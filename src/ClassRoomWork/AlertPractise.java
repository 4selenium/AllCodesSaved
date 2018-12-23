package ClassRoomWork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class AlertPractise {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://sqe-automation.blogspot.com/2018/10/blog-post.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        System.out.println("setting up the browser");

    }

    public void myTest1(){
        driver.findElement(By.xpath("//button[@id='Alert2']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='AlertMessage']")).getText());


    }

    public void myTest2() throws Exception{

        driver.switchTo().frame("Iframe1");

        //Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Hello");

    }
    @Test
    public void  myTest3(){
        driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        Set<String> childrenwithParent = driver.getWindowHandles();

        for(String currentPerson:childrenwithParent){
            if(currentPerson.equalsIgnoreCase(parent)){

            }
            else{
                driver.switchTo().window(currentPerson);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }



    }
}
