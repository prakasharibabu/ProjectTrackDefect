package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPojo extends BaseAmazon {

	public CartPojo() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartText() {
		return cartText;
	}
	public WebElement getCartBtn() {
		return cartBtn;
	}

	@FindBy(xpath= "//h1[@class='a-size-medium a-text-bold']")
	private WebElement cartText;
	@FindBy(xpath= "//a[@id= 'nav-cart']")
	private WebElement cartBtn;
}
