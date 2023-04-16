Feature: product

  Scenario: GET As an admin I can add and edit products
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I received valid data for all products

    Scenario: PUT As an admin I have be able to update existing products
      Given I set PUT endpoints
      When I send PUT HTTP request
      Then I receive a valid HTTP response code 200 in products
      And I receive valid data for the products

      Scenario: DELETE As an admin I have be able to delete existing products
        Given I set DELETE endpoints
        When I send DELETE HTTP request
        Then I receive a valid HTTP response code 200 in products DELETE

        Scenario: GET As an admin I have be able to get id products
          Given I set GET endpoints by id
          When I send GET HTTP request by id
          Then I receive a valid HTTP response code 200 for Get id data users
          And I received valid data for id products
