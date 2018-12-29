package ClassRoomWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLink {
    @Test
    public void myTest1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sqe-automation.blogspot.com/2018/10/sample-link-verification.html");
        List<WebElement> a = driver.findElements(By.tagName("a"));
        Iterator<WebElement> iterator = a.iterator();
        while (iterator.hasNext()) {
            try {


                String url = iterator.next().getAttribute("href");
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.connect();
                int code= httpURLConnection.getResponseCode();
                if(code>=300){
                    System.out.println(url+"link is broken");
                }
                else{
                    System.out.println(url+"link is working fine ");
                }
            } catch (Exception e) {

            }



        }
        System.out.println("link verification completed");
        driver.close();
        System.out.println("this is the change that is done ");
        System.out.println("this is the change that is done2 ");
        System.out.println("this is the change that is done3 ");
        System.out.println("this is the change that is done4 ");
        System.out.println("this is the change that is done5 ");
        System.out.println("this is the change that is done6 ");
        System.out.println("this is the change that is done7 ");




    }
}
