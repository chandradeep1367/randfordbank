package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class LoginPage extends Base {

	public static WebElement username_editbox()
	{
		return driver.findElement(getElement("username"));
	}
	public static WebElement password_editbox()
	{
		return driver.findElement(getElement("password"));
	}
	public static WebElement login_click()
	{
		return driver.findElement(getElement("login"));
	}

}
