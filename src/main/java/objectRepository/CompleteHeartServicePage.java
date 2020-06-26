package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteHeartServicePage {
	public WebDriver driver;

	By next = By.xpath("//input[@id='btnNotessubmit']");
	By waistMeasure = By.xpath("//input[@id='Waistmeasure']");
	By waist = By.xpath("//input[@id='txtWaist']");
	By bpconsent = By.xpath("//input[@id='txtWeight']");
	By sbp = By.xpath("//input[@id='txtBPValue']");
	By dbp = By.xpath("//input[@id='txtBPValue2']");
	By demographicsNext = By.xpath("//input[@id='btnsubmit']");
	By generateWP = By.xpath("//input[@id='btnNext']");
	By products = By.xpath("//input[@id='idproduct']");
	By generalComments = By.xpath("//textarea[@id='ReviewComments']");
	By printPreview = By.xpath("//button[@id='btnWellnessHeartPreviewReport2']");
	By sendEmail = By.xpath("//button[@id='btnpdf']");
	By printPDF = By.xpath("//button[@id='print_req_wellness_1']");
	By printYes = By.xpath("//button[@id='btnPrintContent']");

	public CompleteHeartServicePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement button_Next() {
		return driver.findElement(next);
	}
	public WebElement cb_waistMeasure() {
		return driver.findElement(waistMeasure);
	}
	public WebElement input_Waist() {
		return driver.findElement(waist);
	}
	public WebElement dd_bpconsent() {
		return driver.findElement(bpconsent);// further need to do select by
	}
	public WebElement input_sbp() {
		return driver.findElement(sbp);
	}
	public WebElement input_dbp() {
		return driver.findElement(dbp);
	}
	public WebElement button_demographicsNext() {
		return driver.findElement(demographicsNext);
	}
	public WebElement button_generateWP() {
		return driver.findElement(generateWP);
	}
	public WebElement button_printPreview() {
		return driver.findElement(printPreview);
	}
	public WebElement input_products() {
		return driver.findElement(products);// required actions class
	}
	public WebElement input_generalComments() {
		return driver.findElement(generalComments);
	}
	public WebElement button_sendEmail() {
		return driver.findElement(sendEmail);
	}
	public WebElement button_printPDF() {
		return driver.findElement(printPDF);
	}
	public WebElement button_printYes() {
		return driver.findElement(printYes);
	}
}
