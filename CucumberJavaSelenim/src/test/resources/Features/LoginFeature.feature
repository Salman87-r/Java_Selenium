Feature: Check Login Functionality

  Scenario Outline: Enter username and password true credentials
    Given User open the browser
    When User enter <username> and enter <password>
    And User Enter click login button
    Then user navigate to home page

    Examples: 
      | username        | password |
      | "mani1@gmail.com" |    "12345"|
      | "mani2@gmail.com" |    "12345"|
      
