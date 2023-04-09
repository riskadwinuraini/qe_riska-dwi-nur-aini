Feature: User be able to login
  As user
  I want to see home page
  So that I can buy product

  Scenario: As user, I have be able to success login
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click enter button
    Then I am on the home page

    Scenario: As user, I can't login successfully
      Given I am on the login page
      When I input invalid email
      And I input valid password
      And I click enter button
      Then I can see error message

      Scenario: As user, I can't login successfully
        Given I am on the login page
        When I input valid email
        And I input invalid password
        And I click enter button
        Then I can see error message