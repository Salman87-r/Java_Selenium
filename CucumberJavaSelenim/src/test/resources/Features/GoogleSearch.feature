Feature: Test google search Feature functionality

  Scenario: validate google search is working
    Given Browser is open
    And User  is on google search page
    When user enter text in search box
    And user enter click
    Then user reach on that page
