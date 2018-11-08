package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sqe-automation.blogspot.com/2018/09/sample-html-page.html");
        driver.manage().window().maximize();


        //*[@id="post-body-353459300542438954"]/div[1]/table/tbody/tr[2]/td[2]
        //*[@id="post-body-353459300542438954"]/div[1]/table/tbody/tr[3]/td[2]

        String beforeXpath = "//*[@id='post-body-353459300542438954']/div[1]/table/tbody/tr[";
        String afterXpath = "]/td[2]";

        for (int i = 2; i <= 3; i++) {
            String actalXpath = beforeXpath + i + afterXpath;
            //System.out.println(actalXpath);

            WebElement element = driver.findElement(By.xpath(actalXpath));
            System.out.println(element.getText());
        }
       // driver.close();

    }
}
