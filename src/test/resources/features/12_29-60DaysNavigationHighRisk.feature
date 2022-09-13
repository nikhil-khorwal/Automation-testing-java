@test
Feature: 29 - 60 Days Navigation High Risk
  Scenario Outline: Open 29 - 60 Days page
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on 29 - 60 Days button
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |febrileInfant| urinaryTractInfection |
      | Febrile Infant  | Urinary Tract Infection |

  Scenario Outline: Open Diagnostic Tests page
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Diagnostic Tests button
    Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
    Examples:
    |urinaryTractInfection | diagnosticTests |
    | Urinary Tract Infection | Diagnostic Tests |

  Scenario Outline: Open HSV Checklist and Assessment page
    Given I should on Page Diagnostic Tests with "<diagnosticTests>" title
    When I click on Proceed to HSV Risk Assessment button
    Then I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
    Examples:
      | HSVChecklist | diagnosticTests |
      | HSV Checklist | Diagnostic Tests |

  Scenario Outline: Open High Risk HSV Recommendations page
    Given I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
    When I check Maternal history of HSV lesions or fever from 48 hours before delivery to 48 hours after delivery
    And I click on HSV High Risk Recommendations button
    Then I should on Page High Risk HSV Recommendations with "<highRiskHSVRecommendations>" title
    Examples:
      | HSVChecklist | highRiskHSVRecommendations |
      | HSV Checklist | High Risk HSV Recommendations|

  Scenario Outline: Open Admission Recommendations page
    Given I should on Page High Risk HSV Recommendations with "<highRiskHSVRecommendations>" title
    When I click on Proceed to Hospital Admission Recommendations button
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    Examples:
      | admissionRecommendations |highRiskHSVRecommendations |
      |  Admission Recommendations |High Risk HSV Recommendations|

  Scenario Outline: Restart GuideLines
    Given I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click on Restart Guideline button
    Then I should be on febrile infant page with title"<febrileInfant>"

    Examples:
      | admissionRecommendations | febrileInfant |
      |  Admission Recommendations | Febrile Infant |
