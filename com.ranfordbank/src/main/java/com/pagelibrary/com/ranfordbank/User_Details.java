package com.pagelibrary.com.ranfordbank;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class User_Details extends Base
{
	
	public static WebElement users_click()
	{
		return driver.findElement(getElement("users"));
	}
	
	public static WebElement branch_editbox()
	{
		return driver.findElement(getElement("branch"));
	}
	public static WebElement roles1_editbox()
	{
		return driver.findElement(getElement("roles1"));
	}
	public static WebElement search1_click()
	{
		return driver.findElement(getElement("search1"));
	}
	public static WebElement clear1_click()
	{
		return driver.findElement(getElement("clear1"));
	}


}
