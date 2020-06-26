package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoThroughViewAppLinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		
		///////////////////////////////////////////////////////////////////////
		
		for (int i = 1; i <= 30; i++) {
			int a = driver.findElements(By.xpath("//*[@id='" + i + "']/td[9]/a")).size();
			if (a > 0) {
				String service = driver.findElement(
						By.xpath("//*[@id='" + i + "']/td[9]/a")).getText();
				System.out.println("service name is:: " + service);
				if(service.equalsIgnoreCase("diabetes")){
				driver.findElement(By.xpath("//*[@id='" + i + "']/td[9]/a")).click();
				break;
				}
			
			}
		}

	}

}
