package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindId {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Hello");
        driver.findElement(By.xpath("//i[@class='Fz(26px) Mstart(2px) Icon-Fp2 IconNavSearch Icon-Fp2']")).click();

    }
}
