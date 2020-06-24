
Feature: verify amazon product

  Scenario: verify user can add product to cart
    Given user is on amazon homepage
    When user searching the product
    And user select the product
    And user adding the product to cart
    Then user is on cart page verify product 
    

  Scenario: verify user can remove product from cart
    Given user succesfully naviagte to amazon homepage
    When user searching  product
    And user selecting  product
    And user adding  product to cart
    And user navigate to cart page verify product 
    And user should press delete button
    Then user verify product deleted from cart 
    