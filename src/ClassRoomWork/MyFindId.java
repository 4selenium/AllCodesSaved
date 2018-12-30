package ClassRoomWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFindId {
    @Test
    public  void main2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@jsname='gNO89b']")).click();
        //This is just a test 
        //This is just a test2 
        

    }
}




