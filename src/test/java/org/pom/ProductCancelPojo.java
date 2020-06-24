package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCancelPojo extends BaseAmazon {
	public ProductCancelPojo() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath= "//input[@value='Delete']")
private WebElement deleteBtn;



public WebElement getDeleteBtn() {
	return deleteBtn;

}
}
