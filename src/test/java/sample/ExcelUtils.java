package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.commons.math3.analysis.function.Constant;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
public static void main(String[] args) throws Exception {

	FileInputStream fis = new FileInputStream("E:\\dataPOI.xlsx");
	XSSFWorkbook obj1 = new XSSFWorkbook(fis);
	int a = obj1.getNumberOfSheets();
	for(int b=0; b<a; b++) {
		if(obj1.getSheetName(b).equalsIgnoreCase("customers")){
			XSSFSheet sheet =obj1.getSheetAt(b);	
		Iterator<Row>	rows = sheet.iterator(); //iterator is java.util; row is apache user model
		rows.next();
		Row firstrow = rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();
		int k=0;
		int column = 0;
		while(ce.hasNext()) {
			Cell value = ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("cusb1")) {
				k++;
				column=k;
			}
			System.out.println(column);
			while(rows.hasNext()) {
				Row r = rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("cusb2")){
			Iterator<Cell> cv =	r.cellIterator();	
			while(cv.hasNext()) {
				System.out.println(cv.next().getStringCellValue());
			}
				}
				}
		}
		
		}
	
	}
}
	
}	