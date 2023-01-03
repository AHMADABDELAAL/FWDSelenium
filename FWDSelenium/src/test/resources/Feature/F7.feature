Feature: Testing the e-commerce site.


    Scenario: logged user could filter with color (no color in the site so will use Manufacturers)
      Given web site opens
      When user click on login button
      When user enters data and click on login
      When user enter (Build your own computer) in search
      Then user filter using manufacturers
      Then validate filer is applied correctly

