package Com.test;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShort {
	public static void byUsingRoboatClass() throws AWTException, IOException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		Robot robo = new Robot();
		Rectangle rect = new Rectangle();
		rect.height=800;
		rect.width=900;
		BufferedImage img = robo.createScreenCapture(rect);
        ImageIO.write(img,"jpg" , new File("ajittt.jpg"));

		

	}
	
	public static void main(String[] args) throws AWTException, IOException {
		byUsingRoboatClass();
		
	}

}
