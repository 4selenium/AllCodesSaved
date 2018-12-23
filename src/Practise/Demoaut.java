package Practise;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class Demoaut {

    WebDriver driver;

    @BeforeMethod()
    @Parameters("browser")
    public void setUp(String browser){
        if(browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else{
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
        System.out.println("setting up the browser");


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test(priority = 1,dataProvider = "getData")
    public void myTestTest(String userName,String passWord){
        System.out.println(userName);
        System.out.println(passWord);
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//input[@name='login']")).click();
        Assert.assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
        WebElement element= driver.findElement(By.xpath("//img[@src='/images/banner2.gif']"));
        System.out.println(element.getText());
        Assert.assertTrue(element.isDisplayed());



    }
    @DataProvider
    public Object [][] getData(){
        Object[][] object= new Object[4][2];
        object[0][0]="Username";
        object[0][1]="Password";
        object[1][0]="tutorial";
        object[1][1]="tutorial";
        object[2][0]="tutorial";
        object[2][1]="tutorial";
        object[3][0]="tutorial";
        object[3][1]="tutorial";



        return object;

    }

}
