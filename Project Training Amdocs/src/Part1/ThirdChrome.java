package Part1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdChrome {
		public static void main(String[] args) {
			System.out.println("Opening Google!!!");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			WebDriver driver = new ChromeDriver() ;
			driver.get("https://www.youtube.com");
		}

}


