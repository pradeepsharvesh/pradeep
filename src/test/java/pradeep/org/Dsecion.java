package pradeep.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.sdk.metrics.data.Data;

public class Dsecion {
	public static void main(String[] args) throws IOException{
		File E = new File("C:\\Users\\HP\\Desktop.xlsx");
		FileInputStream f = new FileInputStream(E);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("sheet 1");
		int rowSize = s.getPhysicalNumberOfRows();
		for(int i=0;i<rowSize;i++){
			Row r = s.getRow(i);
		int cellSize = r.getPhysicalNumberOfCells();
		for (int j=0;j<cellSize;j++){
			Cell c = r.getCell(j);
			int cellType = c.getCellType();
			if(cellType ==1){
				String Value = c.getStringCellValue();
				System.out.println(Value);
				}
			else if(cellType==0){
				if(DateUtil.isCellDateFormatted(c)){
					Date d = c.getDateCellValue();
					System.out.println(d);
				}
			}
			
		}
		}
	
		
	
		}
	}

