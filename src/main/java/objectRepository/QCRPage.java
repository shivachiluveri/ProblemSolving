package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class QCRPage {
	public static WebElement element = null;
	public static WebElement input_Search(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//input[@id='txtMobileSearch']"));
		return element;
	}
	public static WebElement button_Search(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//span[@class='input-group-addon']"));
		return element;
	}

	public static WebElement input_firstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtFirstName']"));
		return element;
	}

	public static WebElement input_lastName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtLastName']"));
		return element;
	}

	public static WebElement input_phone(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtMobile']"));
		return element;
	}
	public static WebElement input_email(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtEmail']"));
		return element;
	}
	public static WebElement button_save(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnSave']"));
		return element;
	}	public static WebElement button_BookAppointment(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='bookappointment']"));
		return element;
	}
	public static WebElement button_cancel(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnCancel']"));
		return element;
	}
	public static WebElement dd_selectService(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='storeServices']"));
		return element;
	}
	public static WebElement growl_CustomerExists(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Customer already registered.']"));
		//element = driver.findElement(By.cssSelector(".//*[text()='Customer already registered.']"));
		return element;
		}
	public static WebElement growl_registrationSuccess(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[text()='Customer is Registered Succesfully.']"));
		//element = driver.findElement(By.cssSelector(".//*[text()='Customer already registered.']"));
		return element;
		}
	
	public static WebElement calendar_ViewApp(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtAppDate1']"));
		//*[@id="txtAppDate1"]
		return element;
	}
	public static WebElement calendar_nextMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@title='Next Month']"));
		// /html/body/div[1]/div/div/div[2]/div[1]/div
		return element;
	}
	public static WebElement leftMenu_link(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='qcr']/span"));
		// /html/body/div[1]/div/div/div[2]/div[1]/div
		return element;
	}
}
