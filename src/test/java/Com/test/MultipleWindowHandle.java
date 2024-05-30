package Com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MultipleWindowHandle {
	public static void windowHandle() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		FluentWait wait = new FluentWait(d);

		d.get("https://www.testingshastra.com/multiple-window-handling-assignment/");

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		d.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String originalwindow = d.getWindowHandle();
		
		
		Set<String> allwindow = d.getWindowHandles();
				for (String string : allwindow) {
			if (originalwindow.equalsIgnoreCase(string)) {
				System.out.println("original window");
				
			} else {
				d.switchTo().window(string);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"clickMe()\"]")));
				//d.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
				//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				d.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
				String msg =d.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
				System.out.println(msg);

			}
		}
	}

	public static void main(String[] args) {
		windowHandle();
	}
}
