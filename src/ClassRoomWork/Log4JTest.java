package ClassRoomWork;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;


public class Log4JTest {


    @Test
    public void myTest1() {
        PropertyConfigurator.configure(".\\log4j.properties");
        Logger logger= Logger.getLogger("GenerateLogs");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        logger.info("opening Google website");
        logger.info("closing the browser");
        driver.close();
        logger.info("quitting the driver");




    }

    @Test
    public void myTest2() {
        PropertyConfigurator.configure(".\\log4j.properties");
        Logger logger= Logger.getLogger("GenerateLogs");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        logger.info("opening Google website");
        logger.info("closing the browser");
        driver.close();
        logger.info("quitting the driver");



    }
}
