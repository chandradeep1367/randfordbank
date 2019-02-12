package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Admin_Role_details extends Base
{
	public static WebElement roles_click()
	{
		return driver.findElement(getElement("roles"));
	}
	
}
