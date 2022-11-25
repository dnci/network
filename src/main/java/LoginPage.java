import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By emailLocator = By.id("n-input-email");
    By passwordLocator = By.xpath("//*[@id='n-input-password']");
    By loginLocator = By.cssSelector("button[class='n-button large block text-center -primary ']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void emailPassword(String txt1,String txt2) throws InterruptedException {

       // click(By.cssSelector("svg[class='header__icon -userIcon']"));
        //waitsec();
        type(emailLocator,txt1);
        Thread.sleep(3000);
        type(passwordLocator,txt2);
        Thread.sleep(1000);
        click(loginLocator);

    }

    public void clickNetwork(){
        click(By.xpath("//*[@id='cop-app']/div/div/header/div/div/div[2]/a")); // network tıkla

}
}
