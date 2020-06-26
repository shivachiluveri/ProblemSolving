package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompleteWeightService {
	public WebDriver driver;

	By next = By.xpath("//input[@id='btnNotessubmit']");
	By waistMeasure = By.xpath("//input[@id='Waistmeasure']");
	By waist = By.xpath("//input[@id='txtWaist']");
	By weight = By.xpath("//input[@id='txtWeight']");
	By height = By.xpath("//input[@id='txtHeight']");
	By calculateBMI = By.xpath("//input[@id='btnsubmit']");
	By generateWP = By.xpath("//input[@id='btnNext']");
	By energyinGoals = By.xpath("//div[@id='intermediate-risk']//div[3]//div[1]//label[1]//input[1]");
	
	By products = By.xpath("//input[@id='idproduct']");
	By generalComments = By
			.xpath("//button[@id='btnWellnessBMIPreviewReport2']");
	By sendEmail = By.xpath("//button[@id='btnpdf']");
	By printPDF = By.xpath("//button[@id='print_req_wellness_1']");
	By printYes = By.xpath("//button[@id='btnPrintContent']");

	public CompleteWeightService(WebDriver driver) {
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
	public WebElement input_weight() {
		return driver.findElement(weight);
	}
	public WebElement input_height() {
		return driver.findElement(height);
	}
	public WebElement button_calculateBMI() {
		return driver.findElement(calculateBMI);
	}
	public WebElement button_generateWP() {
		return driver.findElement(generateWP);
	}
	public WebElement cb_energyinGoals() {
		return driver.findElement(energyinGoals);
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

/* energy in goals 
 * //div[@id='intermediate-risk']//div[3]//div[1]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[2]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[3]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[2]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[4]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[5]//label[1]//input[1]
 * //div[@id='intermediate-risk']//div[3]//div[6]//label[1]//input[1]
 * //div[@class='checkbox-group']//div[7]//label[1]//input[1]
 * //div[@class='checkbox-group']//div[8]//label[1]//input[1]
 */