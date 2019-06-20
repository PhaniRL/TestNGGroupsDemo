package com.training.sanity.tests;

import java.util.Properties;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Admindashboard;
import com.training.pom.LoginPOM;

public class RETC_013 extends LoginTests {
	
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private LoginTests logintests;
	private Admindashboard admindashboard;
	
		
	@Test(groups = "profileupdatetests")
	public void GenerateNewPassword() throws Exception {
		
	/*	logintests = new LoginTests();
		logintests.setUpBeforeClass();
		logintests.setUp();
		logintests.validLoginTest();*/
		System.out.println("Testing RETC_013 testcase");
		System.out.println("Logged in as phani");
		
			
		Admindashboard admindashboard = new Admindashboard(driver);
		admindashboard.ViewMenuItemstoupdateprofile();
		System.out.println("Test over");
	}

}
