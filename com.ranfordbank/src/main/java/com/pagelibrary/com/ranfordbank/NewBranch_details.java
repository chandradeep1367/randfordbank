package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranch_details extends Base
{
	public static WebElement newBranch_click()
	{
		return driver.findElement(getElement("newBranch"));
	}
	public static WebElement branchName_editbox()
	{
		return driver.findElement(getElement("branchName"));
	}
	public static WebElement adress1_editbox()
	{
		return driver.findElement(getElement("adress1"));
	}
	public static WebElement adress2_editbox()
	{
		return driver.findElement(getElement("adress2"));
	}
	public static WebElement adress3_editbox()
	{
		return driver.findElement(getElement("adress3"));
	}
	public static WebElement area_editbox()
	{
		return driver.findElement(getElement("area"));
	}
	public static WebElement zipCode_editbox()
	{
		return driver.findElement(getElement("zipCode"));
	}
	public static WebElement country1_editbox()
	{
		return driver.findElement(getElement("country1"));
	}
	public static WebElement state1_editbox()
	{
		return driver.findElement(getElement("state1"));
	}
	public static WebElement city1_editbox()
	{
		return driver.findElement(getElement("city1"));
	}
	public static WebElement submit_click()
	{
		return driver.findElement(getElement("submit"));
	}
	public static WebElement reset_click()
	{
		return driver.findElement(getElement("reset"));
	}
	public static WebElement cancel_click()
	{
		return driver.findElement(getElement("cancel"));
	}
	
}
