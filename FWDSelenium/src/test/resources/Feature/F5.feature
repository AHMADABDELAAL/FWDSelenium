Feature: Testing the e-commerce site.

  Scenario: logged user could switch between currencies US-Euro
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user select euro
    When user select us
    Then currency is changed
