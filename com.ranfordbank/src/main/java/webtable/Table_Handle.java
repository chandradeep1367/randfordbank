package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Table_Handle extends Base
{
	static boolean status=false;

	public static void table(String operation)
	{
		boolean flag=false;
		WebElement table=driver.findElement(By.id("DG_bankdetails"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");

		for(int i=1;i<pagelinks.length;i++)
		{
			try
			{
				if(pagelinks[i].contains("...")&&status==true)
				{
					driver.findElement(By.xpath("//a[text()='...'][2]")).click();
				}
				else
				{
					table.findElement(By.linkText(pagelinks[i])).click();
				}

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			if(pagelinks[i].contains("..."))
			{
				status=true;
				table(operation);
			}
			table=driver.findElement(By.id("DG_bankdetails"));
			rows=table.findElements(By.tagName("tr"));
			for(WebElement r:rows)
			{
				List<WebElement> columns=r.findElements(By.tagName("td"));
				for(WebElement c:columns)
				{
					if(c.getText().matches("47"))
					{
						if(operation.equalsIgnoreCase("edit"))
						{
							columns.get(columns.size()-2).findElement(By.tagName("a")).click();
						}
						else if (operation.equalsIgnoreCase("delete"))
						{
							columns.get(columns.size()-1).findElement(By.tagName("a")).click();
						}
						else
						{
							System.out.println("operation is fail");
						}
						flag = true;
						break;
					}
				}
				if(flag==true)
				{
					break;
				}
			}
			if(flag==true)
			{
				break;
			}

		}
	}
}
