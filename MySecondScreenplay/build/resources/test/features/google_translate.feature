#Author: hernan.gil@sophossolutions.com


Feature: Google translate
		As a web user
		I want to use google translate 	
		to translate words between different languages

  Scenario: Translate from english to spanish
    Given that Hernan wants to translate a word 
    When  she translate the word cheese from english to spanish 
    Then  she should see the word queso in the screen
