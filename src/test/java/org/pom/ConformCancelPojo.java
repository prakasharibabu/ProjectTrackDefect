package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformCancelPojo extends BaseAmazon {
	public ConformCancelPojo() {
		PageFactory.initElements(driver, this);
	}

	

@FindBy(xpath= "//div[@class='a-row sc-your-amazon-cart-is-empty']")
private WebElement emptyText;
	

public WebElement getEmptyText() {
		return emptyText;
	}





}
