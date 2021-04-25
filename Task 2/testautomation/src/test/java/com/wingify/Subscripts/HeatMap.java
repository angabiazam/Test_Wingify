package com.wingify.Subscripts;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wingify.pageObjects.ObjectRepository;
import com.wingify.testBase.BaseClass;
import com.aventstack.extentreports.Status;

public class HeatMap extends BaseClass implements ObjectRepository {
	
	public void heatMapElements() throws InterruptedException
	{
		test.log(Status.INFO,"Test Started");
		if(driver.findElement(By.xpath(ObjectRepository.heatmap_label)).isDisplayed())
		{
			
			test.log(Status.INFO, "HeatMap label is displayed");
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath(ObjectRepository.heatmap_picture)));
			Action action = actions.build();
			action.perform();
			test.log(Status.PASS, "Hovered onto Heatmap link");
			
			String parentwindow = driver.getWindowHandle();
			driver.findElement(By.xpath(ObjectRepository.heatmap_btn)).click();
			test.log(Status.PASS, "Heatmap button clicked");
			
			Set<String> window = driver.getWindowHandles();
			for(String w : window)
			{
				if(!w.equals(parentwindow))
				{
					driver.switchTo().window(w);
				}
			}
			driver.switchTo().frame("heatmap-iframe");
			actions.moveToElement(driver.findElement(By.xpath(ObjectRepository.elementlist_btn)));
			actions.build().perform();
			WebDriverWait wait = new WebDriverWait(driver,7);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(ObjectRepository.elementlist_btn)));
			if(driver.findElement(By.xpath(ObjectRepository.elementlist_btn)).isDisplayed())
			{
				driver.findElement(By.xpath(ObjectRepository.elementlist_btn)).click();
				test.log(Status.PASS, "Element list link is clicked");
					
				
			}
			
			
		}
		else
		{
			test.log(Status.FAIL, "Navigated to the heatmap picture");
		}
	}

}
