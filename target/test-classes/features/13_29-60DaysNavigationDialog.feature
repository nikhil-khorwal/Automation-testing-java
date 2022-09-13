@test
Feature: 29 - 60 Days Navigation Dialog feature
  Scenario Outline: Open 29 - 60 Days page
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on 29 - 60 Days button
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |febrileInfant| urinaryTractInfection |
      | Febrile Infant  | Urinary Tract Infection |

  Scenario Outline: click on Disclaimer tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disclaimer tab
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      | urinaryTractInfection | dialogTitle |
      | Urinary Tract Infection | Febrile 29-60 Days Pathway |

  Scenario Outline: click on Diagnostic Tests tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Diagnostic Tests tab
    Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      | urinaryTractInfection | dialogTitle |diagnosticTests |
      | Urinary Tract Infection | Febrile 29-60 Days Pathway |Diagnostic Tests |

  Scenario Outline: click on HSV Risk Assessment tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on HSV Risk Assessment tab
    Then I should on Page HSV Checklist and Assessment with "<HSVRiskAssessment>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |  HSVRiskAssessment |dialogTitle| urinaryTractInfection|
      |  HSV Checklist |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on High Risk Recommendations tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on High Risk Recommendations tab
    Then I should on Page High Risk HSV Recommendations with "<highRiskRecommendations>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |  highRiskRecommendations |dialogTitle|urinaryTractInfection|
      |  High Risk HSV Recommendations |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on High Risk Admission Recommendations tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on High Risk Admission Recommendations tab
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |  admissionRecommendations |dialogTitle|urinaryTractInfection|
      |  Admission Recommendations |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on Bacterial Infection Risk Assessment tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Bacterial Infection Risk Assessment tab
    Then I should on Page Bacterial Infection Assessment with "<bacterialInfectionAssessment>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      | bacterialInfectionAssessment |dialogTitle|urinaryTractInfection|
      | Bacterial Infection Assessment |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on Urinalysis Questions tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Urinalysis Questions tab
    Then I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |  dispositionRecommendations |dialogTitle|urinaryTractInfection|
      |  Disposition Recommendations |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on Discharge Checklist tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Discharge Checklist tab
    Then I should on Page Discharge Checklist "<dischargeChecklist>" title
    When I click back
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |  dischargeChecklist |dialogTitle|urinaryTractInfection|
      |  Discharge Checklist |Febrile 29-60 Days Pathway|Urinary Tract Infection |

  Scenario Outline: click on return to beginning menu tab
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on return to beginning tab
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click back
    Then I should go back with page "<febrileInfant>"
    Examples:
      | dialogTitle | febrileInfant | urinaryTractInfection |
      | Febrile 29-60 Days Pathway |  Febrile Infant  |Urinary Tract Infection |