package InfotekSelenium;


		import	org.junit.After;	
		import org.junit.AfterClass;
		import org.junit.Before;
		import org.junit.BeforeClass;
		import org.junit.Test;

		public class _17Annotations {

			 // Run once, e.g. Database connection, connection pool
		    @BeforeClass
		    public static void runOnceBeforeClass() {
		        System.out.println("@BeforeClass - runOnceBeforeClass");
		    }

		   

		    // Should rename to @BeforeTestMethod
		    // e.g. Creating an similar object and share for all @Test
		    @Before
		    public void runBeforeTestMethod() {
		        System.out.println("@Before - runBeforeTestMethod");
		    }

		   
	}


