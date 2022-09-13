@test
Feature: Disclaimer page

  Scenario Outline: Accept the disclaimer
    When I should see Disclaimer page with title "<pageTitle>"
    And I click on accept button
    Then I should be on aboutPedsGuide page with title "<nextPageTitle>"
    Examples:
      | pageTitle | nextPageTitle |
      | Disclaimer | About PedsGuide |
