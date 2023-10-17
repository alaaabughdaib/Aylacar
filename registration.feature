
	Feature: User Registration and Authentication
	  Users should be able to create accounts with their personal information.
	  User authentication (email/password) for secure access.
  

  
  Scenario: Register a new user with an unused email
    Given the user is on the registration page
    When the user enters their name "Ala'a" email "alaa@example.com," and password "1234"
    And clicks the "sign up" button
    Then the user's account is created
    And they receive a confirmation email
    
  Scenario: Register a new user with an used email
    Given there is an existing user with the email "existinguser@example.com"
    And the user is on the registration page
    When the user enters their name "New User," the existing email "existinguser@example.com," and password "1234"
    And clicks the "sign up" button
    Then an error message is displayed
    And the user's account is not created 

	Scenario: Log in with vaild email and valid password
	  Given the user is on the login page
	  When the user enters their valid email "alaa@example.com" and vlid password "1234"
	  And clicks the "Login" button
	  Then the user is successfully logged in
	  And new page will open 
	  
	Scenario: Log in with inavalid email and invalid password
	  Given the user is on the login page
	  When the user enters an incorrect email "unexist@example.com" and incorrect password "wrongpassword"
	  And clicks the "Login" button
	  Then an error message is displayed
	  And the user is not logged in

	 Scenario: Log in with invalid password 
	  Given the user is on the login page
	  When the user enters their valid email "valid@example.com" and invalid password "wrongpassword"
	  And clicks the "Login" button
	  Then an error message is displayed
	  And the user is not logged in
	  
	  
	 Scenario: Log in with invalid email 
	  Given the user is on the login page
	  When the user enters their invalid email "invalid@example.com" and valid password "password"
	  And clicks the "Login" button
	  Then an error message is displayed
	  And the user is not logged in
