package InfotekSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManagingAlertsExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.id("alert")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(3000);
		alert1.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(3000);
		alert2.sendKeys("hello");
		Thread.sleep(5000);
		alert2.accept();
	}

}
