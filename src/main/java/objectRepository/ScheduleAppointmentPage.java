package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ScheduleAppointmentPage {
	public static WebElement element = null;
	public static WebElement leftMenu_ScheduleAppointment(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Schedule Appointments')]"));
		return element;
	}
	public static WebElement image_Weight(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@href='javascript:void(0);']"));
		return element;
	}
	public static WebElement button_Accept(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='btnIAgree']"));
		return element;
	}
	public static WebElement calendar_SelectDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtAppDate']"));
		return element;
	}public static WebElement calendar_NextMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@title='Next Month']"));
		return element;
	}
	public static WebElement testc(WebDriver driver) {
		element = driver.findElement(By.xpath("test"));
		return element;
	}
	
}
