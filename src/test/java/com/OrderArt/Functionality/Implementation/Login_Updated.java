package com.OrderArt.Functionality.Implementation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrderArt.WebPages.Login_Landing_Page;
import com.OrderArt.WebPages.Updated_Login_Page;

public class Login_Updated {

	@Test
	public void Login_OrderArt() {
		try {
			ChromeDriver cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("https://front1.orderart.com.au/home/index");
			//Login_User l = new Login_User();
			Updated_Login_Page ulp = new Updated_Login_Page(cd);
			Login_Landing_Page llp = new Login_Landing_Page(cd);
			ulp.Click_LoginButton();
			//ulp.Wait_Modal();
			ulp.Fill_UserName();
			ulp.Fill_Password();
			ulp.Click_Consent_CheckBox();
			ulp.Click_SignInButton();
			llp.Wait_Span();
			llp.Get_User_Details_Span();
			
		} catch(Throwable t) {
			System.out.println(t.getMessage());
		}
		
		
	}
}
