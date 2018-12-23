package ClassRoomWork;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNGPrcatise {

    WebDriver driver;

    @BeforeMethod(groups = {"regressionqa"})
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium Jar\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println("setting up the browser");
    }

    @AfterMethod(groups={"regressionqa"})
    public void tearDown() {
        driver.close();
    }

    @Test(priority = 1,groups={"smokeqa","regressionqa"},dataProvider = "getdata")
    public void verifyTitle(String user,String password) {
        System.out.println(user);
        System.out.println(password);


        String title = driver.getTitle();
        System.out.println("comparing the title");
        Assert.assertEquals("OrangeHRM", title);


    }

    @Test(priority=2,groups={"regressionqa"})
    public void verifyLogin() throws InterruptedException {
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

@DataProvider
    public Object[][] getdata(){
        Object[][] object= new Object[2][2];
        object[0][0]="Admin";
        object[0][1]="admin123";
        object[1][0]="Admin";
        object[1][1]="admin123";
        return  object;


}




}

