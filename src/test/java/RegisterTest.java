import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void register(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("beni");
        driver.findElement(By.name("middlename")).sendKeys("f");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("paval");
        driver.findElement(By.name("email")).sendKeys("beni.paval@artsoft.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("abcdefg");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcdefg");
        driver.findElement(By.name("is_subscribed")).click();
        driver.quit();
    }

    public void registerNoSub(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("beni");
        driver.findElement(By.name("middlename")).sendKeys("f");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("paval");
        driver.findElement(By.name("email")).sendKeys("beni.paval@artsoft.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("abcdefg");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcdefg");
        driver.quit();
    }

    public void registerWrongConfPass(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("beni");
        driver.findElement(By.name("middlename")).sendKeys("f");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("paval");
        driver.findElement(By.name("email")).sendKeys("beni.paval@artsoft.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("abcdefg");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcdifg");
        driver.findElement(By.name("is_subscribed")).click();
        driver.quit();
    }

    public void registerNoFirstName(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("");
        driver.findElement(By.name("middlename")).sendKeys("f");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("paval");
        driver.findElement(By.name("email")).sendKeys("beni.paval@artsoft.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("abcdefg");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcdefg");
        driver.findElement(By.name("is_subscribed")).click();
        driver.quit();
    }

    public void registerNoLastName(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("beni");
        driver.findElement(By.name("middlename")).sendKeys("f");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("beni.paval@artsoft.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("abcdefg");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("abcdefg");
        driver.findElement(By.name("is_subscribed")).click();
        driver.quit();
    }
}
