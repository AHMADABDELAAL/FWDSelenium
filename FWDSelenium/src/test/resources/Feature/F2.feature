Feature: Testing the e-commerce site.


  Scenario: User could login with valid email and password
    Given web site opens
    When user click on login button
    When user enters data and click on login
    Then user logged in
