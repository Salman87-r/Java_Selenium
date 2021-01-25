Feature: Put cell test
Background:
* def postdata = read('put.json')
Scenario:Create put users update specification
Given url 'https://reqres.in/api/users'
And request postdata
When method put
Then status 200