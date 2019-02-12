package com.pagelibrary.com.ranfordbank;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Admin_User_Creation extends Base
{
	
	public static WebElement newUser_click()
	{
		return driver.findElement(getElement("newUser"));
	}
	public static WebElement role_editbox()
	{
		return driver.findElement(getElement("role"));
	}
	public static WebElement branch_editbox()
	{
		return driver.findElement(getElement("branch"));
	}
	public static WebElement costomerId_editbox()
	{
		return driver.findElement(getElement("costomerId"));
	}
	public static WebElement costomerName_editbox()
	{
		return driver.findElement(getElement("costomerName"));
	}
	
	public static WebElement userName_editbox()
	{
		return driver.findElement(getElement("userName1"));
	}
	public static WebElement loginPassword_editbox()
	{
		return driver.findElement(getElement("loginPassword"));
	}
	public static WebElement submit2_click()
	{
		return driver.findElement(getElement("submit2"));
	}
	public static WebElement reset2_click()
	{
		return driver.findElement(getElement("reset2"));
	}
	public static WebElement cancel2_click()
	{
		return driver.findElement(getElement("cancel2"));
	}

}
