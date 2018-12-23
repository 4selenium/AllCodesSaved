package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.util.List;

public class PractiseWebTable1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://demo.automationtesting.in/WebTable.html");
        driver.manage().window().maximize();
        //Select oSelect= new Select(driver.findElement(By.xpath("//select[@id='g11-text-1']")));
        //List<WebElement> allSelectedOptions = oSelect.getOptions();
        //for(WebElement currentElement:allSelectedOptions){
        //System.out.println(currentElement.getText());
        //}


        //selct.selectByIndex(0);
        //System.out.println(selct.getFirstSelectedOption().getText());
        //System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Taiwan')]//preceding::th[@scope='row'][1]")).getText());
        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class,'ui-grid-cell-cont')]"));

        for (WebElement currentElement : elements)
        {
            if (currentElement.getText().equalsIgnoreCase("vishallaniya@gmail.com"))
            {
                System.out.println(currentElement.getText());
                Assert.assertTrue(currentElement.getText().equalsIgnoreCase("vishallaniya@gmail.com"));

            }





        }

    }
}

