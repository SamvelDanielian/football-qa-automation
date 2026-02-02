Feature: Navigation validation

@smoke
Scenario: User navigates to News page
  Given user is on the home page
  Then user navigates to News page

@smoke
Scenario: User navigates to Matches page
  Given user is on the home page
  Then user navigates to Matches page

@smoke
Scenario: User navigates to Trainings page
  Given user is on the home page
  Then user navigates to Trainings page

@smoke
Scenario: User navigates to Gavi page
  Given user is on the home page
  Then user navigates to Gavi page

@smoke
Scenario: User navigates to Edits page
  Given user is on the home page
  #Then user navigates to Edits page <- Edits page is not made yet!  