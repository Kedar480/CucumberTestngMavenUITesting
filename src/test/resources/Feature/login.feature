
Feature: Login to OrangeHRM

   Scenario: Test the login functionality of OrangeHRM
   Given User opens the "Chrome" browser and OrangeHRM application using "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   When User enters  username as "Admin" and password as "admin123"
   And User click on the login button
  Then User should navigate to home page having url as "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

 Scenario Outline: Test the login functionality with multiple Username and Password in OrangeHRM
    Given User opens the "Chrome" browser and OrangeHRM application using "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User enters  <username> and <password>
    And User click on the login button
  	Then User should navigate to home page having url as "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"

  	Examples: 
  	| username | password  |
    | "Admin"    | "admin123" |
    | "Coin"     | "false" |
    | "Space"    | "false" |
    | "racecar"  | "true"  |
    
  