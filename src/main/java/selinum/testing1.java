package selinum;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testing1 {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		//https://www.guru99.com/gecko-marionette-driver-selenium.html
		WebDriver driver =new ChromeDriver();
		
		driver.get(("http://www.newtours.demoaut.com/"));
		
		driver.get("http://www.newtours.demoaut.com/");
		//System.out.println(driver.findElement(By.name("userName")));
		// pass some credentials
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();
		
		
		driver.close();*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://www.newtours.demoaut.com/");
		
		System.out.println(driver1.getTitle());// get page title
		String s =driver1.getCurrentUrl(); // get url
		System.out.println(s);
		System.out.println(driver1.getPageSource());
		driver1.navigate().to("https://www.google.com/");
		driver1.navigate().back();
		driver1.navigate().forward();


		
		driver1.close();
		//driver.quit();
		
		driver1.get("http://www.newtours.demoaut.com/");
		System.out.println(driver1.findElement(By.name("userName")));
		System.out.println(driver1.findElement(By.name("password")));
		System.out.println(driver1.findElement(By.name("login")));
		Thread.sleep(3000);
		driver1.close();

		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		
		 //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	     //capabilities.setCapability("marionette", true);		
		
	     //WebDriver obj2=new FirefoxDriver();
	     // obj2.get("https://www.facebook.com");
	     //obj2.findElement(By.name("email")).sendKeys("d.neshadhikari@yahoo.com");
	     //obj2.findElement(By.name("pass")).sendKeys("Fairfax13003");
	      //obj2.findElement(By.id("u_0_2")).click();
		//  System.out.println("is this running ..?");
		  
		//obj.get("http://newtours.demoaut.com/");
		//obj.findElement(By.name("userName")).sendKeys("a");
		//obj.findElement(By.name("login")).click();
		
	//obj.get("http://newtours.demout.com/");
	//obj.findElement(By.className("userName")).sendKeys("a");
	//obj.get("https://www.facebook.com");
		//obj2.get("http://newtours.demout.com/");	
	//WebDriver obj3=new FirefoxDriver(); 
	//obj3.get("https://www.google.com");
	//obj3.findElement(By.className("userName")).sendKeys("a");
	//obj3.get("https://www.youtube.com");
//WebDriver obj4=new FirefoxDriver();
//obj4.get("https://cnn.com");
//obj4.get("https://www.google.com");
//obj4.findElement(By.className("userName")).sendKeys("dataentry77016@gmail.com");
//obj4.findElement(By.id("gb_70")).click();

	 
	
	}
	
	

}
