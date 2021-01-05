Feature: Sucessful Login

#without examples keyword
#Scenario: Login test 
#	Given User is already on login page 
#	When Title of the login page 
#	Then User enters the "Star Kishan" & "kishan"
#	Then User clicks the login button 
#	Then User enters the homepage 
#	Then close the browser
	
#achieve data driven approach in cucumber selenium using Scenario outline with examples keyword	
#with examples keyword	
Scenario Outline: Login test 
	Given User is already on login page 
	When Title of the login page 
	Then User enters the "<username>" & "<password>"
#	Then User clicks the login button 
#	Then User enters the homepage 
	Then close the browser

Examples:
		| username | password |
		| Star Kishan | kishan |
#		| Ram Kishore | kishore |
		
		
#without examples keyword how to achieve data driven approach
#Scenario: Login test 
#	Given User is already on login page 
#	When Title of the login page 
#	Then User enters the username & password
# 					| Star Kishan | Kishan | 

#	Then User clicks the login button 
#	Then User enters the homepage 
#	Then close the browser