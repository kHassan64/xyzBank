Feature: Deposit.
  As a customer of globalSqa website , i should be able to deposit amount of money after i logged in successfully.

  @Deposit
  Scenario: Deposit
    Given user is on globalsqa homepage website
    And click on customer login button
    When  select valid username and click on login button
    And click on deposit dropDown button
    And enter a nonNegative amount in amount input field
    When click on deposit button
    Then Observe that amount deposited successfully