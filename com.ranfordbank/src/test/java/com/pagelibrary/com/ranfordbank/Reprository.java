package com.pagelibrary.com.ranfordbank;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.Base;
import utility.Library;
import webtable.Table_Handle;

public class Reprository extends Base
{ 
	public static ExtentReports  extent;
	public static ExtentTest test;

	@BeforeSuite
	public void extentreport()
	{
		extent=new ExtentReports(".\\extentreport\\report.html",true);
	}
	
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test=extent.startTest((this.getClass().getSimpleName()+"::"+ method.getName()));
		test.assignAuthor("chandra");
		test.assignCategory("Regression");
	}

	@AfterSuite
	public void savereport()
	{
     extent.flush();
	}
	
	public void lunch()
	{

		System.setProperty(getconfig("chromename"),getconfig("chromepath"));
		driver=new ChromeDriver();
		driver.get(getconfig("build1"));
		
		
		if(Library.IsUrlIsPresent(getconfig("build1")))
		{
			test.log(LogStatus.PASS,"My expurl"+getconfig("build1")+"is matching with my actualurl"	+driver.getCurrentUrl());
			test.log(LogStatus.INFO,"Lunch is successfully" );
			
		}
		
		else
		{
			test.log(LogStatus.FAIL,"My expurl"+getconfig("build1")+"is notmatching with my actualurl"	+driver.getCurrentUrl());
			test.log(LogStatus.INFO,"Lunch is fail getting 404 error" );
			Library.takescreenshort("lunch");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	public void login()
	{
		LoginPage.username_editbox().sendKeys(getconfig("username"));
		LoginPage.password_editbox().sendKeys(getconfig("password"));
		LoginPage.login_click().click();
		if(Library.IsTittlePresent(getconfig("title1")))
		{
			test.log(LogStatus.PASS,"My exptittle"+getconfig("title1")+"is maching with my actualtittle"+driver.getTitle());
			test.log(LogStatus.INFO,"login is done");
		}
		else
		{
			test.log(LogStatus.FAIL,"My exptittle"+getconfig("title1")+"is not maching with my actualtittle"+driver.getTitle());
			test.log(LogStatus.INFO,"login is fail");
			Library.takescreenshort("login");
		}
	}


	public void branches()
	{
		Branches.branches_click().click();

		Generic.DropDown_Handle(Branches.country_select(),getconfig("data"));
		Generic.DropDown_Handle(Branches.state_select(),getconfig("state1"));
		Generic.DropDown_Handle(Branches.city_select(),getconfig("city"));
		Branches.search_click().click();
		
		if(Library.IsTittlePresent(getconfig("title2")))
		{
			test.log(LogStatus.PASS,"My exptittle"+getconfig("title2")+"is maching with my actualtittle"+driver.getTitle());
			test.log(LogStatus.INFO,"login is done");
		}
		else
		{
			test.log(LogStatus.PASS,"My exptittle"+getconfig("title2")+"is not maching with my actualtittle"+driver.getTitle());
			test.log(LogStatus.INFO,"login is fail");
			Library.takescreenshort("branches");
		}

		
		//Branches.clear_click().click();



	}
	public void newBranch(String bname, String address1, String address2, String address3,
			String area, String zipcode, String country, String state, String city)
	{
		NewBranch_details.newBranch_click().click();

		NewBranch_details.branchName_editbox().sendKeys(bname);
		NewBranch_details.adress1_editbox().sendKeys(address1);
		NewBranch_details.adress2_editbox().sendKeys(address2);
		NewBranch_details.adress3_editbox().sendKeys(address3);
		NewBranch_details.area_editbox().sendKeys(area);
		NewBranch_details.zipCode_editbox().sendKeys(zipcode);

		Generic.DropDown_Handle(NewBranch_details.country1_editbox(),country);
		Generic.DropDown_Handle(NewBranch_details.state1_editbox(),state);
		Generic.DropDown_Handle(NewBranch_details.city1_editbox(),city);

		NewBranch_details.submit_click().click();
		//NewBranch_details.reset_click().click();
		//NewBranch_details.cancel_click().click();
		
		
		/*if(Library.IsAlertsPresent(getconfig("alert1")))
		{
			test.log(LogStatus.PASS,"My expalert"+getconfig("alert1")+"is maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new branches is done");
		}
		else
		{
			test.log(LogStatus.FAIL,"My exptittle"+getconfig("alert1")+"is not maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new branches is fail");
			Library.takescreenshort("newBranch");
		}
		
		Generic.Pop_Up_Handle();*/

	}

	public void role()
	{
		Admin_Role_details.roles_click().click();

	}
	
	

	public void newRole(String roleName,String roleDesc,String roleType )
	{
		New_Role_details.newRole_click().click();

		New_Role_details.roleName_editbox().sendKeys(roleName);
		New_Role_details.roleDesc_editbox().sendKeys(roleDesc);
		Generic.DropDown_Handle(New_Role_details.roleType_editbox(), roleType);

		New_Role_details.submit1_click().click();
		
		/*if(Library.IsAlertsPresent(getconfig("alert2")))
		{
			test.log(LogStatus.PASS,"My expalert"+getconfig("alert2")+"is maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new role is done");
		}
		else
		{
			test.log(LogStatus.FAIL,"My exptittle"+getconfig("alert2")+"is not maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new role is fail");
			Library.takescreenshort("newRole");
		}
		
		Generic.Pop_Up_Handle();
		New_Role_details.cancel1_click().click();
*/
	}


	public void user()
	{
		User_Details.users_click().click();

		Generic.DropDown_Handle(User_Details.branch_editbox(),getconfig("branch"));
		Generic.DropDown_Handle(User_Details.roles1_editbox(),getconfig("roles1"));

		User_Details.search1_click().click();
		User_Details.clear1_click().click();

	}


	public void newUser()
	{
		Admin_User_Creation.newUser_click().click();

		Generic.DropDown_Handle(Admin_User_Creation.role_editbox(),getconfig("role"));
		Generic.DropDown_Handle(Admin_User_Creation.branch_editbox(),getconfig("branch"));
		Generic.DropDown_Handle(Admin_User_Creation.costomerId_editbox(),getconfig("costomerId"));

		Admin_User_Creation.costomerName_editbox().sendKeys(getconfig("costomerName"));
		Admin_User_Creation.userName_editbox().sendKeys(getconfig("userName1"));
		Admin_User_Creation.loginPassword_editbox().sendKeys(getconfig("loginPassword"));

		Admin_User_Creation.submit2_click().click();
		//Admin_User_Creation.reset2_click().click();
		//Admin_User_Creation.cancel2_click().click();

	}

	public void employee()
	{
		Admin_emp_Details.employee_click().click();
	}


	public void newEmployee(String employeeName,String loginPassword,String role,String branch )
	{
		New_Emp_details.newEmployee_click().click();

		New_Emp_details.employee_editbox().sendKeys(employeeName);
		New_Emp_details.loginPassword_editbox().sendKeys(loginPassword);
		Generic.DropDown_Handle(New_Emp_details.role3_editbox(),role);
		Generic.DropDown_Handle(New_Emp_details.branch3_editbox(),branch);

		New_Emp_details.submit3_click().click();
		
		/*if(Library.IsAlertsPresent(getconfig("alert3")))
		{
			test.log(LogStatus.PASS,"My expalert"+getconfig("alert3")+"is maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new employee is done");
		}
		else
		{
			test.log(LogStatus.FAIL,"My exptittle"+getconfig("alert3")+"is not maching with my actualtittle"+driver.switchTo().alert().getText());
			test.log(LogStatus.INFO,"new employee is fail");
			Library.takescreenshort("newEmployee");
		}
		
		Generic.Pop_Up_Handle();
		//New_Emp_details.reset3_click().click();
		//New_Emp_details.cancel3_click().click();
*/	}
	public void table_handle()
	{
		Branches.branches_click().click();
		Table_Handle.table("edit");
	}
}
