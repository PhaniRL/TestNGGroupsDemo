package com.training.sanity.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Admindashboard;
import com.training.pom.LoginPOM;

public class RETC_014 {
	
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private LoginTests logintests;
	private Admindashboard admindashboard;
	
		
	@Test
	public void GenerateNewPassword() throws Exception {
		
		logintests = new LoginTests();
		logintests.setUpBeforeClass();
		logintests.setUp();
		logintests.validLoginTest();
		System.out.println("Logged in as admin");
		
			
		Admindashboard admindashboard = new Admindashboard();
		admindashboard.ViewMenuItems();
		System.out.println("Test over");
		
	}
	
	}
