package com.pagelibrary.com.ranfordbank;


import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Branches extends Base
{
	
	public static WebElement branches_click()
	{
		return driver.findElement(getElement("branches"));
	}
	public static WebElement country_select()
	{
		return driver.findElement(getElement("country"));
	}
	public static WebElement state_select()
	{
		return driver.findElement(getElement("state"));
	}
	public static WebElement city_select()
	{
		return driver.findElement(getElement("city"));
	}
	public static WebElement search_click()
	{
		return driver.findElement(getElement("search"));
	}
	public static WebElement clear_click()
	{
		return driver.findElement(getElement("clear"));
	}
	
}
