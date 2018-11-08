package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        String actualEmail = driver.findElement(By.xpath("//label[contains(text(),'Email or Phone')]")).getText();
        String expectedEmail = "Email or Phone";
        if (expectedEmail.equalsIgnoreCase(actualEmail)) {
            System.out.println("Email Text is present ");
        } else {
            System.out.println("Email Text is not present");
        }
        String actualPassword = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText();
        String expectedPassword = "Password";
        if (expectedPassword.equalsIgnoreCase(actualPassword)) {
            System.out.println("Password is present ");
        } else {
            System.out.println(" Password text is not present ");
        }
        driver.close();


    }
}

