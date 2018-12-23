package ClassRoomWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Title is matching");
        } else {
            System.out.println("Title doesnot match");
        }
        driver.close();

    }
}
