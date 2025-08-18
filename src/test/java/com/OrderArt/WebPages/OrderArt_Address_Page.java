package com.OrderArt.WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderArt_Address_Page {
	
	ChromeDriver cd;
	WebDriverWait w;
	
	public OrderArt_Address_Page(ChromeDriver cd) {
		this.cd = cd;
	}
	
	By Add_Address_Button = By.xpath("/html/body/main/div/div/div[3]/button");
	By Name_TextBox = By.xpath("//input[@type='text' and @id='name']");
	By Mobile_TextBox = By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[2]/div/div/input");
	
	
	public void Wait_Address_Modal() {
		WebElement Address_Modal = cd.findElement(By.xpath("/html/body/div[2]/div/div"));
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Address_Modal));
	}
	
}
