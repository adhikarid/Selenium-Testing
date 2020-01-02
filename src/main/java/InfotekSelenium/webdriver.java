package InfotekSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		//https://www.guru99.com/gecko-marionette-driver-selenium.html
		WebDriver driver =new ChromeDriver();
		
		System.out.println(driver.getTitle());// get page title
		String s =driver.getCurrentUrl(); // get url
		System.out.println(s);
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();


		
		driver.close();
		//driver.quit();
		
	}

}
