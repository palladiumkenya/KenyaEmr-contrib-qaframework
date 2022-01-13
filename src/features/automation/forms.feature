Feature: Form management

  Background:
    Given user logs into kenyaemr system and goes to the Home page


  @form
  Scenario Outline: Form management
  And system loads facility dashboard page
  Then User loads home page
  And system load home page
  Then user click on clinician home page
  And the system loads clinician home page
  Then user clicks on first patient
  And user clicks on Tb screening Form
  And user fill in the antenal form
  Then user click on enter button

