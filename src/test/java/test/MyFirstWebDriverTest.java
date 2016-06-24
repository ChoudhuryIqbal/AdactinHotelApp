package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


/**
 * Created by a on 6/22/2016.
 */
public class MyFirstWebDriverTest {


    public WebDriver driver;


    public String url="http://www.adactin.com/HotelApp/";

    @BeforeMethod
    public void setUP(){
        driver= new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

@Test
    public void testMyFirstWebDriver() throws Exception{
    driver.get(url);
    Thread.sleep(2000);

    //enter username
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("adactin123");

//enter password
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("adactin123");
    Thread.sleep(2000);

//click login
    driver.findElement(By.xpath(".//*[@id='login']")).click();
//select sydeny

    new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");

    driver.findElement(By.id("Submit")).click();
    //radio button1

    driver.findElement(By.id("radiobutton_1")).click();
    driver.findElement(By.id("continue")).click();
Thread.sleep(3000);

    //fill up the form
    driver.findElement(By.id("first_name")).sendKeys("Choudhury");
    driver.findElement(By.id("last_name")).sendKeys("Iqbal");
    driver.findElement(By.id("address")).sendKeys("2477 Grand Ave");
    driver.findElement(By.id("cc_num")).sendKeys("1212121212121212");

    Thread.sleep(4000);
    new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
    new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("March");
    new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2015");

    driver.findElement(By.name("cc_cvv")).sendKeys("123");
    Thread.sleep(4000
    );
    driver.findElement(By.cssSelector("#book_now")).click();



}


}
