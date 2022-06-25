@wip
Feature: Login with different users feature
  User Story:
  As a user, I should be able to login with different users using their
  correct emails and passwords. When I login, I should be able to
  see username in the account username section.

  Background: Assuming user is on the login page
    Given user is on the login page


  Scenario Outline: Verify user information <email>
    When user login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    @student
    Examples:
      | email             | password | name            |
      | student50@library | HTx4f0IS | Test Student 50 |
      | student51@library | Agra1AEw | Test Student 51 |
      | student52@library | b4ryc5KB | Test Student 52 |
      | student53@library | KDgE0lXl | Test Student 53 |
      | student54@library | Pdqui7aS | Test Student 54 |
      | student55@library | GcHGvL9t | Test Student 55 |
      | student56@library | RYCdTHEP | Test Student 56 |
      | student57@library | D05Vyvrk | Test Student 57 |
      | student58@library | wQI5ZO1M | Test Student 58 |
      | student59@library | QgelMCVL | Test Student 59 |
      | student60@library | QsPA9SHj | Test Student 60 |
    @librarians
    Examples:
      | email               | password | name              |
      | librarian1@library  | rs4BNN9G | Test Librarian 1  |
      | librarian2@library  | eb2VQKEj | Test Librarian 2  |
      | librarian3@library  | I6JMMwLb | Test Librarian 3  |
      | librarian4@library  | 7jrGZdaV | Test Librarian 4  |
      | librarian5@library  | 4p4ewVgW | Test Librarian 5  |
      | librarian6@library  | n6Pt4ocG | Test Librarian 6  |
      | librarian7@library  | OEeZbJjV | Test Librarian 7  |
      | librarian8@library  | FE7aFu6s | Test Librarian 8  |
      | librarian9@library  | NEoroTSN | Test Librarian 9  |
      | librarian10@library | Dltvxmpn | Test Librarian 10 |