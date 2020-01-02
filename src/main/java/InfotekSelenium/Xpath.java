package InfotekSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");		
			System.out.println(driver.findElement(By.xpath("//input[@name='userName']")));
			System.out.println(driver.findElement(By.xpath("//input[@name='password']")));
			System.out.println(driver.findElement(By.xpath("//input[@value='Login']")));
			driver.close();
	}

}
