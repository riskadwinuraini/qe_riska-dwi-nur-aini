Feature: login sepulsa

  Scenario: As user, I have be able to success login
    Given I am on the login page
    When I click enter button
    And I input valid Email
    And I input valid password
    And I click login button
    Then I am on the home page


    Scenario: As user, I can't login successfully
      Given I am on the login page
      When I click enter button
      And I input invalid email
      And I input invalid password
      And I click login button
      Then I can see error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."



#      Scenario: As user, I can't login successfully
#        Given I am on the login page
#        When I input valid email
#        And I input invalid password
#        And I click enter button
#        Then I can see error message