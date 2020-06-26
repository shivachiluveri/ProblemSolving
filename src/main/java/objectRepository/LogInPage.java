package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import PageObjects.WebElement;
public class LogInPage {
	static WebDriver driver;
	static WebElement element = null;

	public static WebElement link_Login(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='loginlink']"));
		return element;
	}

	public static WebElement textBox_EmailId(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		return element;
	}

	public static WebElement textBox_Password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		return element;
	}

	public static WebElement button_Login(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
		return element;
	}
	/*public static WebElement menubutton_viewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='sidebar']/div[3]/ul/li[4]/a/span"));
		return element;
	}
	public static WebElement calender_ViewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='datepicker']"));
		return element;
	}
	public static WebElement calender_nextMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@title='Next Month']"));
		return element;
	}*/
	public static WebElement menubutton_logout(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='/Home/Logout']"));
		return element;
	}
	
	
	

}
