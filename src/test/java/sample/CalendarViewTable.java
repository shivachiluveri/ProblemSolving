package sample;


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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarViewTable {
	static WebDriver driver;
	static int a;

	public static void main(String[] args) throws Throwable {
		navigateToViewApp();
		getCurrentDate();
		selectNextDate();
		viewAppointment();

	}

	public static String getCurrentDate() {
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
		if (dayList.contains(weekday))
		{
			System.out.println("in if");
		    int days = (Calendar.SATURDAY - weekday + 2) % 7;
		    calendar.add(calendar.DAY_OF_YEAR, days);
		}
		else {
			System.out.println("in else");
			calendar.add(calendar.DAY_OF_YEAR, 2);
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		date = calendar.getTime();
		
		String dateStr = dateFormat.format(calendar.getTime());
		System.out.println("date:"+dateStr);
		return dateStr;
	}
	
		public static void selectNextDate() throws Throwable {
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
		driver.findElement(
				By.xpath("//*[@id='sidebar']/div[3]/ul/li[4]/a/span")).click();
		
		}
	public static void viewAppointment() throws Exception {
		for (int i = 1; i <= 30; i++) {
			int a = driver.findElements(By.xpath("//*[@id='" + i + "']/td[9]/a")).size();
			if (a > 0) {
				String service = driver.findElement(By.xpath("//*[@id='" + i + "']/td[9]/a")).getText();
				System.out.println("service name is:: " + service);
				if (service.equalsIgnoreCase("Heart")) {
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

}