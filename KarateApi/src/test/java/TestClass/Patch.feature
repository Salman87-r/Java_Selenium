Feature: patch cell test
Background:
* def postdata = read('patch.json')
Scenario:Create put users update specification
Given url 'https://reqres.in/api/users'
And request postdata
When method patch
Then status 200