package Assignments1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        String expectedTitle = "Facebook – log in or sign up";


        String actualTitle = driver.getTitle();


        System.out.println(expectedTitle);
        System.out.println(actualTitle);


        if (expectedTitle == actualTitle) {
            System.out.println("title matched");
        } else {
            System.out.println("title doesnot match");
        }
        driver.close();


    }
}
