package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteNewNaturopathServicePage {
	public WebDriver driver;

	By reasonForVisit = By.xpath("//*[@id='txtPresentingProblem']");
	By notes = By.xpath("//*[@id='txtNotes']");
	By waist = By.xpath("//input[@id='txtWaist']");
	By recommendations = By.xpath("//*[@id='txtRecommendations']");
	By printPreview = By.xpath("//*[@id='btnWellnessHeartPreviewReport2']");
	
	By printYes = By.xpath("//button[@id='btnPrintContent']");

	public CompleteNewNaturopathServicePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement textBox_reasonForVisit() {
		return driver.findElement(reasonForVisit);
	}
	public WebElement textBox_Notes() {
		return driver.findElement(notes);
	}
	public WebElement textBox_recommendations() {
		return driver.findElement(recommendations);
	}
	public WebElement button_printPreview() {
		return driver.findElement(printPreview);
	}

}
