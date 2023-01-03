Feature: Testing the e-commerce site.

  Scenario: logged user could add different products to wishlist
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    Then click on add to wishlist


