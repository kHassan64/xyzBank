Feature: Login .
  As a customer of globalSqa website ,i should be able to login successfully.

  @Login
  Scenario: Login.
    Given user is on globalsqa homepage website
    And click on customer login button
    When  select valid username and click on login button
    Then verify that customer logged in successfully