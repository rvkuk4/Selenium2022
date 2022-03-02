package com.launchings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC004_wiki extends BaseTest {

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("firefoxbrowser");
		navigateUrl("wikiurl");
		launchwikipage();

	}

	public static void launchwikipage() 
	{
		//driver.findElement(By.name("Portal:The arts")).click();
		driver.findElement(By.id("searchInput")).sendKeys("history");
		//driver.findElement(By.name("username")).sendKeys("ashaikh");
		//driver.findElement(By.name("password")).sendKeys("changeme");
		driver.findElement(By.id("searchButton")).click();

		
	}

}
