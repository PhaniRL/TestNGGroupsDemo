package com.training.sanity.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Admindashboard;
import com.training.pom.LoginPOM;


public class RETC_015 extends LoginTests {
	
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private LoginTests logintests;
	private Admindashboard admindashboard;
	
	@Test(groups = {"adminlogouttests"})
	public void GenerateNewPassword() throws Exception {
		
	//	logintests = new LoginTests();
	//	logintests.setUpBeforeClass();
	//	logintests.setUp();
	//	logintests.ValidEmailLoginTest();
		System.out.println("Testing RETC_015 testcase");
		
		Admindashboard admindashboard = new Admindashboard(driver);
		admindashboard.VerifyAdminLogout();
		System.out.println("Test over");
	}

}
