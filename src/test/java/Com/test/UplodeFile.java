package Com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodeFile {
	public static void fileUploding() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/file-upload-assignment/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		d.findElement(By.xpath("//input[@type=\"File\"]")).sendKeys("C:/Users/shrik/OneDrive/Desktop/Ajit docs.txt");
	}

	public static void main(String[] args) {
		fileUploding();
	}
}
