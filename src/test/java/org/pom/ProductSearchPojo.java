package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPojo extends BaseAmazon {
	public ProductSearchPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	private WebElement selectProduct;

	public WebElement getSelectProduct() {
		return selectProduct;
	}
	
}
