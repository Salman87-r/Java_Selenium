Feature: Post cell test
Background:
* def postdata = read('Post.json')
Scenario:Create Update users Details
Given url 'https://reqres.in/api/users'
And request postdata
When method post
Then status 201
 