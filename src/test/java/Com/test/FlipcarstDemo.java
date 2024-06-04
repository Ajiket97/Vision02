package Com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FlipcarstDemo {
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");

		Actions act = new Actions(d);
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));

		WebElement web = d.findElement(By.xpath("//span[text()='Fashion']"));
		act.moveToElement(web).perform();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);

//		d.findElement(By.xpath("//div[@class=\"_1wE2Px\"]"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class=\"_1wE2Px\"]/preceding-sibling::div[@class=\"_1UgUYI _2eN8ye\"]/descendant::a[text()='Men Footwear']/ancestor::div[@class=\"_1UgUYI _2eN8ye\"]/child::div[@class=\"_31z7R_\"]/descendant::a[5]")));
		d.findElement(By.xpath(
				"//div[@class=\"_1wE2Px\"]/preceding-sibling::div[@class=\"_1UgUYI _2eN8ye\"]/descendant::a[text()='Men Footwear']/ancestor::div[@class=\"_1UgUYI _2eN8ye\"]/child::div[@class=\"_31z7R_\"]/descendant::a[6]"))
				.click();
	}

}
