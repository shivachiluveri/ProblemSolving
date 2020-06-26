package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowCalendar {
	static WebDriver driver;

	public static void calendarHandling() {
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
				if(driver.findElements(By.className("day")).get(dc).isEnabled()){
					driver.findElements(By.className("day")).get(dc).click();	
				}
							
			}
			break;
		}
	
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		openHoW();
		calendarHandling();

	}

	public static void openHoW() throws InterruptedException {
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
}
