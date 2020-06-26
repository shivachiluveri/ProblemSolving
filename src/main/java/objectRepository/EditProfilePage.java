package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfilePage {

	public static WebElement element = null;

	public static WebElement test(WebDriver driver) {
		element = driver.findElement(By.xpath("test"));
		return element;
	}

	public static WebElement button_EditProfile(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//a[@href='/Profile/EditProfile']"));
		return element;
	}

	public static WebElement radioButton_GenderFemale(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//input[@id='rboGenderfemale']"));
		return element;
	}

	public static WebElement button_Update(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//button[@id='UpdateCustomer']"));
		return element;
	}

	public static WebElement button_Cancel(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='clearCustomer']"));
		return element;
	}

}
