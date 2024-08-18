package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

    private WebDriver driver;
    private Test1 formsPage;

    @BeforeClass
    public void setUp() {
        System.out.println("Demo QA form(POM)");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        formsPage = new Test1(driver);
    }

    @Test
    public void testFormSubmission() throws InterruptedException {
        formsPage.setFirstName("Nitish");
        formsPage.setLastName("Mahant");
        formsPage.setEmail("nitish@gmail.com");
        formsPage.selectGender();
        formsPage.setUserNumber("1234567890");
        formsPage.setDateOfBirth("March", "2003", "24");
        formsPage.setSubjects("Physics");
        formsPage.selectHobbies();
        formsPage.uploadPicture("C:\\Users\\admin\\Downloads\\8th Sem.jpg");
        formsPage.setAddress("Gurdaspur");
        formsPage.selectState("Punjab");
        formsPage.selectCity("Gurdaspur");
        formsPage.submitForm();
		Thread.sleep(7000);
    }
    

    @AfterClass
    public void tearDown() {
           driver.quit();
    }
}
