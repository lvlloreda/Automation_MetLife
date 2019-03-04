#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
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

