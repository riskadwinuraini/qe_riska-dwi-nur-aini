Feature: user profiles


  Scenario: Search for User Profiles
    Given the user goes to their profile home page
    When a enters name or keyword in search box
    And a user clicks search
    Then user should get a list of relevant LinkedIn profiles