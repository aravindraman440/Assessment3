package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
public static void main(String[] args) {
	// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/table.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> list = driver.findElementsByXPath("//table[@id='table_id']//tr");
//int size = list.size();
System.out.println(size);
String text = driver.findElementByXPath("//table[@id='table_id']//tr/td[1]").getText();
System.out.println(text);
for (int i = 0; i < args.length; i++) {
	WebElement loop=driver.findElementByXPath("//table[@id='table_id']//tr"+i+"/td[1]");
	System.out.println(loop);
}

}

}

