Feature: Validate search Results being displayed after user performs search and able to navigate to link having specific text

  Background:
    Given user is on landing page
    And search for product by entering text "Cars in London" and selects it

  Scenario: Validate the search Results that are being displayed and clicks on link having specific text
    Then search result window should be displayed
    And Identify links having "gumtree" in the URL
    And Click on each link
    And For each opened link validate title and count displayed
