package com.wingify.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseClass{
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public void initailiseDriver()
	{
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		test = extent.createTest("WingifyTest", "Assignment for Wingify");

		
		test.info("Test setup initialisation");
		System.setProperty("webdriver.chrome.driver", "/Users/angabiazam/eclipse-workspace/testautomation/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlcmltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsInZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	}
	
	
	public void closeBrowser()
	{
		test.info("Test Completed");
		driver.quit();
		extent.flush();
	}
	


}
