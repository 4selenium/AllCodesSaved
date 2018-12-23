package ClassRoomWork;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPrcatise2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println("setting up the browser");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test(priority = 3)
    public void verifyTitleagain() {

        String title = driver.getTitle();
        System.out.println("comparing the title");
        Assert.assertEquals("OrangeHRM", title);


    }

    @Test(priority=4,groups={"regressionqa"})
    public void verifyLoginagain() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//a[@id='welcome']"));
        Assert.assertEquals("Welcome Admin", element.getText());
        Assert.assertTrue(element.isDisplayed());


    }


}
