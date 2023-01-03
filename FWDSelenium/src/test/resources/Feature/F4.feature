Feature: Testing the e-commerce site.

    Scenario: logged user could search for any product
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (Build your own computer) in search
    Then related search result are shown
