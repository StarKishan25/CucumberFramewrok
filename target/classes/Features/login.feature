Feature: Sucessful Login

#without examples keyword
#Scenario: Login test 
#	Given User is already on login page 
#	When Title of the login page 
#	Then User enters the "Star Kishan" & "kishan"
#	Then User clicks the login button 
#	Then User enters the homepage 
#	Then close the browser
	
	
#with examples keyword	
Scenario Outline: Login test 
	Given User is already on login page 
	When Title of the login page 
	Then User enters the "<username>" & "<password>"
	Then User clicks the login button 
	Then User enters the homepage 
	Then close the browser

Examples:
		| username | password |
		| Star Kishan | kishan |
		| Ram Kishore | kishore |