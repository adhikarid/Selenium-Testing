package selinum;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testabc {

//	@Test
//	public void Testconcatenate() {
//		assertEquals("onetwo", "onetwo");
//	}
	
	
	WebDriver  driver = new FirefoxDriver();;

	 // Run once, e.g. Database connection, connection pool
   @BeforeClass
   public static void runOnceBeforeClass() {
       System.out.println("@BeforeClass - runOnceBeforeClass");
   }

  

   // Should rename to @BeforeTestMethod
   // e.g. Creating an similar object and share for all @Test
   @Before
   public void openBrowser() {
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\dnesh\\eclipse-workspace\\selinum\\bin\\geckodriver.exe");
		
	   driver.get("https://google.com");
	   
       System.out.println("@Before - runBeforeTestMethod");
   }

  

   @Test
   public void test_method_1() {
       System.out.println("@Test - test_method_1");
   }

   @Test
   public void test_method_2() {
       System.out.println("@Test - test_method_2");
   }
  
   @After
   public void runAfterTestMethod() {
       System.out.println("@After - runAfterTestMethod");
       driver.close();
   }
 
   @AfterClass
   public static void runOnceAfterClass() {
       System.out.println("@AfterClass - runOnceAfterClass");
   }

}
