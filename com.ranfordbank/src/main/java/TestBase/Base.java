package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	public class Base {
		static Properties p;
		public static WebDriver driver;
		public static void loadproperty()
		{
			
				try {
					File f=new File(".\\src\\main\\java\\configration\\OR.properties");
					FileReader fr=new FileReader(f);
					p=new Properties();
					p.load(fr);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
		public static void loadpropertyconfig()
		{
			
				try {
					File f=new File(".\\src\\main\\java\\configration\\config.properties");
					FileReader fr=new FileReader(f);
					p=new Properties();
					p.load(fr);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}

		public static String getconfig(String key)
		{   
			loadpropertyconfig();
			String data=p.getProperty(key);
			return data;
			
		}
		
		
		public static By getElement(String key)
		{
			loadproperty();
			By loc=null;
			String value=p.getProperty(key);
			
			String loctype=value.split(":")[0];
			String locval=value.split(":")[1];
			switch(loctype)
			{
			case "id":
				loc=By.id(locval);
				break;
			case "name":
				loc=By.name(locval);
				break;
			case "xpath":
				loc=By.xpath(locval);
				break;
			}
			return loc;
			
			
			
				
		}
	}

