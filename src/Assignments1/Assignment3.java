package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facbook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email' and @class='inputtext']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='pass' and @class='inputtext']")).sendKeys("");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
        String actaulHome=driver.findElement(By.xpath("//a[@class=\"_2s25\"]")).getText();
        String expectedHome="Home";
        if(expectedHome.equalsIgnoreCase(actaulHome)){
            System.out.println("Logged in to the Facebook account  ");
        }
        else{
            System.out.println("Didnot log in to  the FaceBook account ");
        }
        driver.close();

    }
}
