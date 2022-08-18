Feature: Yahoo registration 

@Test 
Scenario: Yahoo registration with valid credentials 

When Launch chrome and opens URL Yahoo registration page 
When fill the text boxes: First name, Last name, Email Address, Create password, Birth year 
When click on Continue 
When fill the correct number with correct contry code 
When click on send code 
When click on i'm not a robot 
When click on Continue and enter the correct code and varify 
Then after Fifteen sec close the browser