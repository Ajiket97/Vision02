package Com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class DropdownlistHandles {
	public static void singleselect() throws Throwable {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/parent-window/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id=\"frame_1\"]")));
		System.out.println("enter frame 1");

		d.findElement(By.xpath("//input[@placeholder=\"Enter First Name\"]")).sendKeys("ajit");
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id=\"frame-2\"]")));
		System.out.println("enter frame 2");

		d.findElement(By.xpath("//input[@placeholder=\"Enter last name\"]")).sendKeys("shingnare");
		//d.switchTo().frame(d.findElement(By.xpath("//iframe[@id=\"frame_1\"]")));

		d.switchTo().parentFrame();
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name=\"ok-btn\"]"))).click();
			//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		//Thread.sleep(600);
		d.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
		System.out.println("ok");

//		Select s = new Select(web);
//
//		s.selectByIndex(0)
//		s.selectByIndex(4);

	}

	public static void main(String[] args) throws Throwable {
		singleselect();
	}
}
