#Author: hernan.gil@sophossolutions.com
Feature: He wants to book a flight
  

  Scenario: Book a flight
    Given he wants to book a ticket
    When he selects from "Bogota" to "Madrid"
    Then he shoulds see the ticket booked
   


