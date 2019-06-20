package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Admindashboard {
	
	private WebDriver driver; 
			
	@FindBy(xpath ="//*[@id = 'wp-admin-bar-my-account']/a")
	private WebElement profilemenu;
	
	@FindBy(xpath = "//*[@class='display-name']")
	private WebElement adminprofilename;
	
	@FindBy(xpath = "//*[@id='wp-admin-bar-edit-profile']/a")
	private WebElement editprofilename;
	
	@FindBy(xpath = "//*[@id='wp-admin-bar-logout']/a")
	private WebElement profilenamelogout;
	
	@FindBy(xpath = "//*[@id='comment_shortcuts']")
	private WebElement commentshortcutshcheckbox;
	
	@FindBy(xpath = "//*[@id='password']/td/button")
	private WebElement generatepasswordbtn;
	
	@FindBy(xpath = "//*[@id='pass1-text']")
	private WebElement enterpassword;
	
	@FindBy(xpath = "//*[@name = 'pw_weak']")
	private WebElement confirmweakpwd;
	
	@FindBy(xpath = "//*[@id = 'message']/p/strong")
	private WebElement profileupdateactualmsg;
	
	@FindBy(xpath = "//*[@id='submit']")
	private WebElement updateprofile;
	
	@FindBy(xpath = "//*[@id = 'last_name']")
	private WebElement updatelastname;
	
	@FindBy(xpath = "//*[@id = 'phone']")
	private WebElement updatephonenum;
	
	@FindBy(xpath = "//*[@id = 'wp-admin-bar-logout']/a")
	private WebElement profilelogout;
	
	public Admindashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Below method is to update password of the administrator profile
	
	public void ViewMenuItems() throws InterruptedException, AWTException {
		
		
		System.out.println("Entered in to this method to generate new password");
		Thread.sleep(3000);
		Actions action = new Actions(this.driver);
		action.moveToElement(this.profilemenu).build().perform();	
		Thread.sleep(3000);
		
		this.editprofilename.click();
					
		String actualtitle =driver.getTitle();		
		System.out.println("Actual title is:" + actualtitle );
		
		Thread.sleep(3000);
		
		this.commentshortcutshcheckbox.click();
		
		Thread.sleep(5000);
		
		this.generatepasswordbtn.click();
		this.enterpassword.sendKeys("manzoor");
		this.confirmweakpwd.click();
		
		this.updateprofile.click();
		
		//comparing is profile really got updated with message shown in application
		
		String Expectedmsg = "Profile updated.";
		
		String Actualmsg = this.profileupdateactualmsg.getText();
		System.out.println("Actual message shown is:"+Actualmsg);
		
		Assert.assertEquals(Actualmsg, Expectedmsg);
		
		System.out.println("Profile password is updated successfully");	
		
		
	}
//Below method is to update lastname and phone number
	
	public void ViewMenuItemstoupdateprofile() throws InterruptedException {
		
		System.out.println("Entered in to this method to update profile");
		Thread.sleep(3000);
		Actions action = new Actions(this.driver);
		action.moveToElement(this.profilemenu).build().perform();	
		Thread.sleep(3000);
		
		this.editprofilename.click();
					
		String actualtitle =driver.getTitle();		
		System.out.println("Actual title is:" + actualtitle );
		
		Thread.sleep(3000);
		
		this.commentshortcutshcheckbox.click();
		
		Thread.sleep(5000);
		this.updatelastname.clear();
		this.updatelastname.sendKeys("Lakshmi");
		this.updatephonenum.sendKeys("9980881186");
		this.updateprofile.click();
		
		//comparing is profile really got updated with message shown in application
		
		String Expectedmsg = "Profile updated.";
		
		String Actualmsg = this.profileupdateactualmsg.getText();
		System.out.println("Actual message shown is:"+Actualmsg);
		
		Assert.assertEquals(Actualmsg, Expectedmsg);
		
		System.out.println("Profile lastname and phone number are updated successfully");	
		
	}
	
	public void VerifyAdminLogout() throws InterruptedException {
		
		System.out.println("Entered in to this method to verify admin log out");
		Thread.sleep(3000);
		Actions action = new Actions(this.driver);
		action.moveToElement(this.profilemenu).build().perform();	
		Thread.sleep(3000);
		
		this.profilelogout.click();
		
	}
	

}
