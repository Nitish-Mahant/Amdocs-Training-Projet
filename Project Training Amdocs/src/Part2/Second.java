package Part2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	public class Second {
	    public static void main(String[] args) {
	       
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	        WebDriver driver = new ChromeDriver();

	        try {
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	            driver.get("https://www.wikipedia.org/");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            WebElement centralContent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("www-wikipedia-org")));

	            List<WebElement> links = driver.findElements(By.tagName("a"));
	            System.out.println("Total number of links on the page: " + links.size());

	            for (WebElement link : links) {
	                System.out.println(link.getText() + " - " + link.getAttribute("href"));
	            }

	            List<WebElement> images = driver.findElements(By.tagName("img"));
	            System.out.println("Total number of images on the page: " + images.size());

	            for (WebElement img : images) {
	                System.out.println("Image source: " + img.getAttribute("src"));
	            }

	        } finally {
	            driver.quit();
	        }
	    }
	

}
