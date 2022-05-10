Feature: Order Products Test
  As a customer, I want to order products that exist in the website.

  Scenario: Order products successfully
    When user login with username and password
    When customer add products to cart
      | product name        |
      | Sauce Labs Backpack |
    And customer check out the cart
      | firstName | lastName | code  |
      | toronto22 | nigma    | 1000A |
    Then customer is announce that order is completed