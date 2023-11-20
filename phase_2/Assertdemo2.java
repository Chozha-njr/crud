package project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertdemo2 {
	
	@Test
	public void method1() {
	String expectedresult= "selenium";
	String actualresult = "seleniumTest";
	
	//assertNotEquals: it will check if 2 strings are not equal => true -> Pass 
	// return false test stops --> assertion error

	Assert.assertNotEquals(expectedresult,actualresult);
	
	
	}
	@Test
    public void method2() {
		
		String actualresult = null;//any ywor it will pass or put null it pass

		Assert.assertNotNull(actualresult);
    	
	}
	@Test
	 public void method3() {
		String actualresult = null;
		Assert.assertNull(actualresult);
		
	}
	
	
}
	
	
