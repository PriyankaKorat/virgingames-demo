@author_Priyanka @regression
  Feature: HomePage feature
    As a user I want to test the home page

    @author_Priyanka @regression
      Scenario: Verify user should be able to click on online slot
      Given I am on homepage
      And I click on Allow cookies
      And I click on Online Slots
      Then I should be on Online Slots page "https://www.virgingames.com/uk/slots"

    @author_Priyanka @regression
      Scenario: Verify outside Uk people not allow to join Online slots
        Given I am on homepage
        And I click on Allow cookies
        And I click on Blog
        Then I should able to see the text "Welcome to the Virgin Games Blog"



