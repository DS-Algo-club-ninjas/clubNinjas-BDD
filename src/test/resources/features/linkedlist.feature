Feature: Linked list functionality

Background: User sign in to dsAlgo Portal 
   Given  The user is on the Home page and clicks Sign In
    When  The user gets data from excel sheet "Valid_Login" and 1 for the login page


Scenario: Verify that user is able to navigate to Linked List data structure page
    Given  The user is in the Home page after Sign in
    When   The user clicks the Get Started button in LinkedList panel
    Then  The user be directed to Linked List Data Structure Page
 
   
 Scenario:  Verify that user is able to navigate to Linked List data structure page
    Given  The user is in the Home page after Sign in
    When   The user select LinkeList from drop down menu
    Then   The user be directed to Linked List Data Structure Page

 
 Scenario: Verify that user is able to navigate to  "Introduction" page
    Given The user is in Linked List after signin
     When  The user clicks Introduction button 
     Then   The user should be redirected to Introduction page 
      

  Scenario: Verify that user is able to navigate to "try Editor" page for "Introduction" page
    Given   The user is in the Introduction page
    When  The user clicks Try Here button in Introduction page
    Then  The user should be in a page of having a try Editor with a Run button to test
    
  
  Scenario Outline: Verify that user receives error when click on Run button for "Introduction" try Editor page
    Given  The user is in the Introduction tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Introduction" try Editor page
    Given  The user is in the Introduction tryEditor page
    When The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
   
 
 Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Introduction" page   
    Given   The user is in the Introduction page 
    When    The user clicks the  Practice Questions button
    Then  The user should be redirected to the Practice page
 
 Scenario:  Verify that user is able to navigate to "Creating Linked list" page
   Given   The user is in Linked List after signin
   When   The user clicks the Creating Linked list  button
   Then  The user should be redirected to Creating Linked list page  
   
  Scenario: Verify that user is able to navigate to "try Editor" page for "Creating Linked list" page
    Given   The user is in the Creating Linked list page
    When  The user clicks Try Here button in Creating Linked list page
    Then  The user should be in a page of having a try Editor with a Run button to test
    
 Scenario Outline: Verify that user receives error when click on Run button for "Creating Linked list" try Editor page
    Given  The user is in the Creating Linked list  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Creating Linked list" try Editor page
    Given  The user is in the Creating Linked list  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    	
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Creating Linked list" page   
    Given   The user is in the Creating Linked list page 
    When    The user clicks the  Practice Questions button
    Then   The user should be redirected to the Practice page 	
    
   Scenario:  Verify that user is able to navigate to "Types of Linked list" page
    Given   The user is in Linked List after signin
    When  The user clicks the  Types of Linked list   button
    Then The user should be redirected to  Types of Linked list  page
      
  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Linked list" page
    Given  The user is in the Types of Linked list page
    When The user clicks Try Here button in Types of Linked list page
    Then  The user should be in a page of having a try Editor with a Run button to test   
   
  Scenario Outline: Verify that user receives error when click on Run button for " Types of Linked list" try Editor page
    Given  The user is in the  Types of Linked list  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Types of Linked list" try Editor page
    Given   The user is in the  Types of Linked list  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    	
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Linked list" page   
    Given   The user is in the Types of Linked list page 
    When    The user clicks the  Practice Questions button
    Then  The user should be redirected to the Practice page 	
     	
 Scenario:  Verify that user is able to navigate to "Implement Linked List in Python" page
    Given   The user is in Linked List after signin
    When   The user clicks the  Implement Linked List in Python button
    Then The user should be redirected to  Implement Linked List in Python  page  
  
   Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Linked list" page
    Given   The user is in the Types of Linked list page
    When  The user clicks Try Here button in Types of Linked list page
    Then  The user should be in a page of having a try Editor with a Run button to test    
   
 Scenario Outline: Verify that user receives error when click on Run button for "Implement Linked List in Python" try Editor page
    Given  The user is in the Implement Linked List in Python tryEditor page
    When The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Implement Linked List in Python" try Editor page
    Given   The user is in the Implement Linked List in Python tryEditor page
    When The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    	
    Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implement Linked List in Python" page   
    Given   The user is in the Implement Linked List in Python page 
    When    The user clicks the  Practice Questions button
    Then  The user should be redirected to the Practice page
      
  Scenario:  Verify that user is able to navigate to "Traversal" page
    Given   The user is in Linked List after signin
    When  The user clicks the  Traversal button
    Then The user should be redirected to Traversal page 
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Traversal" page
    Given  The user is in the Implement Linked List in Python page
    When The user clicks Try Here button in Traversal page
    Then  The user should be in a page of having a try Editor with a Run button to test    
      
      
  Scenario Outline: Verify that user receives error when click on Run button for "Traversal" try Editor page
  
    Given  The user is in the Traversal  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Traversal" try Editor page
   
    Given The user is in the Traversal  tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    	
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for Traversal page   
   
    Given   The user is on the Traversal  page after Sign in
    When   The user clicks the  Practice Questions button
    Then  The user should be redirected to the Practice page
      
   
   Scenario:  Verify that user is able to navigate to "Insertion" page
    Given  The user is in Linked List after signin
    When   The user clicks the  Insertion button
    Then  The user should be redirected to Insertion page  
       
   Scenario: Verify that user is able to navigate to "try Editor" page for "Insertion" page
    Given The user is on the Insertion page after Sign in
    When  The user clicks Try Here button in Insertion page
    Then  The user should be in a page of having a try Editor with a Run button to test    
       
  Scenario Outline: Verify that user receives error when click on Run button for "Insertion" try Editor page
    Given  The user is in the Insertion tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Insertion" try Editor page
   
    Given  The user is in the Insertion tryEditor page
    When The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for Insertion page   
    Given   The user is on the Insertion page after Sign in 
    When    The user clicks the  Practice Questions button
    Then   The user should be redirected to the Practice page
    
  Scenario:  Verify that user is able to navigate to "Deletion" page
    Given  The user is in Linked List after signin
    When   The user clicks the  Deletion button
    Then  The user should be redirected to  Deletion page  
    
  Scenario: Verify that user is able to navigate to "try Editor" page for "Deletion" page
    Given  The user is on the  Deletion page after Sign in
    When The user clicks Try Here button in Deletion page
    Then  The user should be in a page of having a try Editor with a Run button to test     
    
  Scenario Outline: Verify that user receives error when click on Run button for "Deletion" try Editor page
    Given  The user is in the  Deletion tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see a error message from excel sheet "<Sheetname>" and the  <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
  Scenario Outline: Verify that user is able to see output for valid python code for "Deletion" try Editor page
    Given   The user is in the  Deletion tryEditor page
    When  The user enters excel sheet "<Sheetname>" and the <RowNumber> clicks the Run Button in tryEditor page
    Then  The user should able to see the  output in the console from excel sheet "<Sheetname>" and the <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    	
     Scenario: Verify that user is able to navigate to "Practice Questions" Page for Deletion page   
    Given  The user is on the  Deletion page after Sign in 
    When  The user clicks the  Practice Questions button
    Then   The user should be redirected to the Practice page	