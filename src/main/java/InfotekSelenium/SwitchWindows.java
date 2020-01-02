package InfotekSelenium;

import java.util.Set;


import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("before switch" + driver.getTitle());
		driver.findElement(By.linkText("Privacy")).click();
		Set<String>  s1 = driver.getWindowHandles();
		Iterator <String>  i1 = s1.iterator();
		while(i1.hasNext()) {
		String child = i1.next();
		if (!parent.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
			Thread.sleep(4000);
			System.out.println("after switch" + driver.getTitle());
		}
		}
		driver.switchTo().window(parent);
		System.out.println("back to parent" + driver.getTitle());
		
		
	}

}
