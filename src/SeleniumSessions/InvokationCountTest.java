package SeleniumSessions;

import org.testng.annotations.Test;

public class InvokationCountTest {

	// This option is used when you want generate same data multiple times or dump the data into application
	@Test(invocationCount = 10)
	public void sum() {
		int a= 10;
		int b= 20;
		int c = a+ b;
		System.out.println("The sum c : "  + c);
		
}
}
