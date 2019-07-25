package TrainingPackage;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void login(){
		System.out.println("login");
	}
}
