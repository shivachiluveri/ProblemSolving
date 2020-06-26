package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingFromQCR {
	static WebDriver driver;
	//static WebElement == "Null";

	public static void openQCR() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://howqanew.raybiztech.com/qcr");
		driver.manage().window().maximize();
	}

	public static void customerSearch() {
		driver.findElement(By.xpath("//input[@id='txtMobileSearch']"))
				.sendKeys("shiva@mailinator.com");
		driver.findElement(By.xpath("//span[@class='input-group-addon']"))
				.click();
	

	}

	public static void calendarHandling() {
		driver.findElement(By.id("txtAppDate1")).click();

		driver.findElement(By.className("picker-switch")).click();

		String month = driver.findElement(By.className("month")).getText();
		System.out.println("month is:" + month);

		List<WebElement> months = driver.findElements(By.className("month"));
		System.out.println("number of months are:" + months.size());
		int monthCount = driver.findElements(By.className("month")).size();
		for (int mc = 0; mc < monthCount; mc++) {
			String text = driver.findElements(By.className("month")).get(mc)
					.getText();
			if (text.equalsIgnoreCase("apr")) {
				driver.findElements(By.className("month")).get(mc).click();
			}
		}

		String day = driver.findElement(By.className("day")).getText();
		System.out.println("day is:" + day);

		List<WebElement> days = driver.findElements(By.className("day"));
		System.out.println("number of days:" + days.size());
		int daysCount = driver.findElements(By.className("day")).size();
		for (int dc = 0; dc < monthCount; dc++) {
			String text = driver.findElements(By.className("day")).get(dc)
					.getText();
			for (int k = 1; k < 30; k++) {
				String sk = String.valueOf(k);
				if (text.equalsIgnoreCase(sk)) {
					if (driver.findElements(By.className("day")).get(dc)
							.isEnabled()) {
						driver.findElements(By.className("day")).get(dc)
								.click();
					}

				}
				break;
			}
		}

	}

	public static void selectService() {
		WebElement	 element1 = driver.findElement(By.id("storeServices"));
		element1.click();
		Select service = new Select(element1);
		service.selectByVisibleText("Diabetes");

	}
	public static void selectTime() {
		//int s = driver.findElements(By.tagName("option")).size();
		//System.out.println("number of options available are:"+s);
		
		for(int i=0;i<30;i++){
			WebElement time1 = driver.findElement(By.xpath("//*[@id='txtAppTime']/option[i]"));
		if(time1.isEnabled()){
			time1.click();
		}
		}
		//WebElement element = driver.findElement(By.id("txtAppTime"));
		//element.click();
		//Select service = new Select(element);
		//service.selectByVisibleText("Diabetes");
		

	}

	public static void main(String[] args) {
		openQCR();
		customerSearch();
		selectService();
		//selectTime();
		calendarHandling();
		

	}
}
