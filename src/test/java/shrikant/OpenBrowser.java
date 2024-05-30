package shrikant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	static WebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else
			throw new InvalidBrowserError(browserName);

	}

	public static void main(String[] args) {
		openBrowser("Chrome123");
		
	}
	

}
