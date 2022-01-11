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
  And system loads clinicalView patient page
  And user clicks on Tb screening Form
 # Then enter tb screening diagnosis
  Then user click on enter button
  And user clicks on completed visit form
  Then user clicks on delete form button

