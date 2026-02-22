package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleFirefox {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Refresh page
        driver.navigate().refresh();

        // Close browser
        driver.quit();

	}

}
