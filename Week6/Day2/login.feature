Feature: Login functionality for leaftaps application

Scenario: login with valid credentials
Given launch the browser and load the url
When Enter the username as demosalesmanager
When Enter the password as crmsfa
And Click on the login button
Then homepage should be dispalyed
