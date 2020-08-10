#language: en
@CarnivalTest
  Feature: As a carnival cruise customer I want to make searches and purchases on the companie website

    Scenario: Cruise search with only the origin and duration by the user
      Given a web browser on the Carnival page
      When i enter the origin of the cruise
      And enter the duration of the cruise
      And i give you search
      Then i validate that the display grid is allowed to manage
      And it is allowed to manage the price filter
      And it is allowed to manage the search sort filter by prices

    Scenario: Cruise search with the origin, destination and duration by the user
      Given a web browser on the Carnival page
      When i enter the origin of the cruise
      And i enter the destination of the cruise
      And enter the duration of the cruise
      And i give you search
      Then i validate that the display grid is allowed to manage
      And it is allowed to manage the price filter
      And it is allowed to manage the search sort filter by prices

    Scenario: Cruise search without search filters then the origin, destination and duration are entered by the user
      Given a web browser on the Carnival page
      When i give you search
      And i enter the origin of the cruise
      And i enter the destination of the cruise
      And enter the duration of the cruise
      Then i validate that the display grid is allowed to manage
      And it is allowed to manage the price filter
      And it is allowed to manage the search sort filter by prices

    Scenario: Select a cruise offered on the page and try to book without searching with the default filters
      Given a web browser on the Carnival page
      When i give you search
      And i select a cruise
      Then select the day of the cruise and get the detailed information of the itinerary
      And I validate the presence of the reservation button

    Scenario: Select a cruise by searching with a default filter of Bahamas origin and duration 6-9 days, and try to book
      Given a web browser on the Carnival page
      When i give you search
      And i enter the origin of the cruise
      And enter the duration of the cruise
      And i select a cruise
      Then select the day of the cruise and get the detailed information of the itinerary
      And I validate the presence of the reservation button

