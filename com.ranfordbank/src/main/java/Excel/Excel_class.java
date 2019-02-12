package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_class extends Base {
	public static String folderpath=getconfig("folderpth");

	static Sheet sh;
	static Workbook wb;
	 static WritableWorkbook  wwb;
	static  WritableSheet    wsh;
	//read the data
	public static void excelconnection(String filename,String sheetname)
	{
		try
		{
			File f=new File(folderpath+filename);
			Workbook wb=Workbook.getWorkbook(f);
			sh=wb.getSheet(sheetname);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void ccount()
	{
		int cc=sh.getColumns();
	}
	
	
	public static int rowcount()
	{
		int rc=sh.getRows();
		return rc;
		
	}
	
	
	public static String readdata(int col,int row)
	{
		String str=sh.getCell(col, row).getContents();
		return str;
		
	}
	//read nd write the data
	public static void outputexcelconnection(String ifilename,String sheetname,String ofilename)
	{
		try {
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
			
			 wb=Workbook.getWorkbook(fis);
				
			 sh= wb.getSheet(sheetname);
			 
			 FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
			
			wwb=Workbook.createWorkbook(fos, wb);
			 
			 wsh= wwb.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public static void writedata(int col,int row,String data)
	{
		  try {
			Label l=new Label(col, row, data);
			  wsh.addCell(l);
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void saveworkbook()
	{
		  try {
			wwb.write();
			  wwb.close();
			  wb.close();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

	


