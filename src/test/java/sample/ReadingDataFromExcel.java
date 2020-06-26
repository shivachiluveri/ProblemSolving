package sample;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromExcel {

	public static void main(String args[]) throws IOException, JXLException,
			Throwable {

		System.setProperty("webdriver.chrome.driver",
				"D:\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\Abhishek\\Desktop\\testxls\\Data.xls");
		Workbook W = Workbook.getWorkbook(fi);
		Sheet s = W.getSheet("Login");

		int i = s.getRows();
		System.out.println("Number Of rows" + i);

		int j = s.getColumns();

		System.out.println("Number Of Columns" + j);

		int z = 1;

		obj.get("http://camshotqa.raybiztech.com");
		obj.manage().window().maximize();
		
		for (int l = 0; l < j; l++)

			for (int k = l; k <= l; k++)
				do {
					
					obj.findElement(By.id("txtUsername")).sendKeys(
							s.getCell(l, k).getContents());

					obj.findElement(By.xpath("//input[@id='txtPassword']"))
							.sendKeys(s.getCell(l, k).getContents());
					obj.findElement(By.xpath("//div[@class='row submitbtn']"))
							.click();
					Thread.sleep(5000);
					obj.findElement(By.xpath("//i[@class='fa fa-angle-down']"))
							.click();
					obj.findElement(By.xpath("//a[contains(text(),'Log Out')]"))
							.click();
					obj.close();
					z++;

				} while (z <= 3);

	}
}



/*
 * for(i=1; i<4; i++)
	for (j=i; j<=i; j++)
		username(j)
		password(j)	
		click
		logout

(l,k)


for(l=0;)
for(k=)

(0,0)(0,1)

(1,0)(1,1)

(2,0)(2,1)
 * 
 */
