package Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	static Sheet  excelsheet;
	
	
	public static String getdatafromexcel(int rowcount,int cellcount) throws EncryptedDocumentException, IOException {

	FileInputStream Myfile = new FileInputStream("D:\\exel.xlsx");
			 excelsheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
			String  data;
			try {
				  data= excelsheet.getRow(rowcount).getCell(cellcount).getStringCellValue();
			}
			catch (Exception e) {
				data="";
			}
			 return data;
			 }
	
	public static int getRowNum() throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("D:\\exel.xlsx"); 
		excelsheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		int rowNum = excelsheet.getLastRowNum();
		return rowNum;
	}
	public static int getCellNum(int row) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("D:\\exel.xlsx"); 
		excelsheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		int cellNum = excelsheet.getRow(row).getLastCellNum();
		return cellNum;
	}
	
	public static void snapshot(WebDriver driver) throws IOException {
	File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String	random=RandomString.make(3);
File dest= new File("D:\\Seleniumscreenshot\\snapshot"+random+".png");
FileHandler.copy(snap, dest);
	
	}
	public static void setdatainXL(String data,int row ,int cell  ) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("D:\\exel.xlsx"); 
		excelsheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		excelsheet.getRow(row).getCell(cell).setCellValue(data);		
	}


	
	

}
