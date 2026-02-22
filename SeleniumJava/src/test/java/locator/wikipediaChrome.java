package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipediaChrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org/");

        // Search for Artificial Intelligence
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.submit();

        // Click on "History" section
        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();
        
        Thread.sleep(1000);

        // Print section title
        WebElement historyTitle = driver.findElement(By.xpath("(//span[normalize-space()='History'])[1]"));
        System.out.println("Section Title: " + historyTitle.getText());

        driver.quit();

	}

}
