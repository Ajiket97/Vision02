package Com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraAddtoCart {
	@Test
	public void addToCart() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/shoes?f=Gender%3Amen%2Cmen%20women&rawQuery=shoes");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
		List<WebElement> lisy = d.findElements(By.xpath("//ul[@class=\"results-base\"]/child::li"));
		for (WebElement ListOfShoes : lisy) {
			String shoename = ListOfShoes.getText();
			System.out.println(shoename);
			if (shoename.contains("Men")) {
				System.out.println("passs");

			} else {
				System.err.println("fail");
			}

		}

	}

}
