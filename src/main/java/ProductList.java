import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductList extends BasePage {

    public ProductList(WebDriver driver) {
        super(driver);
    }

    public void swipeUntilMore(){
            scrollTo(0, 17400);
        }

    public void clickMore(){
        click(By.cssSelector("button[class='button -secondary -sm relative']"));
        }
    public void choiseDiscout() throws InterruptedException {
        click(By.cssSelector("span[class='tool__text']"));
        Thread.sleep(3000);
        click(By.xpath("//*[@id='pagedListContainer']/div[1]/div/div[3]/div[2]/div/ul/li[4]/span"));
    }
    public void choiseProductAndSize() throws InterruptedException {
        click(By.xpath("//*[@id='product-115346']/div/div[1]")); // random beden secimi

            Random random = new Random();
            int x = random.nextInt(4);
            getAllRadioBox().get(x).click();
            waitsec();

         click(By.xpath("//*[@id='mainContent']/div/div[1]/div[2]/div[2]/div/div[7]/button[2]")); // Sepete Ekle
         Thread.sleep(3000);
         click(By.cssSelector("[class='header__icon -shoppingBag']"));
         waitsec();
         click(By.xpath("//*[@id='header__desktopBasket']/div/div[3]/a")); // sepete git
         waitsec();

    }
    private List<WebElement> getAllRadioBox(){
        return findAll(By.cssSelector("[class='product__size radio-box']"));
    }

    }

