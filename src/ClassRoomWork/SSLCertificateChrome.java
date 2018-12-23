package ClassRoomWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class SSLCertificateChrome {
    @Test
    public void myTest1(){
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cacert.org");






    }
}
