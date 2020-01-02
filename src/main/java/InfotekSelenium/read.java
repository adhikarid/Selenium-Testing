package InfotekSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		//https://www.guru99.com/gecko-marionette-driver-selenium.html
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		//System.out.println(driver.findElement(By.name("userName")));
		// pass some credentials
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		
		
		driver.close();
	}

}
