package Part2;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

public class First {
		public static void main(String[] args) {
			System.out.println("Test");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			try {
			driver.get("https://demoqa.com/automation-practice-form");
			driver.findElement(By.id("firstName")).sendKeys("Nitish");
			driver.findElement(By.id("lastName")).sendKeys("Mahant");
			driver.findElement(By.id("userEmail")).sendKeys("nitishmahant@gmail.com");
			WebElement radio = driver.findElement(By.cssSelector("Label[for='gender-radio-1']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);
	        radio.click();
			driver.findElement(By.id("userNumber")).sendKeys("9876578743");
			
			 WebElement dateElement = driver.findElement(By.id("dateOfBirthInput"));
	         dateElement.click();

	         WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
	         Select selectYear = new Select(yearDropdown);
	         selectYear.selectByVisibleText("2002");

	         WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
	         Select selectMonth = new Select(monthDropdown);
	         selectMonth.selectByVisibleText("August");

	         WebElement day = driver.findElement(By.className("react-datepicker__day--002"));
	         day.click();
	         
	         WebElement subjectInput = driver.findElement(By.cssSelector(".subjects-auto-complete__input input"));
	         ((JavascriptExecutor) driver).executeScript("arguments[0].click();", subjectInput);

	         subjectInput.sendKeys("Physics");
	         Thread.sleep(1000);
	         subjectInput.sendKeys(Keys.TAB);


	         subjectInput.sendKeys("English");
	         Thread.sleep(1000);
	         subjectInput.sendKeys(Keys.TAB);

	         subjectInput.sendKeys("Computer Science");
	         Thread.sleep(1000);
	         subjectInput.sendKeys(Keys.TAB);
			
			  WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox1);
	          checkbox1.click();
	          WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
	          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox2);
	          checkbox2.click();
	          
	          driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\admin\\Downloads\\Passport_photo.jpg");
	          
	          driver.findElement(By.id("currentAddress")).sendKeys("Gurdaspur");
	          
	          WebElement ele=driver.findElement(By.id("react-select-3-input"));
				ele.sendKeys("Haryana");
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-3-option']")));
				WebElement suggestions=driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",suggestions);
				((JavascriptExecutor)driver).executeScript("arguments[0].click();",suggestions);
				
				WebElement city = driver.findElement(By.id("react-select-4-input"));
	          city.sendKeys("Panipat");
	          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
	          wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-4-option'")));
	          WebElement suggestions2 = driver.findElement(By.xpath("//div[@id='react-select-4-option-1']"));
	          ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",suggestions2);
	          ((JavascriptExecutor) driver).executeScript("arguments[0].click();",suggestions2);

	          
	          WebElement button =  driver.findElement(By.id("submit"));
	          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
	          button.click();



			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	

}
