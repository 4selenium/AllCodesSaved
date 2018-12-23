package ClassRoomWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class SSLCertificateIE {
    @Test
    public void myTest1(){
        System.setProperty("webdriver.ie.driver","C:\\Selenium Jar\\IEDriverServer.exe");
        /*InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        internetExplorerOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);*/


        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.cacert.org");
        driver.navigate().to("javascript:document.getElementById('overridelink').click()");


        }
}
