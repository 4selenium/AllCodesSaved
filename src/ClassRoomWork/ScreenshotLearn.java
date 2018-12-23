package ClassRoomWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import java.io.File;


public class ScreenshotLearn {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void teardown() {
        driver.close();
    }

    @Test
    public void myTest() {
        driver.get("http://toolsqa.com/automation-practice-table/");
        driver.manage().window().maximize();
        try {
            TakesScreenshot screenshotdriver = (TakesScreenshot) driver;
            File srcFile = screenshotdriver.getScreenshotAs(OutputType.FILE);
            File destFile = new File("C:\\Users\\daddy\\IdeaProjects\\MySeleniumProject\\src\\ClassRoomWork\\abc.png");
            Files.copy(srcFile, destFile);
        } catch (Exception e) {

        }

        System.out.println("Program is complted ");


    }

    @Test
    public void myTest2() {
        driver.get("https://www.google.com");
        try {
            TakesScreenshot screenshotdriver = (TakesScreenshot) driver;
            File srcFile = screenshotdriver.getScreenshotAs(OutputType.FILE);
            File destFile = new File("C:\\Users\\daddy\\IdeaProjects\\MySeleniumProject\\src\\ClassRoomWork\\google.png");
            Files.copy(srcFile, destFile);
        } catch (Exception e) {

        }
        System.out.println("Program is complted");
    }

    @Test
    public void myTest3() {
        driver.get("https://sqeautomation.wordpress.com/sample-html-page/");

        driver.findElement(By.xpath("//input[@type='text' and @name='g11-name']")).sendKeys("Aji");
        driver.findElement(By.xpath("//input[@type='email' and @name='g11-email']")).sendKeys("John@gmail.com");
        driver.findElement(By.xpath("//input[@type='url' and @name='g11-website']")).sendKeys("http://www.cnn.com");
        driver.findElement(By.xpath("//input[@type='submit' and @class='pushbutton-wide']")).submit();


    }
}
