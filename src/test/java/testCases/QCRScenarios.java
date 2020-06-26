package testCases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import objectRepository.LogInPage;
import objectRepository.QCRPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class QCRScenarios extends Base {// extends CustomerScenarios

	@BeforeTest
	void openHoW() throws Exception {
		CustomerScenarios.phoneNum();
		CustomerScenarios.fname();
		CustomerScenarios.lname();
		driver = initializeDriver();
	}

	@Test
	public void openQCR() {
		//driver.get("http://howqanew.raybiztech.com/qcr");
		LogInPage.link_Login(driver).click();
		LogInPage.textBox_EmailId(driver).sendKeys(prop.getProperty("Laura"));
		LogInPage.textBox_Password(driver).sendKeys(prop.getProperty("password"));
		LogInPage.button_Login(driver).click();
		QCRPage.leftMenu_link(driver).click();
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
				
	}

	@Test
	public void searchInQCR_withPhone() {
		QCRPage.input_Search(driver).sendKeys("612957850");
		QCRPage.button_Search(driver).click();
		String sValue = QCRPage.growl_CustomerExists(driver).getText();
		System.out.println(sValue);
		QCRPage.button_cancel(driver).click();
	}
	//@Test
	public void searchInQCR_withemail() {
		QCRPage.input_Search(driver).clear();
		QCRPage.input_Search(driver).sendKeys("21@mailinator.com");
		QCRPage.button_Search(driver).click();
	}
	//@Test
	public void cancelButtonFunactionality() {
		QCRPage.input_Search(driver).sendKeys("testCancel");
		QCRPage.button_cancel(driver).click();
	}
//	@Test
	public void bookAppointment() {
		Select ddApp = new Select(QCRPage.dd_selectService(driver));
		ddApp.selectByVisibleText("Diabetes");
		QCRPage.button_BookAppointment(driver).click();
	}

}
