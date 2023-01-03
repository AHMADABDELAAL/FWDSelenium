Feature: Testing the e-commerce site.

   Scenario: logged user can select different categories
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (Build your own computer) in search
    Then user can select different categories

