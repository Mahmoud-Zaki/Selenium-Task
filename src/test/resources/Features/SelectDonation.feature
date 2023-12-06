Feature: SelectDonation

  Background:
    Given Go to Home page

  @SelectDonation_TC_01
  Scenario: Select donation for Gaza
    When Enter the donation for Gaza as "1000"
    Then Verify that the cart increased by one