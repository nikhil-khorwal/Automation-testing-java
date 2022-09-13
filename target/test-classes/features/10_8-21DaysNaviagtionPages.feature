Feature: 8 - 21 Days Navigation Pages feature
    Scenario Outline: Open 8 - 21 Days page
      Given I should be on febrile infant page with title"<febrileInfant>"
      When I click on 8 - 21 Days button
      Then I should on Page Disclaimer with "<disclaimer>" title
      Examples:
      |febrileInfant| disclaimer |
      | Febrile Infant  | Disclaimer |

    Scenario Outline: Open Diagnostic Tests page
      Given I should on Page Disclaimer with "<disclaimer>" title
      When I click on Diagnostic Tests button
      Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
      Examples:
        | disclaimer | diagnosticTests |
        | Disclaimer | Diagnostic Tests |

    Scenario Outline: Open HSV Checklist and Assessment page
      Given I should on Page Diagnostic Tests with "<diagnosticTests>" title
      When I click on Proceed to HSV Risk Assessment button
      Then I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
      Examples:
        | HSVChecklist | diagnosticTests |
        | HSV Checklist | Diagnostic Tests |

    Scenario Outline: Check for Low risk
      Given I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
      When I click on HSV Low Risk Recommendations button
      Then I should on Page Urinalysis Questions with "<urinalysisQuestionsAppBar>" title
      And I click back
      Examples:
        | HSVChecklist | urinalysisQuestionsAppBar |
        | HSV Checklist | Urinalysis Questions |

    Scenario Outline: Check for high risk
      Given I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
      When I check Maternal history of HSV lesions or fever from 48 hours before delivery to 48 hours after delivery
      And I click on HSV High Risk Recommendations button
      Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
      Examples:
        | HSVChecklist | diagnosticTests |
        | HSV Checklist | Diagnostic Tests |

    Scenario Outline: Open Urinalysis Questions HIGH RISK page
      Given I should on Page Diagnostic Tests with "<diagnosticTests>" title
      When I click on Urinalysis Results Assessment button
      Then I should on Page Urinalysis Questions HIGH RISK with "<urinalysisResultsAssessmentAppBar>" title
      Examples:
        | urinalysisResultsAssessmentAppBar | diagnosticTests |
        | Urinalysis Questions HIGH RISK | Diagnostic Tests |

    Scenario Outline: Check content for yes
      Given I should on Page Urinalysis Questions HIGH RISK with "<urinalysisResultsAssessmentAppBar>" title
      When I click on yes button
      Then I should see content for "<yes>"
      Examples:
        | urinalysisResultsAssessmentAppBar | yes |
        | Urinalysis Questions HIGH RISK | Send bladder cath or suprapubic aspiration for urine culture prior to empiric antibiotic treatment |

    Scenario Outline: Check content for no
      Given I should on Page Urinalysis Questions HIGH RISK with "<urinalysisResultsAssessmentAppBar>" title
      When I click on no button
      Then I should see content for "<no>"
      Examples:
        | urinalysisResultsAssessmentAppBar | no |
        | Urinalysis Questions HIGH RISK | It is not necessary to obtain a urine catheter specimen for ongoing treatment |

    Scenario Outline: Open Admission Recommendations page
      Given I should on Page Urinalysis Questions HIGH RISK with "<urinalysisResultsAssessmentAppBar>" title
      When I click on Proceed to Hospital Admission Recommendations button
      Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
      Examples:
        | urinalysisResultsAssessmentAppBar | admissionRecommendations |
        | Urinalysis Questions HIGH RISK |  Admission Recommendations |

    Scenario Outline: Restart GuideLines
      Given I should on Page Admission Recommendations with "<admissionRecommendations>" title
      When I click on Restart Guideline button
      Then I should be on febrile infant page with title"<febrileInfant>"

      Examples:
        | admissionRecommendations | febrileInfant |
        |  Admission Recommendations | Febrile Infant |