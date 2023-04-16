Feature: cart

  Scenario: GET As an admin I can add and edit cart
    Given I set the GET api endpoint
    When I send HTTP api GET request
    Then I receive a valid HTTP response code 200 for GET All data cart
    And I receive valid data for all carts

    Scenario: PUT As an admin I have be able to update existing cart
      Given I set the PUT api endpoints in cart
      When I send HTTP api PUT request
      Then I receive valid HTTP response code 200 in carts
      And I receive valid data for the carts

      Scenario: DELETE As an admin I have be able to delete existing carts
        Given I set the DELETE api endpoints in cart
        When I send HTTP api DELETE request
        Then I receive valid HTTP response code 200 in carts DELETE

        Scenario: GET As an admin I have be able to get id carts
          Given I set the GET api endpoint by id
          When I send HTTP api GET request by id
          Then I receive a valid HTTP response code 200 for Get id data carts
          And I receive valid data for id carts
