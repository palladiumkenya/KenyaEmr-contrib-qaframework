Feature: Forgot Password

  Background:
    Given a user goes to the login page

  @password
  Scenario Outline:
  When a user clicks on forgot passwordlink
  Then user click on cancel button