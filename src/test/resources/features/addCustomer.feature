Feature: Add customer.
  As a customer of globalSqa website , i should be able to create a new account in the system.

  @addCustomer
  Scenario: Add new customer account.
    Given user is on globalsqa homepage website
    And click on bank manager login button
    And  enter valid credential after click on add customer tab link
    When  click on add customer button
    Then Notice that customer added successfully

