package com.wingify.TestScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wingify.Subscripts.HeatMap;
import com.wingify.testBase.BaseClass;

public class StartFreeTrial extends BaseClass{
	BaseClass baseClass = new BaseClass();
	HeatMap heatmap = new HeatMap();
	
	@BeforeTest
	public void browserInitialisation()
	{
		
		baseClass.initailiseDriver();
	
	}
	
	@AfterTest
	public void browserTermination()
	{
		baseClass.closeBrowser();

	}
	
	@Test
	public void startfreetrial() throws InterruptedException
	{
		heatmap.heatMapElements();
	}

}
