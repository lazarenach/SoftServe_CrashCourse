import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest {
    @Test
    public void FirstTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\MyTest\\src\\test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("SoftServe");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        String nameOfFirstLink = driver.findElement(By.className("LC20lb")).getText();
        Assert.assertEquals(nameOfFirstLink, "SoftServe: Домашня");
        driver.findElement(By.className("LC20lb")).click();
        String myURL = driver.getCurrentUrl();
        Assert.assertEquals(myURL,"https://www.softserveinc.com/uk-ua/");

        driver.close();
    }
}