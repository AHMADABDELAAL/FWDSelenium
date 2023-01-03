Feature: Testing the e-commerce site.

  Scenario: logged user could select different tags
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    When user click on awesome tag
    Then user moved to products tagged with awesome
