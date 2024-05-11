package Com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class TestShrikant {
@Test
	public void DemoAssignement() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(5));
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		driver.manage().window().maximize();
		fwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='popmake-22568']//button[@class='pum-close popmake-close' and @type='button']"))));
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//div[@id='popmake-22568']//button[@class='pum-close popmake-close' and @type='button']"))
				.click();
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Shrikant");
		fwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id=\"btn-1\"]"))));
		driver.findElement(By.xpath("//button[@id=\"btn-1\"]")).click();
		String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msg);

	}

}
