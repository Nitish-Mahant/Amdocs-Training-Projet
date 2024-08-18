
package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Third {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.google.com");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

            searchBox.sendKeys("Selenium WebDriver");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("erkvQe")));

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ARROW_DOWN).perform(); 
            actions.sendKeys(Keys.ARROW_DOWN).perform(); 

            actions.sendKeys(Keys.ENTER).perform();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

            List<WebElement> results = driver.findElements(By.cssSelector("h3"));
            if (!results.isEmpty()) {
                System.out.println("First result title: " + results.get(0).getText());
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}




