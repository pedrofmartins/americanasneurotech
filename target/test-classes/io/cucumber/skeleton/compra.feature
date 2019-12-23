#Author: pedrofalcao@outlook.com
#language: en

Feature: Purchase
  As a visitor of the ecommerce website
  I want to choose one product
  So that I can see the products and costs of what I want to purchase 

  
  Scenario Outline: Select one product to buy
    Given I have a list of products
    When I search one "<product>"
    And I click to search
    Then user enters "<cep>"
    And I click to submit
    Then Check the basket
    
Examples: 

|product|cep     |
|    ps4|54430250|