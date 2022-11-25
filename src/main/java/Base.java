import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);

        driver.get("https://www.network.com.tr/");

    }

    @AfterAll
    public void tearDown(){

        //driver.close();
        //driver.quit();
    }
}
