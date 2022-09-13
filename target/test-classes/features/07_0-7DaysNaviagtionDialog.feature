Feature: 0 - 7 Days Navigation Dialog feature
  Scenario Outline: click on Disclaimer menu tab
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on "<infantAppearsIll>" button
    And I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disclaimers tab
    Then  I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle | febrileInfant | infantAppearsIll | disclaimers |
      | Febrile 0-7 Pathway | Febrile Infant | 0 - 7 Days | Disclaimer |

  Scenario Outline: click on Diagnostic Tests menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Diagnostic Tests tab
    Then I should see page with "<diagnosticTests>" title
    When I click back
    Then I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle | disclaimers |diagnosticTests|
      | Febrile 0-7 Pathway | Disclaimer | Diagnostic Tests |


  Scenario Outline: click on Antibiotic Options after Admission menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Antibiotic Options after Admission tab
    Then I should see page with "<antibioticOptions>" title
    When I click back
    Then I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle |disclaimers| antibioticOptions |
      | Febrile 0-7 Pathway  | Disclaimer | Antibiotic Options after Admission |

  Scenario Outline: click on return to beginning menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on return to beginning tab
    And  I should see page with "<disclaimers>" title
    When I click back
    Then I should go back with page "<febrileInfant>"
    Examples:
      | dialogTitle | febrileInfant |  disclaimers |
      | Febrile 0-7 Pathway | Febrile Infant | Disclaimer |

