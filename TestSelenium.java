package SeleniumProject.Website1testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        // No need to specify the path to chromedriver if it is already in PATH
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        // Initialize WebDriver
        ChromeDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.naukri.com/mnjuser/homepage?utm_source=google&utm_medium=cpc&utm_campaign=Brand");

        // Locate the input field by its ID
        WebElement inputField = driver.findElement(By.id("usernameField"));

        // Enter text into the input field
        inputField.sendKeys("kshitijsalunkhe@gmail.com");
        
        // Locate the input field by its ID
        WebElement pass = driver.findElement(By.id("passwordField"));

        // Enter text into the input field
        pass.sendKeys("Testingeverything");

        // (Optional) Locate a button and click it
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Login']"));
        submitButton.click();

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot, new File("/Users/kshitijsalunkhe/eclipse-workspace/Website1testing/src/test.png"));

        
        // Print the page title
       // System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
