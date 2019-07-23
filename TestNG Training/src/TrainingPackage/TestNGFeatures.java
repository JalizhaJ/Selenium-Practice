package TrainingPackage;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void login(){
		System.out.println("login");
		int i=1/0;
	}
	
	@Test(dependsOnMethods="login")
	public void test1(){
		System.out.println("Login success");
	}
	
	@Test
	public void test2(){
		System.out.println("test 2");
	}

	@Test
	public void test3(){
		System.out.println("test 3");
	}
}
