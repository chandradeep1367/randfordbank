package utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestBase.Base;

public class Library extends Base 
{
	public static boolean IsUrlIsPresent(String expurl)
	{
		boolean b=driver.getCurrentUrl().contains(expurl);
		return b;
		
	}
	public static boolean IsTittlePresent(String exp)
	{
		boolean b=driver.getTitle().contains(exp);
		return b;
		
	}
	public static boolean IsAlertsPresent(String exp)
	{
		boolean b=driver.switchTo().alert().getText().contains(exp);
		return b;
		
	}
	

	public static void takescreenshort(String screenshortname)
	{
		try
		{
			Robot r=new Robot();
			BufferedImage bi = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(bi,"png",new File(".\\screenshots\\"+screenshortname+".png"));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		

	
	
	}

}
