package com.OrderArtTesting.utilities;


import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static ChromeDriver cd;
	public static void getChromeDriver(String url) {
		if (cd == null) {
			cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get(url);
		}	
	}
	public static void Quit() {
		if(cd != null) {
			cd.quit();
			cd = null;
		}
	}
}
