Feature: Data Structures - Introduction

  Background: The user is signed into dsAlgo Portal
    Given The user is on the Home page and clicks Sign In
    When The user gets data from excel sheet "Valid_Login" and 1 for the login page
    Then The user is in the Home page after Sign In

  Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
    Given The user is in the Home page after Sign In
    When The user clicks the "Get Started" button in Data Structures - Introduction
    Then The user should be redirected to "Data Structures-Introduction" in Data structures-Introduction

  Scenario: Verify that user is able to navigate to "Time Complexity" page
    Given The user is in the "Data Structures-Introduction" page in Data structures-Introduction
    When The user clicks the Time Complexity button
    Then The user should be redirected to "Time Complexity" in Data structures-Introduction

  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Time Complexity" page in Data structures-Introduction
    When The user clicks the Practice Questions button in Time Complexity page
    Then The user should be redirected to "Practice Questions" in Data structures-Introduction


  Scenario: Verify that user is able to navigate to "Try here" in "Time Complexity" page
    Given The user is in the "Time Complexity" page in Data structures-Introduction
    When The user clicks the Try here button in Time Complexity page
    Then The user should be redirected to "Assessment" in Data structures-Introduction

  Scenario Outline: Verify that user receives error when click on Run button without entering code
    Given The user is in the "Assessment" page in Data structures-Introduction
    When The user clicks the Run button in Data structures-Introductio tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Time Complexity tryEditor popup

    Examples: 
      | Sheetname      | RowNumber |
      | DataStructures |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor
    Given The user is in the "Assessment" page in Data structures-Introduction
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Time Complexity tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Time Complexity tryEditor popup

    Examples: 
      | Sheetname      | RowNumber |
      | DataStructures |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor
    Given The user is in the "Assessment" page in Data structures-Introduction
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Time Complexity tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> in Time Complexity tryEditor page

    Examples: 
      | Sheetname      | RowNumber |
      | DataStructures |         1 |
      | DataStructures |         2 |
