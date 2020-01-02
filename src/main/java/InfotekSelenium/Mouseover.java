package InfotekSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://store.demoqa.com/");
		 WebElement element = driver.findElement(By.linkText("Product Category")) ;
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("iPads")).click();
		
	}

}
