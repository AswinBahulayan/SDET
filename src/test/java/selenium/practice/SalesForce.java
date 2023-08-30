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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
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

    @Test(priority = 0)
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


    @Test(priority = 1)
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

    @Test(priority = 2)
    public void createTask() throws InterruptedException {
        clickElementJs(By.xpath("//div[@role='navigation']/button"));
        clickElementJs(By.xpath("//button[@aria-label='View All Applications']"));
        setText(By.xpath("//input[@type='search' and contains(@placeholder,'Search')]"),"Task");
        clickElementJs(By.xpath("//*[text()='Task']/ancestor::a"));
        clickElement(By.xpath("//li[@role='presentation']/a[@title='Tasks' and @role='tab']"));
        Thread.sleep(5000);
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        showOneMoreAction();
        clickElement(By.xpath("//a[text()='Not Started']"));
        clickElement(By.xpath("//a[@title='Waiting on someone else']"));
        setText(By.xpath("//label[text()='Subject']/../..//input"),"Bootcamp "+new Random().nextInt(10,1000));
        clickElement(By.xpath("//span[text()='Task Information']/../../../../../../../..//span[text()='Save']/.."));
        waitForElementToDisplay(By.cssSelector("span.toastMessage"));
        System.out.println(driver.findElement(By.cssSelector("span.toastMessage")).getText());
        Assert.assertEquals(true,driver.findElement(By.cssSelector("span.toastMessage")).getText().contains("was created"));
    }

    @Test(dependsOnMethods = "selenium.practice.createTask",priority = 3)
    public void editTask() {
        clickElementJs(By.xpath("//div[@role='navigation']/button"));
        clickElementJs(By.xpath("//button[@aria-label='View All Applications']"));
        setText(By.xpath("//input[@type='search' and contains(@placeholder,'Search')]"),"Task");
        clickElementJs(By.xpath("//*[text()='Task']/ancestor::a"));
        clickElement(By.xpath("//li[@role='presentation']/a[@title='Tasks' and @role='tab']"));
        waitUntilElementDisplayed(By.xpath("//span[contains(text(),'Bootcamp')]/../../div[text()='Task']"));
        clickElementJs(By.xpath("//a[contains(@title,'Task')]/../..//a[@title='Show 5 more actions']"));
        clickElementJs(By.xpath("//a[@title='Edit']"));
        waitUntilElementDisplayed(By.xpath("//h2[contains(text(),'Edit Bootcamp')]"));
        setText(By.xpath("//label[text()='Due Date']/..//input"),todaysDate());
        clickElementJs(By.xpath("//span[text()='Priority']/../..//a[text()='Normal']"));
        clickElement(By.xpath("//a[text()='Low']"));
        clickElement(By.xpath("//h2[contains(text(),'Edit Bootcamp')]/../../../..//button/span[text()='Save']"));
        waitForElementToDisplay(By.cssSelector("span.toastMessage"));
        System.out.println(driver.findElement(By.cssSelector("span.toastMessage")).getText());
        Assert.assertEquals(true,driver.findElement(By.cssSelector("span.toastMessage")).getText().contains("was saved"));
    }

    @Test(dependsOnMethods = "selenium.practice.editTask",priority = 4)
    public void deleteTask() {
        clickElementJs(By.xpath("//div[@role='navigation']/button"));
        clickElementJs(By.xpath("//button[@aria-label='View All Applications']"));
        setText(By.xpath("//input[@type='search' and contains(@placeholder,'Search')]"),"Task");
        clickElementJs(By.xpath("//*[text()='Task']/ancestor::a"));
        clickElement(By.xpath("//li[@role='presentation']/a[@title='Tasks' and @role='tab']"));
        waitUntilElementDisplayed(By.xpath("//span[contains(text(),'Bootcamp')]/../../div[text()='Task']"));
        clickElementJs(By.xpath("//a[contains(@title,'Task')]/../..//a[@title='Show 5 more actions']"));
        clickElement(By.xpath("//a[@title='Delete']"));
        clickElement(By.xpath("//h2[text()='Delete Task']/../..//button[@title='Delete']"));
        waitForElementToDisplay(By.cssSelector("span.toastMessage"));
        System.out.println(driver.findElement(By.cssSelector("span.toastMessage")).getText());
        Assert.assertEquals(true,driver.findElement(By.cssSelector("span.toastMessage")).getText().contains("was deleted"));
    }

//    public void
    
    public void showOneMoreAction(){
        List<WebElement> showOneMorebutton = driver.findElements(By.xpath("//a[@title='Show one more action']"));
        for (WebElement each:
             showOneMorebutton) {
            try {
                clickElementJs(each);
                if (isElementDisplayed(By.xpath("//a[@title='New Task']"))) {
                    clickElementJs(By.xpath("//a[@title='New Task']"));
                    break;
                }
                clickElementJs(each);
            }catch(Exception e){

            }
        }
    }

    public String todaysDate(){
        return new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
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

    public void clickElementJs(WebElement element) {
        waitForElementToDisplay(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
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

    public void waitForElementToDisplay(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
