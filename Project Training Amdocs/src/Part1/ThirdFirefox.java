package Part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdFirefox {
	public static void main(String[] args) {
		System.out.println("Opening FireFox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
	}

}
