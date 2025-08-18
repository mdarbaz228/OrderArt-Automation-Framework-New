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
	static String name_of_user, count_cart;
	boolean login_flag;
	
	public Login_Landing_Page(ChromeDriver cd) {
		this.cd = cd;
	}
	
	By User_Details_Span_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/a/span");
	By Your_Profile_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[1]/a");
	By Your_DeliveryAddress_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[2]/a");
	By Your_Order_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[3]/a");
	By Your_Favorite_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[4]/a");
	By Your_Loyalty_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[5]/a");
	By Your_Category_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[6]/a");
	By Your_Grievance_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[7]/a");
	By Your_Promos_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[8]/a");
	By Change_Password_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[9]/a");
	By Logout_DD = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/div/ul/li[10]/a");
	By Cart = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/a");
	By Cart_Count = By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/a/span");
	
	
	public void Wait_Span() {
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(cd.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[1]/a/span"))));
	}
	public void Get_User_Details_Span_DD() {
		try {
			Wait_Span();
			Thread.sleep(30000);
			name_of_user = cd.findElement(User_Details_Span_DD).getText();
			System.out.println(name_of_user);
			AssertUtil.Assert_ValidateEquals("Hello Mohammed", name_of_user, "User Details Matched");
			login_flag= true;
			System.out.println("Welcome"+name_of_user);
		} catch(Throwable t) {
			
		}
	}
	
	public void Click_User_Details_Span_DD() {
		cd.findElement(User_Details_Span_DD).click();
	}
	public void Click_Your_Profile_DD() {
		cd.findElement(Your_Profile_DD).click();
	}
	public void Click_Your_DeliveryAddress_DD() {
		cd.findElement(Your_DeliveryAddress_DD).click();
	}
	public void Click_Your_Order_DD() {
		cd.findElement(Your_Order_DD).click();
	}
	public void Click_Your_Favorite_DD() {
		cd.findElement(Your_Favorite_DD).click();
	}
	public void Click_Your_Loyalty_DD() {
		cd.findElement(Your_Loyalty_DD).click();
	}
	public void Click_Your_Category_DD() {
		cd.findElement(Your_Category_DD).click();
	}
	public void Click_Your_Grievance_DD() {
		cd.findElement(Your_Grievance_DD).click();
	}
	public void Click_Your_Promos_DD() {
		cd.findElement(Your_Promos_DD).click();
	}
	public void Click_Change_Password_DD() {
		cd.findElement(Change_Password_DD).click();
	}
	public void Click_Logout_DD() {
		cd.findElement(Logout_DD).click();
	}
	public void Click_Cart() {
		cd.findElement(Cart).click();
	}
	
	public void Get_Cart_Count() {
		count_cart = cd.findElement(Cart_Count).getText();
	}
	
}
