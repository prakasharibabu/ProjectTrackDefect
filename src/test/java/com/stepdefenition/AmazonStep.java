package com.stepdefenition;

import java.io.IOException;

import org.base.BaseAmazon;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pom.CartPojo;
import org.pom.ConformCancelPojo;
import org.pom.HomePojo;
import org.pom.ProductCancelPojo;
import org.pom.ProductResultPojo;
import org.pom.ProductSearchPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AmazonStep extends BaseAmazon {


	@Given("user is on amazon homepage")
	public void user_is_on_amazon_homepage()  {
		getUrl("https://www.amazon.com/");	
	}

	@When("user searching the product")
	public void user_searching_the_product() {
		HomePojo homepage =new HomePojo();
		type(homepage.getSearchbox(), "face mask" +Keys.ENTER);
	}

	@When("user select the product")
	public void user_select_the_product() {
		ProductSearchPojo searchproduct =new ProductSearchPojo();
		searchproduct.getSelectProduct().click();
	}

	@When("user adding the product to cart")
	public void user_adding_the_product_to_cart() {
		ProductResultPojo prdResult =new ProductResultPojo();
		prdResult.getAddCart().click();
	}

	@Then("user is on cart page verify product")
	public void user_is_on_cart_page_verify_product() throws IOException {
		CartPojo cart= new CartPojo();
		Assert.assertEquals("Product not added", "Added to Cart", cart.getCartText().getText());
		cart.getCartBtn().click();
		takescreenshot("E:\\Amazon\\screenshot\\productincart.jpg");
	}

	@Given("user succesfully naviagte to amazon homepage")
	public void user_succesfully_naviagte_to_amazon_homepage() {
		getUrl("https://www.amazon.com/");	
	}

	@When("user searching  product")
	public void user_searching_product() {
		HomePojo homepage =new HomePojo();
		type(homepage.getSearchbox(), "face mask" +Keys.ENTER);
	}

	@When("user selecting  product")
	public void user_selecting_product() {
		ProductSearchPojo searchproduct =new ProductSearchPojo();
		searchproduct.getSelectProduct().click();
	}

	@When("user adding  product to cart")
	public void user_adding_product_to_cart() {
		ProductResultPojo prdResult =new ProductResultPojo();
		prdResult.getAddCart().click();
	}

	@When("user navigate to cart page verify product")
	public void user_navigate_to_cart_page_verify_product() throws IOException {
		CartPojo cart= new CartPojo();
		cart.getCartBtn().click();
		takescreenshot("E:\\Amazon\\screenshot\\beforecancelproduct.jpg");
	}

	@When("user should press delete button")
	public void user_should_press_delete_button() throws IOException {
		ProductCancelPojo prdcancel =new ProductCancelPojo();
		prdcancel.getDeleteBtn().click();
		takescreenshot("E:\\Amazon\\screenshot\\aftercancelproduct.jpg");
	}

	@Then("user verify product deleted from cart")
	public void user_verify_product_deleted_from_cart() throws IOException {
		ConformCancelPojo cancelConform =new ConformCancelPojo();
		Assert.assertEquals("Cart is not empty", "Your Amazon Cart is empty", cancelConform.getEmptyText().getText());
	}

}
