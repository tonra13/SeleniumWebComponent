package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            driver.get("https://jqueryui.com/datepicker/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));

            
            WebElement dateInput = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("datepicker")));
            dateInput.click();

            
            WebElement nextButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Next']")));
            nextButton.click();

            
            WebElement date22 = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='22']")));
            date22.click();

           
            String selectedDate = dateInput.getAttribute("value");

            System.out.println("Selected Date: " + selectedDate);

            driver.quit();
        

	}

}
