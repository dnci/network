import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProduct extends BasePage{
    public DeleteProduct(WebDriver driver) {
        super(driver);
    }
    public void mainPageCardClick() throws InterruptedException {
        By cardIcon = By.xpath("/html/body/div[2]/header/div/div/div[3]/div[3]/button"); //septe ıcon tıkla
        click(cardIcon);
        waitsec();
}
    public void remove(){
        By removeProduct = By.xpath("//*[@id='header__desktopBasket']/div/div[2]/div/div[3]");
        click(removeProduct); // sepeti sil
    }

}
