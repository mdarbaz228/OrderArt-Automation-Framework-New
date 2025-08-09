/**
 * 
 */
package com.OrderArt.Functionality.Implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.OrderArt.WebPages.LoginPage;
import com.OrderArtTesting.utilities.WaitUtil;

/**
 * @author altaf
 * This page will call the LoginPage that holds all the Web Elements and then based on that this page will help to login
 */
public class Login {
	
	@Test
	public static void Login_OrderArt() {
		
			ChromeDriver cd = new ChromeDriver();
			//WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(20));
			cd.manage().window().maximize();
			cd.get("https://front1.orderart.com.au/home/index");
			LoginPage lp = new LoginPage(cd);
			WebElement login_div = cd.findElement(By.xpath("/html/body/div[6]/div/div"));
			lp.Click_LoginModal();
			WaitUtil.VisibilityOfElement(cd, login_div, 20);
			lp.Enter_UserName();
			lp.Enter_Password();
			lp.CheckConsent();
			lp.Click_LoginButton();
			//driver.close();
			//Assert.assertEquals(false, null);
	}
}
