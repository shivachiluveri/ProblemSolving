package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUsingJS {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		navigateToViewApp();
	}
	public static void navigateToViewApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://howqanew.raybiztech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='loginlink']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(
				"elana@amsolutions.com.au");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(
				"ray1@3");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		driver.findElement(	By.xpath("//*[@id='sidebar']/div[3]/ul/li[4]/a/span")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker').value='30/01/2019'");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
		
		}
	
	public static void dateIs(){
		
		
		
	}
	

}
