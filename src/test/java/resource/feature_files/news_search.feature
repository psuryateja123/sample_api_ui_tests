@ui_test
Feature: As a user tester I want to test the news authenticity
  Scenario: Search and find about the story
  Given I am on the gaurdian home page
  Then I select the first story
  And I search the first story in Google for authenticity
