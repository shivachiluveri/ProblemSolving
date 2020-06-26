package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenQCRPage {
	public static WebElement element = null;

	public static WebElement button_EditProfile(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//a[@href='/Profile/EditProfile']"));
		return element;
	}
	public static WebElement test(WebDriver driver) {
	element = driver.findElement(By.xpath("test"));
	return element;
}

}
