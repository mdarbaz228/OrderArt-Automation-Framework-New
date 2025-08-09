/**
 * 
 */
package com.OrderArt.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *  This class stores all the elements of the Login Page
 *
 */
public class LoginPage {
	
	ChromeDriver cd;
	WebDriverWait wait;
	
	By FBSignUp = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[1]/ul/li[1]/a");
	By GoogleSignUp = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[1]/ul/li[2]/a");
	By LoginModal = By.xpath("/html/body/header/div/div[1]/div/div[2]/div/div[2]/div/ul/li[1]/div/ul/li/a[1]");
	By Username = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/div[1]/div/input");
	By Password = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/div[2]/div/input");
	By RemeberMe = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/div[3]/div/div[1]/div/input");
	By ForgotPassword = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/div[3]/div/div[2]/a");
	By Consent = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/div[4]/input");
	By LoginButton = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[5]/form/button");
	By CreateAccount = By.xpath("/html/body/div[6]/div/div/div[2]/div/div/div[6]/a");
	By DivModal = By.xpath("/html/body/div[6]/div/div");
	
	public LoginPage(ChromeDriver cd) {
			this.cd = cd;
			//this.wait = wait;
	}
	
	/*
	 public void Visibility_DivModal() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[6]/div/div"))));
	}
	 */
	
	public void Click_LoginModal() {
		cd.findElement(LoginModal).click();
	}
	
	public void Enter_UserName() {
		cd.findElement(Username).sendKeys("mdaltaf.tech@mailinator.com");
	}
	
	public void Enter_Password() {
		cd.findElement(Password).sendKeys("12345678");
	}
	
	public void CheckConsent() {
		cd.findElement(Consent).click();
	}
	
	public void Click_LoginButton() {
		cd.findElement(LoginButton).click();
	}
}
