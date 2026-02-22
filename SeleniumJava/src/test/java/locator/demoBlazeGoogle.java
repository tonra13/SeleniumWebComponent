package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlazeGoogle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "STORE";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        driver.quit();

	}

}
