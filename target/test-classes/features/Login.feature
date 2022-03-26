Feature: Authentification du site web Cristal

  Background: 
    Given I access the Cristal site
    

  @TestngScenario
  Scenario Outline: Authenticate with invalid email
    Given I verify the graphic interface
    When I enter an identifier <Email>
    

    Examples: 
      | Email |
      | anis  |
