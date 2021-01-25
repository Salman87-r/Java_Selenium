Feature: Login functionality test
Scenario: Check login with valid credentials
Given User open browser
When  user enter valid credentials
And  user click on login button
Then user navigate to the home page
Scenario: Check login with invalid credentials
GivenUser open browser
When  user enter invalid credentials
And  user click on login button
Then  Error massege displayed

 