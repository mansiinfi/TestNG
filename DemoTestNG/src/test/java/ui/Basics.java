package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basics {

	@BeforeSuite
	public void setup() {
		System.out.println("setup system propery for chrome");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	@BeforeGroups
	public void login() {
		System.out.println("login method");
	}

	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all Cookies");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
}
