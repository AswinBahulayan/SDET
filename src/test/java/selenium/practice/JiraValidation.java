package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class JiraValidation {

    public WebDriver driver=new ChromeDriver();
    public static String summary="Test new project "+new Random().nextInt(1000,2000);

    @BeforeMethod
    public void login() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://api-training.atlassian.net/");
        driver.manage().window().maximize();
        setText(By.id("username"), "hari.radhakrishnan@testleaf.com");
        clickElement(By.id("login-submit"));
        setText(By.id("password"), "India@123");
        clickElement(By.id("login-submit"));
    }

    @Test
    public void test(){
        clickElement(By.xpath("//p[text()='SDET-5']/../.."));
        clickElement(By.id("createGlobalItem"));
        setText(By.xpath("//span[text()='Create issue']/../../../../..//input[@name='summary']"),
                summary);
        clickElement(By.xpath("//button[@type='submit']/span[text()='Create']"));
        clickElement(By.xpath("//span[text()='Go to Backlog']/.."));
        setText(By.xpath("//input[@aria-label='Search backlog']"),summary);
    }

    public void clickElement(By element){
        waitForelementToDisPlay(element);
        driver.findElement(element).click();
    }

    public void setText(By element,String value){
        driver.findElement(element).sendKeys(value);
    }

    public boolean waitForelementToDisPlay(By element){
        boolean flag=false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
            flag=true;
        }catch (Exception e){
            System.out.println("an exception occured :"+e.getMessage());
        }
        return flag;
    }

}
