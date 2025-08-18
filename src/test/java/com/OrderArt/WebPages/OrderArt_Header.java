package com.OrderArt.WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderArt_Header {
	
	ChromeDriver cd;
	WebDriverWait w;
	static String count_cart;
	
	public OrderArt_Header(ChromeDriver cd) {
		this.cd = cd;
	}
	
	By Image_Logo = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[1]/div/a/img");
	By Header_Home = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[1]/a");
	By Header_About = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[2]/a");
	By Header_Menu = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[3]/a");
	By Header_Blogs = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[4]/a");
	By Header_Gallery = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[5]/a");
	By Header_Google_Reviews = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[6]/a");
	By Header_Contact = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[3]/div/div[2]/ul/li[7]/a");
	
	By User_DD = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[2]/ul/li[1]/a/span");
	By Cart = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[2]/ul/a");
	By Cart_Count = By.xpath("/html/body/div[1]/header/div/header/div[1]/div/div[2]/ul/a/span");
	
	public void Click_Cart() {
		cd.findElement(Cart).click();
	}
	
	public void Get_Cart_Count() {
		count_cart = cd.findElement(Cart_Count).getText();
	}
	
	public void Click_Header_Home() {
		cd.findElement(Header_Home).click();
	}
	public void Click_Header_About() {
		cd.findElement(Header_About).click();
	}
	public void Click_Header_Menu() {
		cd.findElement(Header_Menu).click();
	}
	public void Click_Header_Blogs() {
		cd.findElement(Header_Blogs).click();
	}
	public void Click_Header_Gallery() {
		cd.findElement(Header_Gallery).click();
	}
	public void Click_Header_Google_Reviews() {
		cd.findElement(Header_Google_Reviews).click();
	}
	public void Click_Header_Contact() {
		cd.findElement(Header_Contact).click();
	}
}
