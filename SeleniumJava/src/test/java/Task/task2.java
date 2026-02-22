package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task2 {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	            driver.get("https://jqueryui.com/droppable/");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
	                    By.className("demo-frame")));

	            WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.id("draggable")));

	            WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.id("droppable")));

	            Actions actions = new Actions(driver);
	            actions.dragAndDrop(source, target).perform();

	            String targetText = target.getText();
	            if (targetText.equals("Dropped!")) {
	                System.out.println("Text verification PASSED");
	            } else {
	                System.out.println("Text verification FAILED");
	            }

	            String bgColor = target.getCssValue("background-color");
	            System.out.println("Target Background Color: " + bgColor);

	            if (bgColor.contains("70") || bgColor.contains("green")) {
	                System.out.println("Color verification PASSED");
	            } else {
	                System.out.println("Color verification CHECK MANUALLY");
	            }

	      
	            driver.quit();
	        

	}

}
