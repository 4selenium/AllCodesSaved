package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathPractising {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        //String  element =driver.findElement(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']//following::div/label[1]")).getText();
       // String element3= driver.findElement(By.xpath("//div[@class='form-group']//label[contains(text(),'Gender')]")).getText();
       // String element1= driver.findElement(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label']//preceding::div/label[contains(text(),'Full Name*')]")).getText();
        driver.findElement(By.xpath("//a[contains(text(),'More')]")).click();
        System.out.println(driver.findElement(By.xpath("//a[contains(text(),'ProgressBar')]")).getText());
        //String element4=driver.findElement(By.xpath("//a[contains(text(),'ProgressBar')]//following::a[contains(text(),'ProgressBar')]")).getText();

        /*List<WebElement> progressBar = driver.findElements(By.xpath("//a[contains(text(),'ProgressBar')]"));
        int counter=0;
        for(WebElement currentElement: progressBar){
            if(counter==1){
                System.out.println(currentElement.getText());


            }
            counter++;



        }*/
        //System.out.println(element);
        //System.out.println(element1);
        //System.out.println(element3);
        //System.out.println(element4);
    }
}
