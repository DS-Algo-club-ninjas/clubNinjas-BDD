Feature: Linked list functionality
Background: The user sign in to dsAlgo Portal 

Scenario: Verify that user is able to navigate to Linked List data structure page

    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Linked List Panel 
    Then The user be directed to Linked List Data Structure Page
    
    
 Scenario:  Verify that user is able to navigate to Linked List data structure page
  
    Given The user is in the Home page after Sign in
    When The user select Linked List item from the drop down menu
    Then The user be directed to "Linked List" Data Structure Page

Scenario: Verify that user is able to navigate to Introduction page
    
    Given The user is in the Introduction  page after Sign in
    When The user clicks Introduction button
    Then The user should be redirected to Introduction page
    
Scenario: Verify that user is able to navigate to Try here page for Introduction page
   
    Given The user is on the Introduction page
     When The user clicks Try Here button in Introduction page
     Then  The user should be redirected to a page having an Try here with a Run button to test
      
Scenario: Verify that user receives error when click on Run button without entering code for Introduction page
   
   Given The user is in the Try here page
   When The user clicks the Run Button without entering the code in the Editor
   Then The user should able to see an error message in alert window
   
   
Scenario: Verify that user receives error for invalid linked list python code for Introduction page
   
   Given The user is in the Try here page
   When The user write the invalid code in Editor and click the Run Button
   Then The user should able to see an error message in alert window
   
Scenario:  Verify that user is able to see output for valid linked list  python code for Introduction page
   
   Given The user is in the Try here page
   When  The user write the valid code in Editor and click the Run Button
   Then  The user should able to see output in the console

   
Scenario: Verify that user is able to navigate to Practice Questions Page for Introduction page   
   
    Given  The user is in the Introduction page after Sign in
    When   The user clicks Practice Questions button
    Then  The user should be redirected to Practice page
 
Scenario:  Verify that user is able to navigate to Creating Linked list page
   
   Given The user is on the Creating Linked list  page after Sign in
   When  The user clicks the Creating Linked list  button
   Then The user should be redirected to Creating Linked list page  
    
 Scenario: Verify that user is able to navigate to Try here page for Creating Linked list page    
 
    Given The user is on the Creating Linked list page
    When The user clicks Try here button in Creating Linked list page
    Then The user should be redirected to a page having an Try here with a Run button to test
    
 Scenario: Verify that user receives error when click on Run button without entering code for Creating Linked list  page
   
     Given The user is in the Try here page
     When  The user clicks the Run Button without entering the code in the Editor
     Then The user should able to see an error message in alert window
     
 Scenario: Verify that user receives error for invalid  Creating linked list code for Creating linked list page
 
    Given  The user is in the Try here page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
    
Scenario:  Verify that user is able to see output for valid Creating linked list   code for Creating linked list page

   Given The user is in the Try here page
   When  The user write the valid code in Editor and click the Run Button
   Then  The user should able to see output in the console
   
 Scenario:  Verify that user is able to navigate to Types of Linked list page
 
    Given  The user is on the Types of  Linked list page after Sign in
    When   The user clicks the Types of  Linked list button
    Then   The user should be redirected to Types of Linked list page
   
 Scenario:  Verify that user is able to navigate to Try here page for Types of  Linked list page      
   
    Given  The user is on the Types of Linked list page 
    When   The user clicks Try here  button in Types of Linked list page
    Then   The user should be redirected to a page having an Try here with a Run button to test
    
Scenario:  Verify that user receives error when click on Run button without entering code for Types of  Linked list  page  
   
   Given  The user is in the Try here page
   When   The user clicks the Run Button without entering the code in the Editor
   Then  The user should able to see an error message in alert window
   
