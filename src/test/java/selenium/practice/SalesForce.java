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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class SalesForce {
    private static WebDriver driver = null;

    @BeforeMethod
    public void login() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().window().maximize();
        setText(By.id("username"), "aswinbahulayan@gmail.com");
        setText(By.id("password"), "Hpaix@7613");
        clickElement(By.id("Login"));
    }

    @Test
    public void createNewRefund() throws InterruptedException {
        clickElement(By.xpath("//div[@role='navigation']/button"));
        clickElement(By.xpath("//button[@aria-label='View All Applications']"));
        clickElement(By.xpath("//p[text()='Service Console']/ancestor::a"));
        clickElement(By.xpath("//button[@aria-label='Show Navigation Menu']"));
        clickElement(By.xpath("//a[@data-itemid='Refund']"));
        displayAsTableOrSplitView("split");
        clickElement(By.xpath("//a[@title='Show one more action']"));
        clickElementUsingAction(By.xpath("//div[text()='New']/parent::a"));
        clickElement(By.xpath("//div[text()='admin']/ancestor::a"));
        clickElementJs(By.xpath("//span[text()='Status']/../..//a[contains(text(),'None')]"));
        clickElement(By.xpath("//a[text()='Canceled']"));
        setText(By.xpath("//span[text()='Amount']/../..//input[@type='text']"), "50000");
        clickElement(By.xpath("//span[text()='Type']/../..//a[contains(text(),'None')]"));
        clickElement(By.xpath("//a[text()='Referenced']"));
        clickElement(By.xpath("//span[text()='Processing Mode']/../..//a[contains(text(),'None')]"));
        clickElement(By.xpath("//a[text()='External']"));
        clickElement(By.xpath("//span[text()='Save']/../..//button[@title='Save']"));
    }


    @Test
    public void createNewChart() {
        clickElement(By.xpath("//div[@role='navigation']/button"));
        clickElement(By.xpath("//button[@aria-label='View All Applications']"));
        clickElement(By.xpath("//p[text()='Service Console']/ancestor::a"));
        clickElement(By.xpath("//button[@aria-label='Show Navigation Menu']"));
        clickElement(By.xpath("//a[@data-itemid='Refund']"));
        clickElement(By.xpath("//button[@title='Select a List View: Refunds']"));
        clickElement(By.xpath("//*[text()='All']/.."));
        displayAsTableOrSplitView("table");
        if(!isElementDisplayed(By.xpath("//h2[text()='New Chart']"))){
            clickElement(By.xpath("//span[text()='Show charts']/.."));
        }
        waitUntilElementDisplayed(By.xpath("//h2[text()='Charts']"));
        clickElement(By.xpath("//div[@class='chartSettings uiMenu']//a[@title='Settings']"));
        clickElement(By.xpath("//a[text()='New Chart']"));
        waitUntilElementDisplayed(By.xpath("//h2[text()='New Chart']"));
        setText(By.xpath("//label[text()='Chart Name']/..//input"), "New chart " + new Random().nextInt(10, 100));
        clickElementJs(By.xpath("//span[text()='Aggregate Type']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Average']"));
        clickElementJs(By.xpath("//span[text()='Aggregate Field']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Amount']"));
        clickElementJs(By.xpath("//span[text()='Grouping Field']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Account']"));
        clickElement(By.xpath("//span[text()='Save']/../../button[@title='Save']"));
    }

    @Test
    public void createTask() {
        clickElement(By.xpath("//div[@role='navigation']/button"));
        clickElement(By.xpath("//button[@aria-label='View All Applications']"));
        clickElement(By.xpath("//p[text()='Service Console']/ancestor::a"));
        clickElement(By.xpath("//button[@aria-label='Show Navigation Menu']"));
        clickElement(By.xpath("//a[@data-itemid='Refund']"));
        clickElement(By.xpath("//button[@title='Select a List View: Refunds']"));
        clickElement(By.xpath("//*[text()='All']/.."));
        /*displayAsTableOrSplitView("table");
        if(!isElementDisplayed(By.xpath("//h2[text()='New Chart']"))){
            clickElement(By.xpath("//span[text()='Show charts']/.."));
        }
        waitUntilElementDisplayed(By.xpath("//h2[text()='Charts']"));
        clickElement(By.xpath("//div[@class='chartSettings uiMenu']//a[@title='Settings']"));
        clickElement(By.xpath("//a[text()='New Chart']"));
        waitUntilElementDisplayed(By.xpath("//h2[text()='New Chart']"));
        setText(By.xpath("//label[text()='Chart Name']/..//input"), "New chart " + new Random().nextInt(10, 100));
        clickElementJs(By.xpath("//span[text()='Aggregate Type']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Average']"));
        clickElementJs(By.xpath("//span[text()='Aggregate Field']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Amount']"));
        clickElementJs(By.xpath("//span[text()='Grouping Field']/../..//a"));
        clickElementJs(By.xpath("//li/a[text()='Account']"));
        clickElement(By.xpath("//span[text()='Save']/../../button[@title='Save']"));*/
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    public void displayAsTableOrSplitView(String tableOrSplit){
        if(tableOrSplit.equalsIgnoreCase("table")){
            if(isElementDisplayed(By.xpath("//button[@title='Display as Split View']"))){
                clickElementJs(By.xpath("//button[@title='Display as Split View']"));
                clickElementJs(By.xpath("//*[text()='Table']/.."));
            }
        }else{
            if(isElementDisplayed(By.xpath("//button[@title='Display as Table']"))){
                clickElementJs(By.xpath("//button[@title='Display as Table']"));
                clickElementJs(By.xpath("//*[text()='Split View']/.."));
            }
        }
    }

    public void waitUntilElementDisplayed(By element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementDisplayed(By element) {
        boolean flag=false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            flag=true;
        } catch (Exception e) {
            System.out.println("Element not displayed");
        }
        return flag;
    }

    public void setText(By element, String value) {
        driver.findElement(element).sendKeys(value);
    }

    public void clickElement(By element) {
        waitForElementToDisplay(element);
        driver.findElement(element).click();
    }

    public void clickElementJs(By element) {
        waitForElementToDisplay(element);
        WebElement ele = driver.findElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void clickElementUsingAction(By element) {
        waitForElementToDisplay(element);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(element)).click().build().perform();
    }

    public void waitForElementToDisplay(By element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
