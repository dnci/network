import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class TestPage extends Base{
    MainPageAndSearch mainPageAndSearch ;
    ProductList productList;
    CartPage cartPage;
    LoginPage loginPage;
    DeleteProduct deleteProduct ;

    final static Logger logger = Logger.getLogger(String.valueOf(TestPage.class));

    @Test
    @Order(1)
    public void MainPageSearchTest(){
        mainPageAndSearch = new MainPageAndSearch(driver);
        logger.info("!!!!!!!!! Test başlatildi. !!!!!!!!");
        mainPageAndSearch.checkIfUrlSuccess();
        mainPageAndSearch.kisisel();
        mainPageAndSearch.search("Ceket");
        logger.info("!!!!!!!!! Test başarili. !!!!!!!!");
    }

    @Test
    @Order(2)
    public void productListTest() throws InterruptedException {
       productList = new ProductList(driver);
       productList.swipeUntilMore();
       productList.clickMore();
       Thread.sleep(3000);
       productList.choiseDiscout();
       Thread.sleep(3000);
       productList.choiseProductAndSize();
    }
    @Test
    @Order(3)
    public void CardPageTest(){
        cartPage = new CartPage(driver);

        cartPage.contineClick();

       // cartPage.priceControl();
    }

    @Test
    @Order(4)
    public void loginPageTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.emailPassword("nur160@gmail.com","yHK3Cw5bVT.iKP");
        loginPage.clickNetwork();
}

    @Test
    @Order(5)
    public void deleteProduct() throws InterruptedException {
        deleteProduct = new DeleteProduct(driver);
        deleteProduct.mainPageCardClick(); // anasayfa sepet ıconu
        deleteProduct.remove(); // sepetten ürün sil
}
}
