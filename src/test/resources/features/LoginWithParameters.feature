Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: librarian, student

  Background: Assuming user is on the login page
    Given user is on the login page

  Scenario: Login as librarian
    When user enters librarian username "librarian8@library"
    And user enters librarian password "FE7aFu6s"
    Then user should see the dashboard

  Scenario: Login as student
    When user enters student username "student8@library"
    And user enters student password "UFAgfoZK"
    Then user should see the dashboard

  Scenario: Login as librarian in the same line
    When user enters librarian username "librarian59@library" and password "vN0hXyd0"
    Then user should see the dashboard