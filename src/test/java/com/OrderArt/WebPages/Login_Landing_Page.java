package com.OrderArt.WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OrderArtTesting.utilities.AssertUtil;

public class Login_Landing_Page {

	ChromeDriver cd;
	WebDriverWait w;
	static String name_of_user;
	boolean login_flag;
	
	public Login_Landing_Page(ChromeDriver cd) {
		this.cd = cd;
	}
	
	By User_Details_Span = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/a/span");
	
	public void Wait_Span() {
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(cd.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/a/span"))));
	}
	public void Get_User_Details_Span() {
		Wait_Span();
		name_of_user = cd.findElement(User_Details_Span).getText();
		System.out.println(name_of_user);
		AssertUtil.Assert_ValidateEquals("Hello Mohammed", name_of_user, "User Details Matched");
		login_flag= true;
		System.out.println("Welcome"+name_of_user);
	}
}
