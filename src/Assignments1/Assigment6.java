package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sqeautomation.wordpress.com/sample-html-page/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text' and @name='g11-name']")).sendKeys("Aji");
        driver.findElement(By.xpath("//input[@type='email' and @name='g11-email']")).sendKeys("John@gmail.com");
        driver.findElement(By.xpath("//input[@type='url' and @name='g11-website']")).sendKeys("http://www.cnn.com");
        driver.findElement(By.xpath("//input[@type='submit' and @class='pushbutton-wide']")).submit();
        driver.close();

    }
}
