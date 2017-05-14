Feature: Login Functionality Feature 

	In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working

Scenario Outline: Login Functionality 

	Given user navigates to SOFTWARETESTINGHELP.COM 
	When user logs in using Username as <username> and Password <password> 
	Then login should be successful 
	
	Examples: 
		|username         |password          |
		|Tom                     |password1        |
		|Harry                   |password2        |
		|Jerry                    |password3        |