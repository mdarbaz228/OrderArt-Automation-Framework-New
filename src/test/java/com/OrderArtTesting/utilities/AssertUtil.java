package com.OrderArtTesting.utilities;


import org.testng.Assert;

public class AssertUtil {

	public static void Assert_ValidateEquals(String expected, String actual, String message) {
		Assert.assertEquals(actual, expected, message);
	}
	
	public static void Assert_ValidateTrueFlag(boolean actual, String message) {
		Assert.assertTrue(actual, message);
	}
	
	public static void Assert_ValidateFalseFlag(boolean actual, String message) {
		Assert.assertFalse(actual, message);
	}
	
	public static void Assert_ValidateNotEquals(String expected, String actual, String message) {
		Assert.assertNotEquals(actual, expected, message);
	}
}

