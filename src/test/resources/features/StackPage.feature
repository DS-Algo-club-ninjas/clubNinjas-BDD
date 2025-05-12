Feature: Stack functionality
  
  Background: The user sign in to dsAlgo Portal 
    Given  The user is on the Home page and clicks Sign In
    When The user gets data from excel sheet "Valid_Login" and 1 for the login page
    
  Scenario: Verify that user is able to navigate to Stack data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Stack Panel 
    Then The user be directed to Stack Data Structure Page

  Scenario: Verify that user is able to navigate to Stack data structure page
    Given  The user is in the Home page after Sign in
    When   The user select Stack item from the dropdown menu
    Then  The user be directed to Stack Data Structure Page
 
  Scenario: Verify that user is able to navigate to "Operations in Stack" page
     Given The user is in the Stack page after Sign in
     When  The user clicks Operations in Stack button
     Then The user should be redirected to Operations in Stack page
     
  Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page
     Given The user is on the Operations in Stack page
     When The user clicks Try Here button in Operations in Stack page
     Then The user should be redirected to a page having an try Editor with a Run button to test
     
  Scenario Outline:: Verify that user receives error when click on Run button without entering code for "Operations in Stack" try Editor page
       Given The user is in the Operations in Stack tryEditor page
       When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
       Then The user should able to see a error message from excel sheet "<Sheetname>" and the <RowNumber>
       
       Examples:
        	|  Sheetname   | RowNumber |
    	    | TryCode |         1 |
         	| TryCode |         2 |
          | TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Operations in Stack" try Editor page
    Given The user is in the Operations in Stack tryEditor page
    When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
    Then The user should able to see the output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
   
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Operations in Stack" page
       Given The user is on the Operations in Stack page
       When The user clicks Practice Questions button page
       Then  The user should be redirected to Practice page links
       
   Scenario: Verify that user is able to navigate to "Implementation" page
        Given The user is in the Stack page after Sign in
        When  The user clicks Implementation button
        Then  The user should be redirected to Implementation page
        
   Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
        Given The user is on the Implementation page
        When  The user clicks Try Here button in Implementation page
        Then  The user should be redirected to a page having an try Editor with a Run button to test
        
   Scenario Outline: Verify that user receives error when click on Run button for "Implementation" try Editor page
    Given The user is in the Implementation tryEditor page
    When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
    Then The user should able to see a error message from excel sheet "<Sheetname>" and the <RowNumber>
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Implementation" try Editor page
    Given The user is in the Implementation tryEditor page
    When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
    Then The user should able to see the output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
        
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Implementation" page
       Given The user is in the Implementation page 
       When  The user clicks Practice Questions button
       Then  The user should be redirected to Practice page 
       
    Scenario:  Verify that user is able to navigate to "Applications" page
       Given The user is in the Stack page after Sign in
       When  The user clicks Applications button
       Then  The user should be redirected to Applications page
       
    Scenario:  Verify that user is able to navigate to "try Editor" page for "Applications" page
       Given  The user is in the Applications page
       When  The user clicks Try Here button in Applications page
       Then  The user should be redirected to a page having an try Editor with a Run button to test
       
   
  Scenario Outline: Verify that user receives error when click on Run button for "Applications" try Editor page
    Given The user is in the Applications tryEditor page
    When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
    Then The user should able to see a error message from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Applications" try Editor page
    Given  The user is in the Applications tryEditor page
   When The user enters excel sheet in "<Sheetname>" and the <RowNumber> and clicks the Run Button in tryEditor page
    Then The user should able to see the output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
         
    Scenario:  Verify that user is able to navigate to "Practice Questions" Page from "Applications" page
        Given The user is in the Applications page
        When  The user clicks Practice Questions button
        Then  The user should be redirected to Practice page 
     
       
       
   
       
       
       
       