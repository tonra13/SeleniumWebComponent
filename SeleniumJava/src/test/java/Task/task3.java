package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/");

       
        WebElement signupLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='⭐️3hk5qd-0 text-base font-medium px-4 py-2 rounded-md border secondary-color header-primary-btn max-lg:min-w-24 text-center btn-size'][normalize-space()='Sign up'])[1]"))
        );
        signupLink.click();

       
        WebElement name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name"))
        );
        name.sendKeys("Test User");

    
        driver.findElement(By.id("email"))
                .sendKeys("testuser1234Univ@gmail.com");

      
        driver.findElement(By.id("password"))
                .sendKeys("Test@1234");

       
        driver.findElement(By.id("mobileNumber"))
                .sendKeys("9876543210");

        
        WebElement signupBtn = driver.findElement(By.id("signup-btn"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", signupBtn);

       
        signupBtn.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='laterBtn']")));
        driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Almost Done! Check Your Inbox!')]")));
        driver.findElement(By.xpath("//h1[contains(text(),'Almost Done! Check Your Inbox!')]")).isDisplayed();
        
        driver.findElement(By.xpath("//img[@src='/web-build/images/new-guvi-logo.83c09178ae1fdc5042c40851558a003d.png']")).click();
        
        
        System.out.println("Signup Attempted - Title: " + driver.getTitle());

        WebElement signupLink1 = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='⭐️3hk5qd-0 text-base font-medium px-4 py-2 rounded-md border secondary-color header-primary-btn max-lg:min-w-24 text-center btn-size'][normalize-space()='Sign up'])[1]"))
        );
        signupLink1.click();
       
        WebElement loginLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
        loginLink.click();
        
        
        WebElement loginEmail = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("email"))
        );
        loginEmail.sendKeys("testuser1234Univ@gmail.com");

        
        driver.findElement(By.id("password"))
                .sendKeys("Test@1234");

        
        WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", loginBtn);
        loginBtn.click();

        //driver.switchTo().window(0);
        
        driver.findElement(By.xpath("//h4[contains(text(),'Activation')]")).isDisplayed();

        System.out.println("Login Attempted - Title: " + driver.getTitle());

       
        driver.quit();
	        

	}

}
