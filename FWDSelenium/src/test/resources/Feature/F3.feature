Feature: Testing the e-commerce site.


  Scenario: User could reset his password successfully
    Given web site opens
    When user click on login button
    When user clicks on forgot password
    When user enter email
    Then recovery confirmation message is shown
