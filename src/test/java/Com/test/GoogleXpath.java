package Com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleXpath {
	@Test
	public void findxpath() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/ ");
		d.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("pizza");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		//List<WebElement> list = d.findElements(By.xpath("//div[@id=\"Alh6id\"]/descendant::li"));
		List<WebElement> list = d.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/child::li"));

		//ul[@jsname="bw4e9b"]/child::li[@role="presentation"]

		for (WebElement webElement : list) {
			String text =webElement.getText();
			
			System.out.println(text);
			if (text.contains("galleria")) {
				System.out.println("displayed requried result");
			}
			

		}
	}
}
