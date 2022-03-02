package com.launchings;

import org.openqa.selenium.By;

public class TC003_chrome_sp extends BaseTest {

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("firefoxbrowser");
		navigateUrl("serviceportallab2");
		launchserviceportal();

	}

	public static void launchserviceportal() 
	{
		driver.findElement(By.id("advancedButton")).click();
		driver.findElement(By.id("exceptionDialogButton")).click();
		driver.findElement(By.name("username")).sendKeys("ashaikh");
		driver.findElement(By.name("password")).sendKeys("changeme");
		driver.findElement(By.name("login")).click();

		
	}

}
