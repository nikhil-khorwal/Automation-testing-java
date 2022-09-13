Feature: 8 - 21 Days Navigation Dialog feature
    Scenario Outline: Open 8 - 21 Days page
      Given I should be on febrile infant page with title"<febrileInfant>"
      When I click on 8 - 21 Days button
      Then I should on Page Disclaimer with "<disclaimer>" title
      Examples:
      |febrileInfant| disclaimer |
      | Febrile Infant  | Disclaimer |

  Scenario Outline: click on Disclaimer tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disclaimer tab
    Then I should on Page Disclaimer with "<disclaimer>" title
    Examples:
      | disclaimer  |dialogTitle|
      | Disclaimer  |Febrile 8-21 Pathway|

    Scenario Outline: click on Diagnostic Tests tab
      Given I should on Page Disclaimer with "<disclaimer>" title
      When I click on Infant appears ill menu icon
      And I see dialog with title "<dialogTitle>"
      When I click on Diagnostic Tests tab
      Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
      When I click back
      Then I should see page with "<disclaimer>" title
      Examples:
        | disclaimer | diagnosticTests |dialogTitle|
        | Disclaimer | Diagnostic Tests |Febrile 8-21 Pathway|

  Scenario Outline: click on HSV Risk Assessment tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on HSV Risk Assessment tab
    Then I should on Page HSV Checklist and Assessment with "<HSVRiskAssessment>" title
    When I click back
    Then I should see page with "<disclaimer>" title
    Examples:
      |  HSVRiskAssessment |dialogTitle| disclaimer|
      |  HSV Checklist |Febrile 8-21 Pathway|Disclaimer |

  Scenario Outline: click on High-Risk Recommendations tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on High-Risk Recommendations tab
    Then I should on Page High Risk Recommendations with "<highRiskRecommendations>" title
    When I click back
    Then I should see page with "<disclaimer>" title
    Examples:
      |  highRiskRecommendations |dialogTitle|disclaimer|
      |  High Risk Recommendations |Febrile 8-21 Pathway|Disclaimer|

  Scenario Outline: click on Urinalysis Questions tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Urinalysis Questions tab
    Then I should on Page Urinalysis Questions with "<urinalysisQuestions>" title
    When I click back
    Then I should see page with "<disclaimer>" title
    Examples:
      | urinalysisQuestions |dialogTitle|disclaimer|
      | Urinalysis Questions |Febrile 8-21 Pathway|Disclaimer|

  Scenario Outline: click on Admission Recommendations tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Admission Recommendations tab
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click back
    Then I should see page with "<disclaimer>" title
    Examples:
      |  admissionRecommendations |dialogTitle|disclaimer|
      |  Admission Recommendations |Febrile 8-21 Pathway|Disclaimer|

  Scenario Outline: click on return to beginning menu tab
    Given I should on Page Disclaimer with "<disclaimer>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on return to beginning tab
    And  I should see page with "<disclaimer>" title
    When I click back
    Then I should go back with page "<febrileInfant>"
    Examples:
      | dialogTitle|febrileInfant| disclaimer |
      | Febrile 8-21 Pathway|  Febrile Infant  | Disclaimer |