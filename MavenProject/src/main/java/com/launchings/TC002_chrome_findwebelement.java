package com.launchings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC002_chrome_findwebelement extends BaseTest
{

	public static void main(String[] args) throws Exception {
		
		init();
		launcher("chromebrowser");
		navigateUrl("amazonurl");
		driver.findElement(By.id("sp-cc-accept")).click();
		WebElement searchloc = driver.findElement(By.id("searchDropdownBox"));
		searchloc.sendKeys("Baby");
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("swinging crib sheets");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
