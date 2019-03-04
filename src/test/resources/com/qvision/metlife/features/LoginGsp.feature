@tag
Feature: Login in MetLife page for execute all process

  @tag1
  Scenario Outline: Login in MetLife webpage
    Given I want open the browser with the MetLife webpage
    When I type <user> and <password>
    Then verify access

    Examples: 
      | user    | password |
      | 4000002 | metlife1 |
      #| asdasd  |        2 |
      #| 4000002 | metlife1 |

