import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.support.ui.Select;

        import java.util.Iterator;
        import java.util.List;
        import java.util.concurrent.TimeUnit;

public class Selenium_headless {
    public static WebDriver driver;

    public static void main(String s[]){

   // Setting browser driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); //headless mode

        WebDriverManager.chromedriver().setup();

        // Creating chrome browser instance and launching it
        driver = new ChromeDriver(options);
        //Setting implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Google");
        System.out.println("Completed");
 
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        //Locating input Element

        driver.findElement(By.id("email_create")).sendKeys("gnanasumithra@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.quit();
        System.out.println("Running in headless mode");


    }

}
