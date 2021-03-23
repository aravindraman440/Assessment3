package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) {
	// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//1.select by index
WebElement webElement1 = driver.findElementById("dropdown1");
Select select1=new Select(webElement1);
select1.selectByIndex(1);
//2.select by visible text
WebElement webElement2 = driver.findElementByName("dropdown2");
webElement2.click();
Select select2=new Select(webElement2);
select2.selectByVisibleText("UFT/QTP");
//3.select by value
WebElement webElement = driver.findElementByName("dropdown3");
Select select3=new Select(webElement);
select3.selectByValue("4");
//4.find noof dropdown
WebElement path = driver.findElementByXPath("//select[@class='dropdown']");
Select size=new Select(path);
List<WebElement> options = size.getOptions();
int size2 = options.size();
System.out.println(size2);
}
}
