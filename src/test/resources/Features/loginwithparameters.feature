Feature: login with parameters
  Background:
    Given User should be navigated to the Login page

#  Scenario: Successful login with valid credentials
##    Given User should be navigated to the Login page
#    When Login with valid username "Admin" & valid password "admin123"
#    Then Successful login
#
#  Scenario: user should not be able login with invalid credentials
#    When Login with invalid username "admin" & invalid password "Admin321"
#    Then Unsuccessful login
@sanity
    Scenario Outline: User is able to login with  multiple credentials
      When entered <username> and <password>
      Then Successful or unsuccessful login
      And browser should be closed
      Examples:
        | username | password |  |
        | Admin    | admin123 |  |
        | admin1   | Admin321 |  |
        | user     | user123  |  |


