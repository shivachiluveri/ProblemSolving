package testCases;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import objectRepository.EditProfilePage;
import objectRepository.LogInPage;
import objectRepository.RegisterPage;
import objectRepository.ScheduleAppointmentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class CustomerScenarios extends Base {
	public static WebDriver driver;
	static String fn;
	static String ln;
	static String phone;

	@BeforeTest
	void openHoW() throws Exception {
		CustomerScenarios.phoneNum();
		CustomerScenarios.fname();
		CustomerScenarios.lname();
		driver =initializeDriver();
	}

	@Test
	public static void CreateCustomer() {
		RegisterPage.TextBox_FirstName(driver).sendKeys(fn);
		RegisterPage.TextBox_LastName(driver).sendKeys(ln);

		Select selAge = new Select(driver.findElement(By
				.xpath("//select[@id='txtAge']")));
		selAge.selectByIndex(3);

		RegisterPage.TextBox_Phone(driver).sendKeys(phone);
		RegisterPage.RadioButton_Gender(driver).click();
		RegisterPage.TextBox_Email(driver).sendKeys(fn + "@mailinator.com");
		RegisterPage.TextBox_PassWord(driver).sendKeys(prop.getProperty("password"));
		RegisterPage.TextBox_ConfirmPW(driver).sendKeys(prop.getProperty("password"));
		RegisterPage.Button_Register(driver).click();
	}

	@Test
	public static void editProfile() throws InterruptedException {
		EditProfilePage.button_EditProfile(driver).click();
	}

	@Test
	public static void scheduleAppointment() {
		ScheduleAppointmentPage.leftMenu_ScheduleAppointment(driver).click();
		ScheduleAppointmentPage.image_Weight(driver).click();
		ScheduleAppointmentPage.button_Accept(driver).click();
		ScheduleAppointmentPage.calendar_SelectDate(driver).click();
		ScheduleAppointmentPage.calendar_NextMonth(driver).click();
	}

	public static void fname() {
		String SALTCHARS = "abcdefghijkl";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 4) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		fn = salt.toString();
	}

	public static void lname() {
		String SALTCHARS1 = "mnopqrstuvwxyz";
		StringBuilder salt1 = new StringBuilder();
		Random rnd = new Random();
		while (salt1.length() < 4) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS1.length());
			salt1.append(SALTCHARS1.charAt(index));
		}
		ln = salt1.toString();
	}

	public static void phoneNum() {
		String SALTCHARS1 = "0123456789";
		StringBuilder salt1 = new StringBuilder();
		Random rnd = new Random();
		while (salt1.length() < 9) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS1.length());
			salt1.append(SALTCHARS1.charAt(index));
		}
		phone = salt1.toString();
	}
}
