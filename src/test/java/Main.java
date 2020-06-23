import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {

//        Decomentati pentru windows cu Chrome V 83
      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");



 //       Login login = new Login();
 //       login.login();

 //       WishListTest wishlist = new WishListTest();
  //      wishlist.wishList();

        RegisterTest registerTest = new RegisterTest();
        registerTest.register();
        registerTest.registerNoFirstName();
        registerTest.registerNoLastName();
        registerTest.registerNoSub();
        registerTest.registerWrongConfPass();








    }


}
