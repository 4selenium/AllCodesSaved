package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q' and @title='Search']")).sendKeys("Hello");
        driver.findElement(By.xpath("//div[@class='VlcLAe']//input[@name='btnK']")).click();
        driver.close();

    }
}
