#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

@tag
Feature: Reservation Feature

  @tag1
  Scenario Outline: Book a ticket
    Given User is on Mercury Flight Reservation Application
    Then User logsin to the Application successfully 
    And Select the required flight tickets <Type>
    And User verify the price of the tickets
    When User makes a successfull payment and buy the tickets
    Then Tickets are will be available for the user to print

    Examples: 
      | Type  | value | status  |
      | Round Trip |     5 | success |
      | One Way |     7 | Fail    |
