package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1.click home page
		WebElement id = driver.findElementById("home");
		id.click();
		Thread.sleep(3000);
		driver.navigate().to("http://leafground.com/pages/Button.html");
		driver.navigate().forward();
		driver.navigate().refresh();
		//2.find buttonposition 
		WebElement buttonPosition = driver.findElementById("position");
		Point xyposition = buttonPosition.getLocation();
		int xvalue = xyposition.getX();
		int yvalue = xyposition.getY();
		//3.find colour
		WebElement colour = driver.findElementById("color");
		String cssValue = colour.getCssValue("background-color");
		System.out.println("colour is:"+cssValue);
		//4.buttonsize
		WebElement size = driver.findElementById("size");
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("height is:"+height+" "+"width is:"+width);
		System.out.println("xvalue is:"+xvalue+" "+"yvalue is:"+yvalue);
		
		
		
	}

}
