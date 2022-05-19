package ui;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority = 1, description = "this is login test")

	public void bloginTest() {
		System.out.println("login is successful");

	}

	@Test(priority = 2, description = "this is logout test")
	public void alogoutTest() {
		System.out.println("logout is successful");
	}
}
