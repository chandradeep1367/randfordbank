package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Admin_emp_Details extends Base
{
	public static WebElement employee_click()
	{
		return driver.findElement(getElement("employee"));
	}
	
}
