Feature: Stack functionality
  I want to use this template for my feature file
  Background: The user sign in to dsAlgo Portal 
  
  Scenario: Verify that user is able to navigate to Stack data structure page
  
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Stack Panel 
    Then The user be directed to Stack Data Structure Page


  
  Scenario: Verify that user is able to navigate to Stack  data structure page
  
    Given  The user is in the Home page after Sign in
    When   The user select Stack item from the dropdown menu
    Then  The user be directed to Stack Data Structure Page
 
  Scenario: Verify that user is able to navigate to Operations in Stack page
     
     Given The user is in the Stack page after Sign in
     When  The user clicks Operations in Stack button
     Then The user should be redirected to Operations in Stack page
     
  Scenario: Verify that user is able to navigate to try Editor page for "Operations in Stack" page
     
     Given The user is on the Operations in Stack page
     When The user clicks Try Here button in Operations in Stack page
     Then The user should be redirected to a page having an try Editor with a Run button to test
     
  Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" try Editor page
       
       Given The user is in the tryEditor page
       When The user clicks the Run Button without entering the code in the Editor
       Then The user should able to see an error message in alert window
       
  Scenario: Verify that user receives error for invalid python code for "Operations in Stack" try Editor page
       
       Given The user is in the tryEditor page
       When The user write the invalid code in Editor and click the Run Button
       Then The user should able to see an error message in alert window
       
   Scenario:  Verify that user is able to see output for valid python code for "Operations in Stack" try Editor page
       Given The user is in the tryEditor page
       When The user write the valid code in Editor and click the Run Button
       Then The user should able to see output in the console
       
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Operations in Stack" page
       Given The user is in the Operations in Stack page after Sign in
       When The user clicks Practice Questions button
       Then  The user should be redirected to Practice page with links to practice
       
   Scenario: Verify that user is able to navigate to "Implementation" page
        Given The user is in the Stack page after Sign in
        When  The user clicks Implementation button
        Then  The user should be redirected to Implementation page
        
   Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
        Given The user is on the Implementation page
        When  The user clicks Try Here button in Implementation page
        Then  The user should be redirected to a page having an try Editor with a Run button to test
        
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation" try Editor page
          Given  The user is in the tryEditor page
          When  The user clicks the Run Button without entering the code in the Editor
          Then  The user should able to see an error message in alert window
          
  Scenario:  Verify that user receives error for invalid python code for "Implementation" try Editor page
          Given The user is in the tryEditor page
          When  The user write the invalid code in Editor and click the Run Button
          Then  The user should able to see an error message in alert window
    
 
  Scenario: Verify that user is able to see output for valid python code for "Implementation" try Editor page
        Given  The user is in the tryEditor page
        When   The user write the valid code in Editor and click the Run Button
        Then   The user should able to see output in the console
        
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Implementation" page
       Given The user is in the Implementation page after Sign in
       When  The user clicks Practice Questions button
       Then  The user should be redirected to Practice page with links to practice
       
    Scenario:  Verify that user is able to navigate to "Applications of Stack" page
       Given The user is in the Stack page after Sign in
       When  The user clicks Applications button
       Then  The user should be redirected to Applications of Stack  page
       
    Scenario:  Verify that user is able to navigate to "try Editor" page for "Applications of Stack" page
       Given  The user is on the Applications of Stack  page
       When  The user clicks Try Here button in Applications of Stack page
       Then  The user should be redirected to a page having an try Editor with a Run button to test
       
    Scenario: Veify that user receives error when click on Run button without entering code for "Applications of Stack" try Editor page
         Given  The user is in the tryEditor page
         When  The user clicks the Run Button without entering the code in the Editor
         Then  The user should able to see an error message in alert window
         
    Scenario:  Verify that user receives error for invalid python code for "Applications of Stack" try Editor page
        Given  The user is in the tryEditor page
        When   The user write the invalid code in Editor and click the Run Button
        Then   The user should able to see an error message in alert window
        
   Scenario:  Verify that user is able to see output for valid python code for "Applications of Stack" try Editor page
   
         Given  The user is in the tryEditor page
         When   The user write the valid code in Editor and click the Run Button
         Then     The user should able to see output in the console
         
    Scenario:  Verify that user is able to navigate to "Practice Questions" Page from "Applications of Stack" page
        Given The user is in the Applications of Stack page after Sign i
        When  The user clicks Practice Questions  button
        Then  The user should be redirected to Practice page with links to practice
        
     
       
       
   
       
       
       
       