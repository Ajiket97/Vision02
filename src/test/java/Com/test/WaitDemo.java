package Com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class WaitDemo {
	static ChromeDriver d = new ChromeDriver();

	public static void impliclicitWait() {
		 d.manage().window().maximize();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);

		wait.withTimeout(Duration.ofSeconds(10));// max time
		wait.pollingEvery(Duration.ofSeconds(2));
		// wait.ignoring(Exception.class);
		d.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();

		d.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Ajit");
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"btn-1\"]"))).click();

		d.findElement(By.xpath("//button[@id=\"btn-1\"]")).click();
		FluentWait<WebDriver> aaa = wait.withMessage("element not found");
		System.out.println(aaa);
		d.findElement(By.xpath("//button  [text() = 'Button2']")).click();
		String msg2 = d.findElement(By.xpath("//p [text() = 'You have clicked Button2']")).getText();
		String msg = d.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msg2);
		System.out.println(msg);
	}

	private void explictWait() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		impliclicitWait();
	}
}
