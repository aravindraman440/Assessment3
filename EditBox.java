package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementById("email").sendKeys("aravindraman440@gmail.com");
driver.findElementByXPath("//input[@value='Append ']").sendKeys("TEXT");
String text = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
System.out.println(text);
driver.findElementByXPath("//input[@value='TestLeaf']").sendKeys("ARAVIND");
driver.findElementByXPath("//input[@value='Clear me!!']").clear();
 boolean displayed = driver.findElementByXPath("//input[@disabled='true']").isDisplayed();
System.out.println(displayed);
	}

}
