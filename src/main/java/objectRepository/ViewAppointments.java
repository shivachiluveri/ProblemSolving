package objectRepository;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewAppointments {
	static WebDriver driver;
	static WebElement element = null;
	static WebElement elements = null;
	static Integer links =  null;
	static int i;
	
	
	
	public static WebElement menubutton_viewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='sidebar']/div[3]/ul/li[3]/a/span"));
		return element;
	}
	public static WebElement calendar_ViewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='datepicker']"));
		return element;
	}
	public static WebElement calendar_nextMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@title='Next Month']"));
		return element;
	}
	
	public static WebElement filterBox_Service(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='gs_AppService']"));
		return element;
	}
	public static WebElement link_viewWeight(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='2']/td[9]/a"));
		return element;
	}
	public static WebElement link_viewHeart(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='23']/td[9]/a"));
		return element;
	}
	public static WebElement link_viewDiabetes(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='23']/td[9]/a"));
		return element;
	}
	public static WebElement filterBox_Type(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='gs_Type']"));
		return element;
	}
	public static WebElement filterBox_Status(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='gs_AppStatus']"));
		return element;
	}
	public static WebElement tr_S_No(WebDriver driver) {
		element = driver.findElement(By.xpath("//tr[@id='1']//td[@title='1'][contains(text(),'1')]"));
		return element;
	}
	
	public static WebElement table_ViewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='head-rounded-corners']"));
		return element;
	}
	
	 
	  public static WebElement table_rowCount(WebDriver driver) {

		element = (WebElement) driver.findElements(By.xpath("//*[@id='1']"));
				return element;
	}
	  public static WebElement link_openService(WebDriver driver) {
		 List elements = (List) driver.findElements(By.xpath("//*[@id='" + i + "']/td[9]/a"));
		return (WebElement) elements;

		}
	

}