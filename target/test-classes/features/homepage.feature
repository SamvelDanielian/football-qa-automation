Feature: Home Page validation

@smoke
Scenario: User opens home page successfully
    Given user opens home page successfully
    Then home page should display Welcome text
