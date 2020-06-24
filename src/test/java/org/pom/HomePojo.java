package org.pom;

import org.base.BaseAmazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends BaseAmazon{
	HomePojo home;
	public HomePojo() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath ="//input[@id= 'twotabsearchtextbox']")
private WebElement searchbox;

public WebElement getSearchbox() {
	return searchbox;
}


}
