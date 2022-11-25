import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By firstPrice =By.cssSelector("span[class='cartItem__price -sale']"); //indirimli fiyat
    By secondPrice =By.cssSelector("span[class='cartItem__price -old -labelPrice']"); // normal fiyat

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getFirstPrice(){
        String count =find(firstPrice).getText();
        String result = count.replace("TL"," ");
        int first = Integer.parseInt(result);
        return first;
    }
    private int getSecondPrice(){
        String count =find(secondPrice).getText();
        String result = count.replace("TL"," ");
        int second = Integer.parseInt(result);
        return second;
    }


    public boolean priceControl(){
        if(getFirstPrice()<getSecondPrice()){
            return true;
        }
         else return false;
    }

    public void contineClick(){
        click(By.cssSelector("button[class='continueButton n-button large block text-center -primary']"));
    }

}
