/**
 * 
 */
package com.OrderArtTesting.utilities;


import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Arbaz
 * 
 * This class will contains the utilities needed to wait for the elements
 *
 */
public class WaitUtil {
	
	public static void VisibilityOfElement(ChromeDriver cd, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void InVisibilityOfElement(ChromeDriver cd, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public static void ElementToBeClickable(ChromeDriver cd, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
