Feature: Febrile infant feature

  Scenario Outline: check calling
    Given I should be on home page with title"<appbarTitle>"
    When I click on call Button
    And I call to provider "<provider1>"
    And I call to provider "<provider2>"
    And I click cancel button
    Then I should see home page with title "<appbarTitle>"
    Examples:
      | provider1 | provider2 | appbarTitle |
      | Healthcare Provider | EMS Provider | Febrile Infant Decision Support |

  Scenario Outline: check Infant appears ill Days button
    Given I should be on febrile infant page with title"<pageTitle>"
    When I click on "<btnName>" button
    And I click back
    Then I should go back with page "<pageTitle>"
    Examples:
      | pageTitle | btnName |
      | Febrile Infant | Infant appears ill |

  Scenario Outline: check 0 - 7 Days button
    Given I should be on febrile infant page with title"<pageTitle>"
    When I click on "<btnName>" button
    And I click back
    Then I should go back with page "<pageTitle>"
    Examples:
      | pageTitle | btnName |
      | Febrile Infant | 0 - 7 Days |

  Scenario Outline: check 8 - 21 Days button
    Given I should be on febrile infant page with title"<pageTitle>"
    When I click on "<btnName>" button
    And I click back
    Then I should go back with page "<pageTitle>"
    Examples:
      | pageTitle | btnName |
      | Febrile Infant | 8 - 21 Days |

  Scenario Outline: check 22 - 28 Days button
    Given I should be on febrile infant page with title"<pageTitle>"
    When I click on "<btnName>" button
    And I click back
    Then I should go back with page "<pageTitle>"
    Examples:
      | pageTitle | btnName |
      | Febrile Infant |22 - 28 Days |

  Scenario Outline: check 29 - 60 Days button
    Given I should be on febrile infant page with title"<pageTitle>"
    When I click on "<btnName>" button
    And I click back
    Then I should go back with page "<pageTitle>"
    Examples:
      | pageTitle | btnName |
      | Febrile Infant | 29 - 60 Days |
