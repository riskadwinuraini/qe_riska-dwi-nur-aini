Feature: Message

  Scenario: Sending Messages to Other Users
    Given a user goes to their profile home page
    When a user opens another user's profile
    And a user clicks the Send Message button and enter a message
    Then a user should be able to send messages to that other user