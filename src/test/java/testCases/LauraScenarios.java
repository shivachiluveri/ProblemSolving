package testCases;

import java.util.List;

import objectRepository.CompleteNewNaturopathServicePage;
import objectRepository.LogInPage;
import objectRepository.ViewAppointments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class LauraScenarios extends Base {
	@BeforeTest
	void openHoW() throws Exception {
	CustomerScenarios.phoneNum();
	CustomerScenarios.fname();
	CustomerScenarios.lname();
	driver = initializeDriver();
	}

@Test(priority = 1)
public void warriorLogin() throws Exception {

	LogInPage.link_Login(driver).click();
	LogInPage.textBox_EmailId(driver).sendKeys(prop.getProperty("Laura"));
	LogInPage.textBox_Password(driver).sendKeys(
			prop.getProperty("password"));
	LogInPage.button_Login(driver).click();
	System.out.println(driver.getTitle());
	
	ViewAppointments.menubutton_viewApp(driver).click();
	System.out.println("warrior login is success");
	System.out.println("laura left menu name::"+driver.findElement(By.xpath("//*[@id='login_user']/b")).getText());
//	Assert.assertEquals("laura", "laura");
}
@Test(priority = 2)
public void calendarHandling() {
	driver.findElement(By.id("datepicker")).click();
	driver.findElement(By.className("picker-switch")).click();
	String month = driver.findElement(By.className("month")).getText();
	System.out.println("month is:" + month);
	List<WebElement> months = driver.findElements(By.className("month"));
	System.out.println("number of months are:"+months.size());
	int monthCount = driver.findElements(By.className("month")).size();
	for (int mc = 0; mc < monthCount; mc++) {
		String text = driver.findElements(By.className("month")).get(mc).getText();
		if (text.equalsIgnoreCase("apr")) {
			driver.findElements(By.className("month")).get(mc).click();
		}
	}
	String day = driver.findElement(By.className("day")).getText();
	System.out.println("day is:" + day);

	List<WebElement> days = driver.findElements(By.className("day"));
	System.out.println("number of days:"+days.size());
	int daysCount = driver.findElements(By.className("day")).size();
	for (int dc = 0; dc < monthCount; dc++) {
		String text = driver.findElements(By.className("day")).get(dc)
				.getText();
		for(int k=1;k<30;k++){
			String sk = String.valueOf(k);
		if (text.equalsIgnoreCase(sk)) {
			if(driver.findElements(By.className("day")).get(k).isEnabled()){
				driver.findElements(By.className("day")).get(k).click();
				break;
			}
		}
	}
  }
}
@Test(priority = 2)
public void viewAppointment() throws Exception {
	for (int i = 1; i <= 30; i++) {
		int a = driver.findElements(
				By.xpath("//*[@id='" + i + "']/td[9]/a")).size();
		if (a > 0) {
			String service = driver.findElement(
					By.xpath("//*[@id='" + i + "']/td[9]/a")).getText();
			System.out.println("service name is:: " + service);
			if (service.equalsIgnoreCase("Naturopathy")) {
				System.out.println(service + " appointment is available ");
				driver.findElement(By.xpath("//*[@id='" + i + "']/td[9]/a")).click();
				break;
			} else {
				System.out.println("expected service is not available, change calendar to next day");

			}
		}
	}
	System.out.println("view appoitnments method is executed");
}
@Test(priority = 3)
public void noDataValidation() throws Throwable{
	CompleteNewNaturopathServicePage objNAt = new CompleteNewNaturopathServicePage(driver);
	objNAt.button_printPreview().click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='wellnessAlert']")));
	objNAt.driver.findElement(By.xpath("//button[@id='wellnessAlert']")).click();
}


@Test(priority = 4)
public void NaturopathPrintPreview() throws Throwable{
	CompleteNewNaturopathServicePage objNAt = new CompleteNewNaturopathServicePage(driver);
	objNAt.button_printPreview().click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='wellnessAlert']")));
	objNAt.driver.findElement(By.xpath("//button[@id='wellnessAlert']")).click();
}
}
