/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author m_gab
 */
public class SearchTest {

    private WebDriver driver;
    private String baseUrl;

    public SearchTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testBooking() throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.priceline.com/");
        driver.findElement(By.xpath("//*[@id=\"tab-cruises\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"location\"]")).click();
        new Select(driver.findElement(By.id("location"))).selectByVisibleText("Bahamas");
        driver.findElement(By.id("cruiseLine")).click();
        new Select(driver.findElement(By.id("cruiseLine"))).selectByVisibleText("Carnival Cruise Lines");
        driver.findElement(By.id("zip")).click();
        driver.findElement(By.id("zip")).clear();
        driver.findElement(By.id("zip")).sendKeys("60173");
        driver.findElement(By.id("startDate")).click();
        new Select(driver.findElement(By.id("startDate"))).selectByVisibleText("December 2022");
        driver.findElement(By.id("duration")).click();
        driver.findElement(By.id("duration")).click();
        new Select(driver.findElement(By.id("duration"))).selectByVisibleText("3-5 Nights");
        driver.findElement(By.xpath("//*[@id=\"underFiftyFive\"]")).click();
        new Select(driver.findElement(By.id("underFiftyFive"))).selectByVisibleText("No");
        driver.findElement(By.xpath("//form[@id='cruise-form']/div/div[7]/button")).click();

    }
}
