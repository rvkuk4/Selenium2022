package com.launchings;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties p;
	
	
	public static void init() throws Exception
	{
		System.out.println("current project path and data properties path is: ");
		System.out.println(projectpath+"/src/main/resources/data.properties");
		 
		FileInputStream fis = new FileInputStream(projectpath+"/src/main/resources/data.properties");
		p = new Properties();
		p.load(fis);
		//System.out.println(p);
		//String k = p.getProperty("chromebrowser");
		//System.out.println(k);
	}
	
	public static void launcher(String browser)
	{
		//System.out.println(browser);
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//driver = new ChromeDriver();

		}else if(p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(p.getProperty(browser).equals("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		/*else if(p.getProperty(browser).equals("safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}*/
	}
	
	public static void navigateUrl(String url)
	{
		driver.navigate().to(p.getProperty(url));
	}
	
	public static void launchjiraticket(String ticketid) 
	{
		
		driver.findElement(By.id("quickSearchInput")).sendKeys("ticketid");
		//driver.findElement(By.name("username")).sendKeys("ashaikh");
		//driver.findElement(By.name("password")).sendKeys("changeme");
		driver.findElement(By.className("quick-search-spinner")).click();

		
	}
}
