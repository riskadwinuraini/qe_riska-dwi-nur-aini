Feature: user

  Scenario: GET As an admin I can add and edit user
    Given I set the GET api endpoint for the user
    When I send HTTP api GET request for user
    Then I receive a valid HTTP response code 200 for Get All data users
    And I receive valid data for all users

    Scenario: POST As admin I have be able to create new user
      Given I set the POST api endpoints
      When I send HTTP api POST request for user
      Then I receive a valid HTTP response code 200 on the user POST
      And I receive valid data for new user

      Scenario: DELETE As admin I have be able to delete
        Given I set the DELETE api endpoints
        When I send HTTP api DELETE request for user
        Then I receive valid HTTP response code 200 for user DELETE
