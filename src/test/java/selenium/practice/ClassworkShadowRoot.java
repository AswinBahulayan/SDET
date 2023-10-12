package selenium.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ClassworkShadowRoot {

    private static WebDriver driver = null;
    @Test
    public void login() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://watir.com/examples/shadow_dom.html");
        WebElement shadowHost = driver.findElement(By.id("shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement element = shadowRoot.findElement(By.cssSelector("#shadow_content"));
        String text = element.getText();
        System.out.println(text);
        //nested shadow root
        WebElement shadowRootElement = shadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
        SearchContext shadowRoot1 = shadowRootElement.getShadowRoot();
        WebElement nextedShadow = shadowRoot1.findElement(By.cssSelector("#nested_shadow_content div"));
        System.out.println(nextedShadow.getText());

        //enter text
        WebElement enterText = shadowRoot.findElement(By.cssSelector("input[type='text']"));
        enterText.sendKeys("anytext");

    }
}
