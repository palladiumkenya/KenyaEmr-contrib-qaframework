Feature: User Login

  Background:
    Given User visits login page

  @login
  Scenario Outline: Failing or Succeeding to Login
    When User enters "<username>" username
    And User enters "<password>" password
    And User Logs in
    Then System Evaluates Login "<status>"
    # Then User goes to facility dashboard page
    Examples:
      | username  | password  | status |
      | admin     | Admin123  | true   |

