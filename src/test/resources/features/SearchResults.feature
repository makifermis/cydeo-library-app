Feature: Library app search feature
  User story:
  As a user, I should be able to login as librarian.

  Background: Assuming user is on the login page
    Given user is on the login page

    Scenario: Verify table column names
      When user enters librarian username "librarian59@library" and password "vN0hXyd0"
      Then Table should have following columns
        | Actions   |
        | User ID   |
        | Full Name |
        | Email     |
        | Group     |
        | Status    |