import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class remote_execution {
    public void test1() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.MAC);

        URL url = new URL("https://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, cap);
        driver.get("http://automtion.com/index.php");
        System.out.println(driver.getTitle());
        driver.quit();
    }


}
