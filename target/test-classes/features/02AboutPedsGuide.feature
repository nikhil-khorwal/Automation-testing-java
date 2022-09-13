@test
Feature: AboutPedsGuide page

  Scenario Outline: Skip AboutPedsGuide page
    Given I should be on aboutPedsGuide page with title "<pageTitle>"
    And I click on i will do this later button
    Then I should be on home page with title"<appBarTitle>"
    Examples:
      | pageTitle | appBarTitle |
      | About PedsGuide | PedsGuide |
