package com.launchings;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_skyscanner extends BaseTest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		getUrl();
		driver.get("https://skyscanner.net/");
		getUrl();
		WebElement fromfield = driver.findElement(By.xpath("//input[@name=\"fsc-origin-search\"]"));
		Thread.sleep(5000);
		System.out.println("webelement found " + fromfield);
		Thread.sleep(5000);
		fromfield.click();
		Thread.sleep(5000);

		//fromfield.clear();
		//Thread.sleep(15000);

		fromfield.sendKeys("London Heathrow");
		driver.findElement(By.id("fsc-destination-search")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@aria-label=\"Search flights\"]")).submit();

		
		
		// fromfield.source();

	}

	private static void getUrl() {
		String k = driver.getCurrentUrl();
		System.out.println("currenturl of driver is " + k);
		
	}
	public static void source()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the source place : ");
		String sourceplace = sc.next();
		System.out.println(" the source place is : " + sourceplace);

	}

}
