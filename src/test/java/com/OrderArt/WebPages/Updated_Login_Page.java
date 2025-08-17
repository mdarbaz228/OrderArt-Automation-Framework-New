package com.OrderArt.WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrderArtTesting.utilities.WaitUtil;

public class Updated_Login_Page {

	ChromeDriver cd;

	WebDriverWait w;
	
	By Home_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[1]/a");
	By About_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[2]/a");
	By Menu_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[3]/a");
	By Blogs_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[4]/a");
	By Gallery_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[5]/a");
	By GoogleReviews_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[6]/a");
	By Contact_button = By.xpath("/html/body/header/div[1]/div/div[3]/div/div[2]/ul/li[7]/a");
	By Login_button = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/a/span");
	By Register_button = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/a/span");
	
	By Login_Modal = By.xpath("/html/body/div[4]/div/div");
	By Close_Modal = By.xpath("/html/body/div[7]/div/div/div[1]/button/span");
	By Facebook_SignIn = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div[1]/a/span[2]");
	By GoogleSignIn = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div[2]/a/span[2]");
	By QuickCheckout = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div[1]/button/span");
	By UserNameTextBox = By.xpath("//input[@id='loginEmail' and @type='email']");
	By PasswordTextBox = By.xpath("//input[@id='loginPassword' and @type='password']");
	By RememberMeCheckBox = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[5]/form/div/div[2]/div[2]/div[1]/div/input");
	By ForgotPassword = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[5]/form/div/div[2]/div[2]/div[2]/a");
	By Consent_CheckBox = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[5]/form/div/div[2]/div[3]/input");
	By SignInButton = By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[5]/form/div/div[3]/button");
	By AccountCreation = By.xpath("/html/body/div[7]/div/div/div[2]/div[2]");
	
	
	
	public Updated_Login_Page(ChromeDriver cd) {
		this.cd = cd;
	}
	
	public void Click_AboutButton() {
		cd.findElement(About_button).click();
	}
	
	public void Click_HomeButton() {
		cd.findElement(Home_button).click();
	}
	
	public void Click_MenuButton() {
		cd.findElement(Menu_button).click();
	}
	
	public void Click_BlogsButton() {
		cd.findElement(Blogs_button).click();
	}
	
	public void Click_GalleryButton() {
		cd.findElement(Gallery_button).click();
	}
	
	public void Click_GoogleReviewsButton() {
		cd.findElement(GoogleReviews_button).click();
	}
	
	public void Click_ContactButton() {
		cd.findElement(Contact_button).click();
	}
	
	public void Click_LoginButton() {
		cd.findElement(Login_button).click();
	}
	
	public void Click_RegisterButton() {
		cd.findElement(Register_button).click();
	}
	
	public void Wait_Modal() {
		//WaitUtil wu = new WaitUtil();
		WebElement Login_Modal_Div = cd.findElement(Login_Modal);
		WebDriverWait w = new WebDriverWait(cd,Duration.ofSeconds(15));
		w.until(ExpectedConditions.visibilityOf(Login_Modal_Div));
		//WaitUtil.VisibilityOfElement(cd, Login_Modal_Div, 15);
	}
	
	public void Close_Modal() {
		cd.findElement(Close_Modal).click();
	}
	public void Click_FacebookSignIn() {
		cd.findElement(Facebook_SignIn).click();
	}
	public void Click_GoogleSignIn() {
		cd.findElement(GoogleSignIn).click();
	}
	public void Click_QuickCheckout() {
		cd.findElement(QuickCheckout).click();
	}
	public void Fill_UserName() {
		cd.findElement(UserNameTextBox).sendKeys("mdaltaf.tech@mailinator.com");
	}
	public void Fill_Password() {
		cd.findElement(PasswordTextBox).sendKeys("12345678");
	}
	public void Check_RememberMe() {
		cd.findElement(RememberMeCheckBox).click();
	}
	public void Click_ForgotPassword() {
		cd.findElement(ForgotPassword).click();
	}
	public void Click_Consent_CheckBox() {
		cd.findElement(Consent_CheckBox).click();
	}
	public void Click_SignInButton() {
		cd.findElement(SignInButton).click();
	}
	public void Click_AccountCreation() {
		cd.findElement(AccountCreation).click();
	}
	
}
