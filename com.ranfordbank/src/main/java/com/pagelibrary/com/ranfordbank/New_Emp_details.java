package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class New_Emp_details extends Base
{
	public static WebElement newEmployee_click()
	{
		return driver.findElement(getElement("newEmployee"));
	}
	public static WebElement employee_editbox()
	{
		return driver.findElement(getElement("employeeName"));
	}
	public static WebElement loginPassword_editbox()
	{
		return driver.findElement(getElement("loginPassword"));
	}
	public static WebElement role3_editbox()
	{
		return driver.findElement(getElement("role3"));
	}
	public static WebElement branch3_editbox()
	{
		return driver.findElement(getElement("branch3"));
	}
	public static WebElement submit3_click()
	{
		return driver.findElement(getElement("submit3"));
	}
	public static WebElement reset3_click()
	{
		return driver.findElement(getElement("reset3"));
	}
	public static WebElement cancel3_click()
	{
		return driver.findElement(getElement("cancel3"));
	}



}
