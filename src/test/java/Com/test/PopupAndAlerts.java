package Com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

public class PopupAndAlerts {
	public static void alertsHandling() throws Throwable {

		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/prompt/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		d.findElement(By.xpath("//button[text()='Click Me']")).click();
		Alert alert = d.switchTo().alert();
		alert.sendKeys("Virat");
		alert.accept();
		alert.sendKeys("18");
		alert.accept();
		String msgg = d.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msgg);


	}

	public static void notificationHandling() {
		ChromeOptions notifi = new ChromeOptions();
        notifi.addArguments("--incognito"); // Disables browser notifications

        notifi.addArguments("--start-maximized"); // Disables browser notifications

        notifi.addArguments("--disable-notifications"); // Disables browser notifications


		ChromeDriver d = new ChromeDriver(notifi);
		d.get("https://www.lokmat.com/pune/");
		//d.manage().timeouts().implicitlyWait(Duration.ofMillis(600));
		//notifi.addArguments("--maximized-notifications");
	}

	public static void main(String[] args) throws Throwable {
		//alertsHandling();
		notificationHandling();
	}

}
