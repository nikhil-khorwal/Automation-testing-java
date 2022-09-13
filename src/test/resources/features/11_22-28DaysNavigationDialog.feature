Feature: 22 - 28 Days Navigation Dialog feature
  Scenario Outline: Open 22 - 28 Days page
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on 22 - 28 Days button
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |febrileInfant| evaluationForInfants |
      | Febrile Infant  | Evaluation for Infants 22-28 Days Old |

  Scenario Outline: click on Disclaimer tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disclaimer tab
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
    |evaluationForInfants | dialogTitle |
    | Evaluation for Infants 22-28 Days Old | Febrile 22-28 Pathway |

  Scenario Outline: click on Diagnostic Tests tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Diagnostic Tests tab
    Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      | evaluationForInfants | dialogTitle |diagnosticTests |
      | Evaluation for Infants 22-28 Days Old | Febrile 22-28 Pathway |Diagnostic Tests |

  Scenario Outline: click on HSV Risk Assessment tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on HSV Risk Assessment tab
    Then I should on Page HSV Checklist and Assessment with "<HSVRiskAssessment>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  HSVRiskAssessment |dialogTitle| evaluationForInfants|
      |  HSV Checklist |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old |

  Scenario Outline: click on High Risk Admission Recommendations tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on High Risk Admission Recommendations tab
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  admissionRecommendations |dialogTitle|evaluationForInfants|
      |  Full Sepsis Evaluation and Admission Recommendations |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old |

  Scenario Outline: click on Low Risk Recommendations tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Low Risk Recommendations tab
    Then I should on Page HSV Low Risk Recommendations with "<lowRiskRecommendations>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  lowRiskRecommendations |dialogTitle|evaluationForInfants|
      |  HSV Low Risk Recommendations |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on Bacterial Infection Assessment tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Bacterial Infection Assessment tab
    Then I should on Page Bacterial Infection Assessment with "<bacterialInfectionAssessment>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      | bacterialInfectionAssessment |dialogTitle|evaluationForInfants|
      | Bacterial Infection Assessment |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on High Risk Recommendations tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on High Risk Recommendations tab
    Then I should on Page High Risk Recommendations with "<highRiskRecommendations>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  highRiskRecommendations |dialogTitle|evaluationForInfants|
      |  High Risk Recommendations |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on Disposition Recommendations (High Risk Bacterial) tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disposition Recommendations High Risk Bacterial tab
    Then I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  dispositionRecommendations |dialogTitle|evaluationForInfants|
      |  Disposition Recommendations |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on Disposition Recommendations (Low Risk Bacterial) tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disposition Recommendations Low Risk Bacterial tab
    Then I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  dispositionRecommendations |dialogTitle|evaluationForInfants|
      |  Disposition Recommendations |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on Discharge Checklist tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Discharge Checklist tab
    Then I should on Page Discharge Checklist "<dischargeChecklist>" title
    When I click back
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    Examples:
      |  dischargeChecklist |dialogTitle|evaluationForInfants|
      |  Discharge Checklist |Febrile 22-28 Pathway|Evaluation for Infants 22-28 Days Old|

  Scenario Outline: click on return to beginning menu tab
    Given I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on return to beginning tab
    Then I should on Page Evaluation for Infants 22-28 Days Old with "<evaluationForInfants>" title
    When I click back
    Then I should go back with page "<febrileInfant>"
    Examples:
      | dialogTitle|febrileInfant|evaluationForInfants|
      | Febrile 22-28 Pathway|  Febrile Infant  |Evaluation for Infants 22-28 Days Old|