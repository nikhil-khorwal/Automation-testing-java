Feature: 0 - 7 Days Navigation Pages feature

  Scenario Outline: check Infant appears ill with all pages
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on "<infantAppearsIll>" button
    And I should see page with "<disclaimers>" title
    And I click on "<diagnosticTests>" button
    And I should see page with "<diagnosticTests>" title
    And I click on "<antibioticOptions>" button
    And I should see page with "<antibioticOptions>" title
    And I click on "<restartGuideline>" button
    Then I should go back with page "<febrileInfant>"
    Examples:
      | febrileInfant | infantAppearsIll | disclaimers | diagnosticTests | antibioticOptions | restartGuideline |
      | Febrile Infant | 0 - 7 Days | Disclaimer | Diagnostic Tests | Antibiotic Options after Admission | Restart Guideline |
