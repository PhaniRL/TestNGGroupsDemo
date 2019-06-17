package com.training.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	public void ViewMenuItems() throws InterruptedException {
		
		
	//	this.driver.manage().timeouts().implicitlyWait(32000, TimeUnit.SECONDS);
		System.out.println("Entered in to this method");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(this.profilemenu).click().build().perform();	
	//	this.profilemenu.click();
				
		
		
	}
	
	
	

}
