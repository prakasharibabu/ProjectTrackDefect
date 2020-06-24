package com.hook;

import org.base.BaseAmazon;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AmazonHook extends BaseAmazon {
	@Before
	public void lanch() {
		getDriver();
		maximize();
		waitimplict();
	}
	
	@After
	public void browserClose() {
		driver.close();

	}

}
