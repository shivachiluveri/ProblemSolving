package sample;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleWebDriverManager {
	public static void main(String[] args) {
		new SampleWebDriverManager().testDriverManagerChrome();
		new SampleWebDriverManager().testDriverManagerFirefox();
	}

	public void testDriverManagerChrome() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	public void testDriverManagerFirefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}