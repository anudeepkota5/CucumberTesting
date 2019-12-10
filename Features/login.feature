#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
@tag
Feature: Login Feature

  @Sanity
  Scenario: User login to Mercury Application
    Given User is on Mercury Login Page
    And User enters Username
    And User enters Password
    When User click on Signin button
    Then User should be able to login successfully
