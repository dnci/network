import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageAndSearch extends BasePage{

    public MainPageAndSearch(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfUrlSuccess() {

        return getName().contains("NetWork");
    }

    private String getName(){
        return driver.findElement(By.cssSelector("a[class='header__logo']")).getText(); // Network İsmi
    }
    public void kisisel(){
        click(By.id("onetrust-accept-btn-handler"));
    }

    public  void search(String text) {
        type(By.id("search"),text);
        clickEnter(By.id("search"));
    }


}
