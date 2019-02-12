package com.pagelibrary.com.ranfordbank;



import org.testng.annotations.Test;

import Excel.Excel_class;

public class TestExecution extends Reprository
{
	@Test(priority=-1)
	public void verify_lunch()
	{
		lunch();
	}


	@Test(priority=0)
	public void varify_login()
	{
		login();
	}


	@Test(priority=1)
	public void varify_branches()
	{

		branches();
	}


	@Test(priority=2)
	public void varify_newBranch()
	{
		Excel_class.excelconnection("dataTest.xls","Sheet1");
		Excel_class.outputexcelconnection("dataTest.xls", "Sheet1","output.xls");

		for(int r=1;r<Excel_class.rowcount();r++)
		{
			newBranch(Excel_class.readdata(0,r),Excel_class.readdata(1,r),Excel_class.readdata(2,r),
					Excel_class.readdata(3,r),Excel_class.readdata(4,r),Excel_class.readdata(5,r),
					Excel_class.readdata(6,r),Excel_class.readdata(7,r),Excel_class.readdata(8,r));


			String text=driver.switchTo().alert().getText();

			driver.switchTo().alert().accept();

			if(text.contains("already Exist"))
			{
				Excel_class.writedata(9, r, text);
			}
			else if(text.contains("created successfully"))
			{
				Excel_class.writedata(9, r, text);
			}
			else
			{
				Excel_class.writedata(9, r, "n/a");
			}
		}
		Excel_class.saveworkbook();

	}





@Test(priority=3)
public void varify_role()
{
	role();
}



@Test(priority=4)
public void varify_newRole()
{
	Excel_class.excelconnection("dataTest.xls","role");
	Excel_class.outputexcelconnection("dataTest.xls", "role","output.xls");
	for(int r=1;r<Excel_class.rowcount();r++)
	{
		newRole(Excel_class.readdata(0,r),Excel_class.readdata(1,r),Excel_class.readdata(2,r));
		
		
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if(text.contains("already Exist"))
		{
			Excel_class.writedata(3, r, text);
		}
		else if(text.contains("created successfully"))
		{
			Excel_class.writedata(3, r, text);
		}
		else
		{
			Excel_class.writedata(3, r, "n/a");
		}
	}
	Excel_class.saveworkbook();
	
}

/*@Test(priority=5)
	public void varify_user()
	{
		user();
	}


	@Test(priority=6)
	public void varify_newUser()
	{
		newUser();
	}*/



@Test(priority=7)
	public void varify_emp()
	{
		employee();
	}


@Test(priority=8)
public void varify_newEmp()
{
	Excel_class.excelconnection("dataTest.xls","newEmployee");
	Excel_class.outputexcelconnection("dataTest.xls", "newEmployee","output.xls");

	for(int r=1;r<Excel_class.rowcount();r++)
	{
		newEmployee(Excel_class.readdata(0,r), Excel_class.readdata(1,r),
				Excel_class.readdata(2,r), Excel_class.readdata(3,r));


		String text=driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();

		if(text.contains("already Exist"))
		{
			Excel_class.writedata(4, r, text);
		}
		else if(text.contains("created successfully"))
		{
			Excel_class.writedata(4, r, text);
		}
		else
		{
			Excel_class.writedata(4, r, "n/a");
		}
	}
	Excel_class.saveworkbook();

}


	/*@Test(priority=9)
	public void varify_table_handle()
	{
		table_handle();
	}
*/
 

}
