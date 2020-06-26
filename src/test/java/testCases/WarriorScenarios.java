package testCases;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.CompleteDiabetesServicePage;
import objectRepository.CompleteHeartServicePage;
import objectRepository.CompleteWeightService;
import objectRepository.LogInPage;
import objectRepository.ViewAppointments;
import resources.Base;

public class WarriorScenarios extends Base {

	@BeforeTest
		void openHoW() throws Exception {
		CustomerScenarios.phoneNum();
		CustomerScenarios.fname();
		CustomerScenarios.lname();
		driver = initializeDriver();
		System.out.println("open how method");
	}

	@Test(priority = 1)
	// @Test
	public void warriorLogin() throws Exception {

		LogInPage.link_Login(driver).click();
		LogInPage.textBox_EmailId(driver).sendKeys(prop.getProperty("elana"));
		LogInPage.textBox_Password(driver).sendKeys(
				prop.getProperty("password"));
		LogInPage.button_Login(driver).click();
		ViewAppointments.menubutton_viewApp(driver).click();
		System.out.println("warrior login is success");
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
	
	@Test(priority = 3)
	public void viewAppointment() throws Exception {
		for (int i = 1; i <= 30; i++) {
			int a = driver.findElements(
					By.xpath("//*[@id='" + i + "']/td[9]/a")).size();
			if (a > 0) {
				String service = driver.findElement(
						By.xpath("//*[@id='" + i + "']/td[9]/a")).getText();
				System.out.println("service name is:: " + service);
				if (service.equalsIgnoreCase("weight")) {
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
	@Test(enabled = false)
//	@Test(dependsOnMethods = { "viewAppointment" })
	public void view_HeartService() {
		CompleteHeartServicePage objHt = new CompleteHeartServicePage(driver);
		objHt.button_Next().click();
		objHt.cb_waistMeasure().click();
		objHt.input_Waist().sendKeys("41");
		objHt.button_demographicsNext().click();
		objHt.input_generalComments().sendKeys("test comments");
		objHt.button_printPreview().click();

	}

	@Test(enabled = false)
	// @Test(dependsOnMethods = { "viewAppointment" })
	public void view_WeightService() {
		CompleteWeightService objWt = new CompleteWeightService(driver);
		objWt.button_Next().click();
		objWt.cb_waistMeasure().click();
		objWt.input_Waist().sendKeys("45");
		objWt.input_weight().sendKeys("26");
		objWt.input_height().sendKeys("100");
		objWt.button_calculateBMI().click();
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//input[@id='btnNext']")));
		objWt.button_generateWP().click();
		objWt.cb_energyinGoals().click();
		Actions action = new Actions(driver);
		action.moveToElement(objWt.input_products()).build().perform();
	}

	@Test(enabled=false)
	public void view_Diabetes() throws Throwable {
		CompleteDiabetesServicePage objDi = new CompleteDiabetesServicePage(driver);
		WebDriverWait d = new WebDriverWait(driver, 30);
		d.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//*[@id='Iddemographics']")));
		objDi.tabButton_demographicsTab().click();
		objDi.cb_waistMeasure().click();
		objDi.input_Waist().sendKeys("34");
		objDi.input_weight().sendKeys("60");
		objDi.button_demographicsNext().click();
		objDi.link_riskNext().click();
		objDi.link_riskNext2().click();
		System.out.println("view diabetes");
	}

	@Test(enabled=false)
		public String getCurrentDate() {
		List<Integer> dayList = new ArrayList<>();
		dayList.add(Calendar.WEDNESDAY);
		dayList.add(Calendar.THURSDAY);
		dayList.add(Calendar.FRIDAY);
		dayList.add(Calendar.SATURDAY);
		dayList.add(Calendar.SUNDAY);

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayList.contains(weekday)) {
			System.out.println("in if");
			int days = (Calendar.SATURDAY - weekday + 2) % 7;
			calendar.add(calendar.DAY_OF_YEAR, days);
		} else {
			System.out.println("in else");
			calendar.add(calendar.DAY_OF_YEAR, 1);
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		date = calendar.getTime();

		String dateStr = dateFormat.format(calendar.getTime());
		System.out.println("date:" + dateStr);
		return dateStr;
	}
	// @Test(dependsOnMethods = { "getCurrentDate" })
	@Test(enabled=false)
		public void selectNextDate() throws Throwable {
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String Exp_Date = getCurrentDate();
		int Current_year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(Current_year);
		String date_MM_dd_yyyy[] = Exp_Date.split("-");
		WebElement Mid_month = driver.findElement(By
				.cssSelector("th.picker-switch"));
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"Aug", "Sep", "Oct", "Nov", "Dec" };
		String Cur_Month = monthName[Calendar.getInstance().get(Calendar.MONTH)];
		System.out.println(Cur_Month);
		if (Cur_Month.equalsIgnoreCase(date_MM_dd_yyyy[0])) {
			for (int i = 1; i < 8; i++) {
				for (int j = 1; j < 8; j++) {
					if (driver
							.findElement(
									By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[1]/table/tbody/tr["
											+ i + "]/td[" + j + "]")).getText()
							.equals(date_MM_dd_yyyy[1]))

					{
						driver.findElement(
								By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[1]/table/tbody/tr["
										+ i + "]/td[" + j + "]")).click();
					}
				}
			}
		} else {
			Mid_month.click();
			Thread.sleep(4000);
			for (int i = 1; i < 13; i++) {
				if (driver
						.findElement(
								By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[2]/table/tbody/tr/td/span["
										+ i + "]")).getText()
						.equals(date_MM_dd_yyyy[0])) {
					driver.findElement(
							By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[2]/table/tbody/tr/td/span["
									+ i + "]")).click();
					Thread.sleep(2000);
				}
			}
			// Selecting Exp Date
			for (int i = 1; i < 8; i++) {
				for (int j = 1; j < 8; j++) {
					if (driver
							.findElement(
									By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[1]/table/tbody/tr["
											+ i + "]/td[" + j + "]")).getText()
							.equals(date_MM_dd_yyyy[1]))

					{
						driver.findElement(
								By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li[1]/div/div[1]/table/tbody/tr["
										+ i + "]/td[" + j + "]")).click();
					}
				}
			}
		}
	}
}
