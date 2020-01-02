package InfotekSelenium;

import org.openqa.selenium.By;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// pass url
				driver.get("http://www.newtours.demoaut.com/");
				System.out.println(driver.findElement(By.name("userName")));
				System.out.println(driver.findElement(By.name("password")));
				System.out.println(driver.findElement(By.name("login")));
				
				driver.close();
	}

}
