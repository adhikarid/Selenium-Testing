package InfotekSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		//https://www.guru99.com/gecko-marionette-driver-selenium.html
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		// open browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement getcss = driver.findElement(By.id("login1"));
		System.out.println(getcss.getCssValue("font-family"));
		System.out.println(getcss.getCssValue("font-weight"));
		
		driver.close();
	}

}
