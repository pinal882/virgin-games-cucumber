@smoke
Feature: verify onlineSlots feature
  As a user, I want to verify user should navigate to onlineSlots feature

  Scenario: verify user should navigate to onlineslots tab successfully
    Given I am on home page
    And I verify I am on home page
    And I accept Necessary cookies only
    When I click on 'Online Slots' tab
    Then I verify the text 'Play Online Slots at Virgin Games'
