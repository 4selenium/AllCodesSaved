package ClassRoomWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://sqeautomation.wordpress.com/sample-html-page/");
        driver.manage().window().maximize();
        Select oSelect = new Select(driver.findElement(By.xpath("//select[@id='g11-text-1']")));
        oSelect.selectByIndex(2);
        System.out.println(oSelect.getFirstSelectedOption().getText());
        oSelect.getOptions();


    }
}
