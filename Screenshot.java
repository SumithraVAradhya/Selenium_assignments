import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    public static WebDriver driver;

    public static void main(String s[]) throws IOException {

        // Setting browser driver


        WebDriverManager.chromedriver().setup();

        // Creating chrome browser instance and launching it
        driver = new ChromeDriver();
        //Setting implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Google");
        System.out.println("Completed");
        // Navigating to Base URL
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //Locating input Element
        //downcast the driver to access TakesScreenshot method
        TakesScreenshot ts = (TakesScreenshot) driver;
        //capture screenshot as output type FILE
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("Sumithra.png"));
        driver.quit();
        System.out.println("Screenshot is taken");
    }

}
