package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultPojo extends BaseAmazon {
	public ProductResultPojo() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddCart() {
		return addCart;
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement addCart;
	
	
}
