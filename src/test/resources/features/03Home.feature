@test
Feature: Home page

  Scenario Outline: click on febrile infant
    Given I should be on home page with title"<appBarTitle>"
    And I click on Febrile Infant
    Then I should be on febrile infant page with title"<tab>"
    Examples:
      | appBarTitle | tab |
      | PedsGuide | Febrile Infant |