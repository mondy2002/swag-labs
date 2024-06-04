Feature:test the login functionality

  @test1
  Scenario: to login with valid email and password
  Given user come to the web site and go to login page
  When user fill in email as "standard_user" and password as "secret_sauce" and press login
  Then user should navigate to home page
   And user fill in fname as "mohamed" and lname as "mondy" and zcode as "315315"
   
   Then check invoice price is right
  
  
  
  
  
  
  
  
  #@test2
  #Scenario Outline: log in with invalid credentials
  #Given user come to the web site and go to login page
  #When user fill in email as "<username>" and password as "<password>" and press login
  #Then error message should appear
  #Examples:
  #|    username   |   password   |
  #|    InnoTech   |   Supp#963   |
  #|    InnoTec    |   Supp#963   |
  #|    InnoTec    |   Supp#96    |
     #
  #@test3
  #Scenario: to login with valid cridentials and click remember me 
  #Given user come to the web site and go to login page
  #When user fill in email as "InnoTech" and password as "Supp#963" and check remember me button then press login
  #And user closes the page and launch the browser again  
  #Then user should navigate to home page
   