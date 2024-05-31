package shrikant;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWebTable {

	public static void printWebTable() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/descendant::tr"));
		List<WebElement> colList = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/descendant::th"));
		for (int r = 2; r <= rowList.size(); r++) {
			for (int c = 1; c <= colList.size(); c++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(data + "|");
			}
			System.out.println();
			
		}
		driver.close();
	}

	public static void checkSpecificDataElement(String searchElement) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr"));
		List<WebElement> colList = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[1]/th"));
		// to print no of rows
		System.out.println("No of Rows are: " + rowList.size());
		// to print no of Cols
		System.out.println("No of Coulmns are: " + colList.size());
		boolean flag = false;
		for (int r = 2; r <= rowList.size(); r++) {
			for (int c = 1; c <= colList.size(); c++) {
				String data = driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				if (data.equals(searchElement)) {
					System.out.println("Auther Name: " + searchElement + " is found");
					flag = true;
					break;
				}
			}

		}
		if (flag == false)
			System.out.println("Auther Name: " + searchElement + " is NOT found");
		driver.close();
	}

	public static void main(String[] args) {
		 //printWebTable();
		checkSpecificDataElement("Mukesh123");

	}

}
