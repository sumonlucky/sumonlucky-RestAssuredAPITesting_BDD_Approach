package restAssuresTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}
	
	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Kenedy"+generatedString);
	}
	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("John"+generatedString);
	}
	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Jhon"+generatedString);
	}
	
	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (generatedString+"gmail.com");
	}
	
	public static String empName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Jhon"+generatedString);
	}

}
