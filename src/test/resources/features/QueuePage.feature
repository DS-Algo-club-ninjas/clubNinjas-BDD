Feature: Queue Page of DSAlgo portal

	Background: The user is signed into dsAlgo Portal 
		Given The user is on the Home page and clicks Sign In
    When The user gets data from excel sheet "Valid_Login" and 1 for the login page
	

  Scenario: Verify that user is able to navigate to Queue data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Queue Panel 
    Then The user should be directed to Queue Data Structure Page
    
  
  Scenario: Verify that user is able to navigate to Queue data structure page
    Given The user is in the Home page after Sign in
    When The user select Queue item from the drop down menu
    Then The user should be directed to Queue Data Structure Page
    
  
  Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
    Given The user is in the Queue page
    When The user clicks Implementation of Queue in Python button
    Then The user should be redirected to Implementation of Queue in Python page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of Queue in Python" page
    Given The user is in the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
    Scenario Outline: Verify that user receives error when click on Run button for "Implementation of Queue in Python" try Editor page
    Given The user is in the Implementation of Queue in Python tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Implementation of Queue in Python" try Editor page
    Given The user is in the Implementation of Queue in Python tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    
    
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of Queue in Python" page
    Given The user is in the Implementation of Queue in Python page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
   Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
    Given The user is in the Queue page
    When The user clicks Implementation using collections.deque button
    Then The user should be redirected to Implementation using collections.deque page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page
    Given The user is on the Implementation using collections.deque page
    When The user clicks Try Here button in Implementation using collections.deque page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
   Scenario Outline: Verify that user receives error when click on Run button for "Implementation using collections.deque" try Editor page
    Given The user is in the Implementation using collections.deque tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Implementation using collections.deque" try Editor page
    Given The user is in the Implementation using collections.deque tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    
   Scenario: Verify that user is able to navigate to "Implementation using array" page
    Given The user is in the Queue page
    When The user clicks Implementation using array button
    Then The user should be redirected to Implementation using array page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using array" page
    Given The user is on the Implementation using array page
    When The user clicks Try Here button in Implementation using array page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
  Scenario Outline: Verify that user receives error when click on Run button for "Implementation using array" try Editor page
    Given The user is in the Implementation using array tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Implementation using array" try Editor page
    Given The user is in the Implementation using array tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |
    
   Scenario: Verify that user is able to navigate to "Queue Operations" page
    Given The user is in the Queue page
    When The user clicks Queue Operations button
    Then The user should be redirected to Queue Operations page
    
  Scenario: Verify that user is able to navigate to "try Editor" page for "Queue Operations" page
    Given The user is on the Queue Operations page
    When The user clicks Try Here button in Queue Operations page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
   Scenario Outline: Verify that user receives error when click on Run button for "Queue Operations" try Editor page
    Given The user is in the Queue Operations tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         1 |
    	| TryCode |         2 |
    	| TryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Queue Operations" try Editor page
    Given The user is in the Queue Operations tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| TryCode |         4 |