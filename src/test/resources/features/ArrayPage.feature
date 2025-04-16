Feature: Array Page of DSAlgo portal

	Background: The user is signed into dsAlgo Portal  

  @tag1
  Scenario: Verify that user is able to navigate to Array data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Get Started button in Array Panel 
    Then The user should be directed to ARRAY Data Structure Page
    
  
  Scenario: Verify that user is able to navigate to Array data structure page
    Given The user is in the Home page after Sign in
    When The user select Array item from the drop down menu
    Then The user should be directed to ARRAY Data Structure Page
    
  
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays in Python button
    Then The user should be redirected to Arrays in Python page

 
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the Arrays in Python page
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
  
  Scenario Outline: Verify that user receives error when click on Run button for "Arrays in Python" try Editor page
    Given The user is in the Arrays in Python tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         1 |
    	| ArrayTryCode |         2 |
    	| ArrayTryCode |         3 |
    	
   Scenario Outline: Verify that user is able to see output for valid python code for "Arrays in Python" try Editor page
    Given The user is in the Arrays in Python tryEditor page
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         4 |

  
  Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Arrays in Python" page
    Given The user is in the Arrays in Python page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
  
  Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Practice question page of Arrays in Python page
    When The user clicks the Search the array link
    Then The user should be redirected to Question page of Search the array link
    
  
  Scenario Outline: Verify that user receives NameError, SyntaxError for invalid python code on running "Search the array" question
    Given The user is on the practice question editor of Search the array question
    When The user write the invalid code from "<Sheetname>" and <RowNumber> in Search the array question Editor and click the Run Button
    Then The user should able to see error message in alert window from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SearchArray |         1 |
    	| SearchArray |         2 |

  Scenario Outline: Verify that user is able to run valid python code for "Search the array" question
    Given The user is on the practice question editor of Search the array question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Search the array question Editor and click the Run Button
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SearchArray |          3 |
    
  Scenario Outline: Verify that user receives error on submitting invalid python code, incorrect answer for "Search the array" question
    Given The user is on the practice question editor of Search the array question
    When The user write the code from "<Sheetname>" and <RowNumber> in Search the array question Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SearchArray |         1 |
    	| SearchArray |         4 |
 
    
  Scenario Outline: Verify that user is able to successfully submit valid correct python code for "Search the array" question
    Given The user is on the practice question editor of Search the array question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Search the array Editor and Click the Submit Button
    Then The user see success message "Submission successful"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SearchArray |          3 |
    
  Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Practice question page of Arrays in Python page
    When The user clicks the Max Consecutive Ones link
    Then The user should be redirected to Question page of Max Consecutive Ones link
    
   Scenario Outline: Verify that user receives NameError, SyntaxError for invalid python code on running "Max Consecutive Ones" question
    Given The user is on the practice question editor of Max Consecutive Ones question
    When The user write the invalid code from "<Sheetname>" and <RowNumber> in Max Consecutive Ones question Editor and click the Run Button
    Then The user should able to see error message in alert window from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| MaxConsOnes |         1 |
    	| MaxConsOnes |         2 |

  Scenario Outline: Verify that user is able to run valid python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor of Max Consecutive Ones question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Max Consecutive Ones question Editor and click the Run Button
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| MaxConsOnes |          3 |
    
   Scenario Outline: Verify that user receives error on submitting invalid python code, incorrect answer for "Max Consecutive Ones" question
    Given The user is on the practice question editor of Max Consecutive Ones question
    When The user write the code from "<Sheetname>" and <RowNumber> in Max Consecutive Ones question Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| MaxConsOnes |         1 |
    	| MaxConsOnes |         4 |
 
    
  Scenario Outline: Verify that user is able to successfully submit valid correct python code for "Max Consecutive Ones" question
    Given The user is on the practice question editor of Max Consecutive Ones question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Max Consecutive Ones Editor and Click the Submit Button
    Then The user see success message "Submission successful"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| MaxConsOnes |          3 |
    
   Scenario: Verify that user is able to navigate to "Find Numbers with Even Number of Digits" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Practice question page of Arrays in Python page
    When The user clicks the Find Numbers with Even Number of Digits link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario Outline: Verify that user receives NameError, SyntaxError for invalid python code on running "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor of Find Numbers with Even Number of Digits question
    When The user write the invalid code from "<Sheetname>" and <RowNumber> in Find Numbers with Even Number of Digits question Editor and click the Run Button
    Then The user should able to see error message in alert window from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| FindNumbers |         1 |
    	| FindNumbers |         2 |

  Scenario Outline: Verify that user is able to run valid python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor of Find Numbers with Even Number of Digits question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Find Numbers with Even Number of Digits question Editor and click the Run Button
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| FindNumbers |          3 |

    
  Scenario Outline: Verify that user receives error on submitting invalid python code, incorrect answer for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor of Find Numbers with Even Number of Digits question
    When The user write the code from "<Sheetname>" and <RowNumber> in Find Numbers with Even Number of Digits question Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| FindNumbers |         1 |
    	| FindNumbers |         4 |
 
    
  Scenario Outline: Verify that user is able to successfully submit valid correct python code for "Find Numbers with Even Number of Digits" question
    Given The user is on the practice question editor of Find Numbers with Even Number of Digits question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Find Numbers with Even Number of Digits Editor and Click the Submit Button
    Then The user see success message "Submission successful"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SearchArray |          3 |
    	
   Scenario: Verify that user is able to navigate to "Squares of a Sorted Array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the Practice question page of Arrays in Python page
    When The user clicks the Squares of a Sorted Array link
    Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons
    
    Scenario Outline: Verify that user receives NameError, SyntaxError for invalid python code on running "Squares of a Sorted Array" question
    Given The user is on the practice question editor of Squares of a Sorted Array question
    When The user write the invalid code from "<Sheetname>" and <RowNumber> in Squares of a Sorted Array question Editor and click the Run Button
    Then The user should able to see error message in alert window from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SqrSort |         1 |
    	| SqrSort |         2 |

  Scenario Outline: Verify that user is able to run valid python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor of Squares of a Sorted Array question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Squares of a Sorted Array question Editor and click the Run Button
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SqrSort |          3 |
    
   Scenario Outline: Verify that user receives error on submitting invalid python code, incorrect code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor of Squares of a Sorted Array question
    When The user write the code from "<Sheetname>" and <RowNumber> in Squares of a Sorted Array question Editor and Click the Submit Button
    Then The user see an error message "Error occurred during submission"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SqrSort |         1 |
    	| SqrSort |         4 |
 
    
  Scenario Outline: Verify that user is able to successfully submit valid correct python code for "Squares of a Sorted Array" question
    Given The user is on the practice question editor of Squares of a Sorted Array question
    When The user write the valid code from "<Sheetname>" and <RowNumber> in Squares of a Sorted Array Editor and Click the Submit Button
    Then The user see success message "Submission successful"
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| SqrSort |          3 |
    	
   Scenario: Verify that user is able to navigate to "Arrays Using List" page
    Given The user is in the Array page after Sign in
    When The user clicks Arrays Using List button
    Then The user should be redirected to Arrays Using List page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays Using List" page
    Given The user is on the Arrays Using List page
    When The user clicks Try Here button in Arrays Using List page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
   Scenario Outline: Verify that user receives error when click on Run button without entering code for "Arrays Using List" try Editor page
    Given The user is in the tryEditor page of Arrays Using List
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         1 |
    	| ArrayTryCode |         2 |
    	| ArrayTryCode |         3 |
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Arrays Using List" try Editor page
    Given The user is in the tryEditor page of Arrays Using List
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         4 |
    
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Arrays Using List" page
    Given The user is in the Arrays Using List page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
   Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
    Given The user is in the Array page after Sign in
    When The user clicks Basic Operations in Lists button
    Then The user should be redirected to Basic Operations in Lists page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
    Given The user is on the Basic Operations in Lists page
    When The user clicks Try Here button in Basic Operations in Lists page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
   Scenario Outline: Verify that user receives error when click on Run button without entering code for "Basic Operations in Lists" try Editor page
    Given The user is in the tryEditor page of Basic Operations in Lists
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         1 |
    	| ArrayTryCode |         2 |
    	| ArrayTryCode |         3 |
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Basic Operations in Lists"try Editor page
    Given The user is in the tryEditor page of Basic Operations in Lists
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         4 |
    
   Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Basic Operations in Lists" page
    Given The user is in the Basic Operations in Lists page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page
    
   Scenario: Verify that user is able to navigate to "Applications of Array" page
    Given The user is in the Array page after Sign in
    When The user clicks Applications of Array button
    Then The user should be redirected to Applications of Array page
    
   Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
    Given The user is on the Applications of Array page
    When The user clicks Try Here button in Applications of Array page
    Then The user should be redirected to a page having a try Editor with a Run button to test
    
   Scenario Outline: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
    Given The user is in the tryEditor page of Applications of Array
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         1 |
    	| ArrayTryCode |         2 |
    	| ArrayTryCode |         3 |
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Applications of Array" try Editor page
    Given The user is in the tryEditor page of Applications of Array
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber>
    
    Examples:
    	|  Sheetname   | RowNumber |
    	| ArrayTryCode |         4 |

    
   Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications of Array" try Editor page
    Given The user is in the Applications of Array page
    When The user clicks Practice Questions button
    Then The user should be redirected to Practice page