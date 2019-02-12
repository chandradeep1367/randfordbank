package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class New_Role_details extends Base
{
	public static WebElement newRole_click()
	{
		return driver.findElement(getElement("newRole"));
	}
	public static WebElement roleName_editbox()
	{
		return driver.findElement(getElement("roleName"));
	}
	public static WebElement roleDesc_editbox()
	{
		return driver.findElement(getElement("roleDesc"));
	}
	public static WebElement roleType_editbox()
	{
		return driver.findElement(getElement("roleType"));
	}
	public static WebElement submit1_click()
	{
		return driver.findElement(getElement("submit1"));
	}
	public static WebElement cancel1_click()
	{
		return driver.findElement(getElement("cancel1"));
	}



}