Scenario:  Verify that user receives error for invalid Types of  linked list code for Types of  linked list  page

   Given  The user is in the Try here page
   When    The user write the invalid code in Editor and click the Run Button
   Then    The user should able to see an error message in alert window
   
 Scenario: Verify that user is able to see output for valid Types of linked list   code for Types of  linked list  page
 
   Given  The user is in the Try here page
   When   The user write the valid code in Editor and click the Run Button
   Then    The user should able to see output in the console
   
 Scenario:  Verify that user is able to navigate to Implement  Linked List in Python  page
 
    Given  The user is on the Implement   Linked List in Python page after Sign in
    When    The user  click the Implement   Linked List in Python button
    Then   The user should be redirected to Implement Linked List in Python page
    
   
 Scenario:  Verify that user is able to navigate to Try here page for Implement   Linked List in Python  page    
      
    Given  The user is on the Implement   Linked List in Python  page
    When   The user clicks Try here  button in Implement Linked List in Python page
    Then   The user should be redirected to a page having an Try here with a Run button to test
    
 Scenario:  Verify that user receives error when click on Run button without entering code for Implement   Linked List in Python page
 
    Given  The user is in the Try here page
    When   The user clicks the Run Button without entering the code in the Editor
    Then    The user should able to see an error message in alert window
    
 Scenario:  Verify that user receives error for invalid Implement   Linked List in Python code for Implement   Linked List in Python page  
      
      Given  The user is in the Try here page
      When   The user write the invalid code in Editor and click the Run Button
      Then    The user should able to see an error message in alert window
      
Scenario: Verify that user is able to see output for valid Types of linked list   code for Implement   Linked List in Python  page 
      
      Given  The user is in the Try here page
      When   The user write the valid code in Editor and click the Run Button
      Then    The user should able to see output in the console
      
Scenario: Verify that user is able to navigate to Traversal page

    Given  The user is on the Traversal page after Sign in
    When   The user  click the Traversal button
    Then   The user should be redirected to Traversal page
    
  Scenario:  Verify that user is able to navigate to Try here page for Traversal page 
  
     Given  The user is on the Traversal page
     When   The user clicks Try here button in Traversal page
     Then   The user should be redirected to a page having an Try here with a Run button to test
     
Scenario:  Verify that user receives error when click on Run button without entering code for Traversal  page
   
   Given  The user is in the Try here page
   When   The user clicks the Run Button without entering the code in the Editor
   Then   The user should able to see an error message in alert window
   

 Scenario:  Verify that user receives error for invalid Traversal code for Travrsal page     
 
    Given   The user is in the Try here page
    When    The user write the invalid code in Editor and click the Run Button
    Then    The user should able to see an error message in alert window
    
Scenario:  Verify that user is able to see output for valid Traversal code for Traversal  page    

   Given   The user is in the Try here page
   When    The user write the valid code in Editor and click the Run Button
   Then   The user should able to see output in the console
   
Scenario:  Verify that user is able to navigate to Insertion page  

   Given   The user is on the Insertion page after Sign in
   When    The user  click the Insertion button
   Then    The user should be redirected to Insertion page
   
   
Scenario:  Verify that user is able to navigate to Try here page for Insertion page   

   Given  The user is on the Insertion page
   When    The user clicks Try here button in Insertion page
   Then   The user should be redirected to a page having an Try here with a Run button to test
   
 Scenario:  Verify that user receives error when click on Run button without entering code for Insertion  page  
 
   Given   The user is in the Try here page
   When    The user clicks the Run Button without entering the code in the Editor
   Then    The user should able to see an error message in alert window
   
 Scenario:  Verify that user receives error for invalid Insertion code for Insertionl  page  
 
   Given  The user is in the Try here page
   When    The user write the invalid code in Editor and click the Run Button
   Then   The user should able to see an error message in alert window
   
Scenario:  Verify that user is able to see output for valid Traversal code for Traversal  page

   Given  The user is in the Try here page
   When    The user write the valid code in Editor and click the Run Button
   Then   The user should able to see output in the console
   
 Scenario:  Verify that user is able to navigate to Deletion page
   
    Given   The user is on the Insertion page after Sign in
    When    The user  click the Insertion button
    Then    The user should be redirected to Insertion page
    
 Scenario:  Verify that user is able to navigate to Try here page for Deletion page
 
    Given  The user is on the Deletion page
    When   The user clicks Try here button in Deletion page
    Then   The user should be redirected to a page having an Try here with a Run button to test
    
  Scenario:  Verify that user receives error when click on Run button without entering code for Deletion page   
  
     Given  The user is in the Try here page
     When   The user clicks the Run Button without entering the code in the Editor
     Then    The user should able to see an error message in alert window
     
  Scenario:  Verify that user receives error for invalid Insertion code for Insertionl page
  
    Given   The user is in the Try here page
    When    The user write the invalid code in Editor and click the Run Button
    Then    The user should able to see an error message in alert window
    
  Scenario:  Verify that user is able to see output for valid Traversal code for Traversal  page 
  
    Given   The user is in the Try here page
    When     The user write the valid code in Editor and click the Run Button
    Then    The user should able to see output in the console