@api_test

Feature: test apis



   Scenario Outline: Testing the make a post functionality
     Then User hit the webservice https://jsonplaceholder.typicode.com/posts
     Then The status code is 200 for post
     And the body should not be null for https://jsonplaceholder.typicode.com/posts
     And the "<data>" should not be null

     Examples:

     |  data   |
     |  userid |
     |  id     |
     |  title  |
     |  body   |


  Scenario Outline: Testing the make a post functionality
    Then User hit the webservice https://jsonplaceholder.typicode.com/comments
    Then The status code is 200 for comments
    And the body should not be null for https://jsonplaceholder.typicode.com/comments
    And the "<data>" should not be null

    Examples:

      | data    |
      | postId  |
      | id      |
      | name    |
      | email   |
      | body    |



  Scenario Outline: Testing the make a post functionality
    Then User hit the webservice https://jsonplaceholder.typicode.com/users
    Then The status code is 200 for users
    And the body should not be null for https://jsonplaceholder.typicode.com/users
    And the "<data>" should not be null

    Examples:

      |  data       |
      |  id         |
      |  name       |
      |  username   |
      |  email      |
      |  address    |
      |  street     |
      |  suite      |
      |  city       |
      |  zipcode    |
      |  geo        |
      |  lat        |
      |  lng        |
      |  phone      |
      |  website    |
      |  company    |
      |  name       |
      |  catchPhrase|
      |  bs         |