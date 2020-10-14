import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloSelenium {
    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://trello.com/");
    }

    @Test
   public void logIN(){
       wd.findElement(By.cssSelector("[href='/login']")).click();
       wd.findElement(By.name("user")).click();
       wd.findElement(By.name("user")).clear();
       wd.findElement(By.name("user")).sendKeys("dumbalien86@gmail.com" + Keys.ENTER);
//        wd.findElement(By.id("password")).click();
//        wd.findElement(By.id("password")).clear();
//        wd.findElement(By.id("password")).sendKeys("TrelloLO2020" + Keys.ENTER);
    }



    @AfterClass(enabled = false)
    public void tearDown(){
        wd.quit();

    }

}
