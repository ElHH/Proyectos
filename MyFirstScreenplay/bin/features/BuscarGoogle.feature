#Author: hernan.gil@sophossolutions.com


Feature: Buscar en internet
  I want to search the word cheese in google

  
  Scenario: Search in google
    Given that hernan wants to search a word in google
    When he search the word cheese
    Then he should see the result in the screen
    
