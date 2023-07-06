Feature: User Login
 
 Background:
Given initialize the driver

  Scenario: Successful Login
  Given User is on the login page "https://tutorialsninja.com/demo/index.php?route=account/login"
  When User enters "rinusha.bala@gmail.com" and "Welcome@2023" 
  And User clicks the login button
  Then User should be logged in successfully
  