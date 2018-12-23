package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWebTable {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://toolsqa.com/automation-practice-table/");
       driver.manage().window().maximize();
       String beforeXpath="//*[@id=\"content\"]/table/tbody/tr[";
       String afterXpath= "]/td[1]";

       for(int i=1;i<5;i++){
           String actualXpath= beforeXpath+i+afterXpath;
           //System.out.println(actualXpath);
           WebElement element= driver.findElement(By.xpath(actualXpath));
           System.out.println(element.getText());
       }

    }
}
