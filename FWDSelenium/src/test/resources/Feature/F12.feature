Feature: Testing the e-commerce site.

  Scenario: logged user could create successful order
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    When clicking on item
    When click add to cart
    When navigate to cart
    When user agree to the terms and click on continue
    When user moved to check out screen
