Feature: Testing the e-commerce site.

  Scenario: User could register with valid data
    Given web site opens
    When user click on register button
    When user enters data and click on register
    Then confirmation message is shown

  