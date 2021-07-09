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

public class Selenium {
    public static WebDriver driver;

    public static void main(String s[]){
   // Setting browser driver/
        
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

        driver.findElement(By.id("email_create")).sendKeys("gnanasumithra@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Sumithra");
        driver.findElement(By.id("customer_lastname")).sendKeys("Aradhya");
        driver.findElement(By.id("passwd")).sendKeys("123456");
        driver.findElement(By.id("uniform-newsletter")).click();
        driver.findElement(By.id("optin")).click();
        Select dob=new Select(driver.findElement(By.id("days")));
        dob.selectByIndex(31);
        Select dob1=new Select(driver.findElement(By.id("months")));
        dob1.selectByIndex(7);
        Select dob2=new Select(driver.findElement(By.id("years")));
        dob2.selectByIndex(23);
        driver.findElement(By.id("company")).sendKeys("TestVagrant");
        driver.findElement(By.id("address1")).sendKeys("#284, 100 feet road ");
        driver.findElement(By.id("address2")).sendKeys("Hothur square, 1st floor");
        driver.findElement(By.id("city")).sendKeys("Bengaluru");
        Select st=new Select(driver.findElement(By.id("id_state")));
        st.selectByIndex(4);
        driver.findElement(By.id("postcode")).sendKeys("56075");
        Select con=new Select(driver.findElement(By.id("id_country")));
        con.selectByIndex(1);
        driver.findElement(By.id("other")).sendKeys("Hi ,Hello");
        driver.findElement(By.id("phone")).sendKeys("08023456890");
        driver.findElement(By.id("phone_mobile")).sendKeys("9886459032");
        driver.findElement(By.id("alias")).sendKeys("Vignanagar");
        driver.findElement(By.id("submitAccount")).click(); //account created
        driver.findElement(By.id("search_query_top")).sendKeys("Skirt");// search bar
        driver.findElement(By.name("submit_search")).click();
        driver.get("http://automationpractice.com/index.php?id_product=3&controller=product&search_query=Skirt&results=1"); // purchasing the first product
        driver.findElement(By.id("add_to_cart")).click(); //adding to cart
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click(); //proceeding next
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click(); //proceeding next
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click(); //proceeding next
        driver.findElement(By.name("cgv")).click(); //proceeding next
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click(); //proceeding next
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click(); //proceeding next for payment 
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click(); //purchased the product
        driver.quit();
        System.out.println("Logged in and product purchased successfully ");
}

}
