Feature: Tree Datastructure

  Background: The user sign in to dsAlgo Portal
    Given The user is on the Home page and clicks Sign In
    When The user gets data from excel sheet "Valid_Login" and 1 for the login page
    Then The user is in the Home page after Sign In
	
  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in TreePanel
    Then The user should be directed to "Tree" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user select Tree item from the drop down menu
    Then The user should be directed to "Tree" in Tree Data Structure
	
  Scenario: Verify that user is able to navigate to "Overview of Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Overview of Trees" link in Tree Data Structure
    Then The user should be directed to "Overview of Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Overview of Trees" page
    Given The user on the "Overview of Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Overview of Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Overview of Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Overview of Trees" page
    Given The user is on the Try Editor page of "Overview of Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Overview of Trees" page
    Given The user is on the Try Editor page of "Overview of Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Overview of Trees" page
    Given The user is on the Try Editor page of "Overview of Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  #################Terminologies#####
  Scenario: Verify that user is able to navigate to "Terminologies" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Terminologies" link in Tree Data Structure
    Then The user should be directed to "Terminologies" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Terminologies" page
    Given The user on the "Terminologies" page in Tree Data Structure
    When The user clicks "Try Here" button in "Terminologies" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Terminologies"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Terminologies" page
    Given The user is on the Try Editor page of "Terminologies" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Terminologies" page
    Given The user is on the Try Editor page of "Terminologies" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Terminologies" page
    Given The user is on the Try Editor page of "Terminologies" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  #################TTypes of Trees#####
  Scenario: Verify that user is able to navigate to "Types of Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Types of Trees" link in Tree Data Structure
    Then The user should be directed to "Types of Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Types of Trees" page
    Given The user on the "Types of Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Types of Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Types of Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Types of Trees" page
    Given The user is on the Try Editor page of "Types of Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Types of Trees" page
    Given The user is on the Try Editor page of "Types of Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Types of Trees" page
    Given The user is on the Try Editor page of "Types of Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  #################Tree Traversals#####
  Scenario: Verify that user is able to navigate to "Tree Traversals" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Tree Traversals" link in Tree Data Structure
    Then The user should be directed to "Tree Traversals" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Tree Traversals" page
    Given The user on the "Tree Traversals" page in Tree Data Structure
    When The user clicks "Try Here" button in "Tree Traversals" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Tree Traversals"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Tree Traversals" page
    Given The user is on the Try Editor page of "Tree Traversals" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Tree Traversalss" page
    Given The user is on the Try Editor page of "Tree Traversals" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Tree Traversals" page
    Given The user is on the Try Editor page of "Tree Traversals" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Traversals-Illustration########
  Scenario: Verify that user is able to navigate to "Traversals-Illustration" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Traversals-Illustration" link in Tree Data Structure
    Then The user should be directed to "Traversals-Illustration" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Traversals-Illustration" page
    Given The user on the "Traversals-Illustration" page in Tree Data Structure
    When The user clicks "Try Here" button in "Traversals-Illustration" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Traversals-Illustration"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Traversals-Illustration" page
    Given The user is on the Try Editor page of "Traversals-Illustration" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Traversals-Illustration" page
    Given The user is on the Try Editor page of "Traversals-Illustration" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Traversals-Illustration" page
    Given The user is on the Try Editor page of "Traversals-Illustration" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Binary Trees########
  Scenario: Verify that user is able to navigate to "Binary Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Binary Trees" link in Tree Data Structure
    Then The user should be directed to "Binary Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Binary Trees" page
    Given The user on the "Binary Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Binary Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Binary Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Binary Trees" page
    Given The user is on the Try Editor page of "Binary Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Binary Trees" page
    Given The user is on the Try Editor page of "Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Binary Trees" page
    Given The user is on the Try Editor page of "Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Types of Binary Trees########
  Scenario: Verify that user is able to navigate to "Types of Binary Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Types of Binary Trees" link in Tree Data Structure
    Then The user should be directed to "Types of Binary Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Types of Binary Trees" page
    Given The user on the "Types of Binary Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Types of Binary Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Types of Binary Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Types of Binary Trees" page
    Given The user is on the Try Editor page of "Types of Binary Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Types of Binary Trees" page
    Given The user is on the Try Editor page of "Types of Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Types of Binary Trees" page
    Given The user is on the Try Editor page of "Types of Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Implementation in Python########
  Scenario: Verify that user is able to navigate to "Implementation in Python" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Implementation in Python" link in Tree Data Structure
    Then The user should be directed to "Implementation in Python" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Implementation in Python" page
    Given The user on the "Implementation in Python" page in Tree Data Structure
    When The user clicks "Try Here" button in "Implementation in Python" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Implementation in Python"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Implementation in Python" page
    Given The user is on the Try Editor page of "Implementation in Python" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Implementation in Python" page
    Given The user is on the Try Editor page of "Implementation in Python" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Implementation in Python" page
    Given The user is on the Try Editor page of "Implementation in Python" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Binary Tree Traversals########
  Scenario: Verify that user is able to navigate to "Binary Tree Traversals" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Binary Tree Traversals" link in Tree Data Structure
    Then The user should be directed to "Binary Tree Traversals" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Binary Tree Traversals" page
    Given The user on the "Binary Tree Traversals" page in Tree Data Structure
    When The user clicks "Try Here" button in "Binary Tree Traversals" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Binary Tree Traversals"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Binary Tree Traversals" page
    Given The user is on the Try Editor page of "Binary Tree Traversals" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Binary Tree Traversals" page
    Given The user is on the Try Editor page of "Binary Tree Traversals" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Binary Tree Traversals" page
    Given The user is on the Try Editor page of "Binary Tree Traversals" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Implementation of Binary Trees########
  Scenario: Verify that user is able to navigate to "Implementation of Binary Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Implementation of Binary Trees" link in Tree Data Structure
    Then The user should be directed to "Implementation of Binary Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Implementation of Binary Trees" page
    Given The user on the "Implementation of Binary Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Implementation of Binary Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Implementation of Binary Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Implementation of Binary Trees" page
    Given The user is on the Try Editor page of "Implementation of Binary Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Implementation of Binary Trees" page
    Given The user is on the Try Editor page of "Implementation of Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Implementation of Binary Trees" page
    Given The user is on the Try Editor page of "Implementation of Binary Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Applications of Binary trees########
  Scenario: Verify that user is able to navigate to "Applications of Binary trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Applications of Binary trees" link in Tree Data Structure
    Then The user should be directed to "Applications of Binary trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Applications of Binary trees" page
    Given The user on the "Applications of Binary trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Applications of Binary trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Applications of Binary trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Applications of Binary trees" page
    Given The user is on the Try Editor page of "Applications of Binary trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Applications of Binary trees" page
    Given The user is on the Try Editor page of "Applications of Binary trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Applications of Binary trees" page
    Given The user is on the Try Editor page of "Applications of Binary trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Binary Search Trees########
  Scenario: Verify that user is able to navigate to "Binary Search Trees" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Binary Search Trees" link in Tree Data Structure
    Then The user should be directed to "Binary Search Trees" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Binary Search Trees" page
    Given The user on the "Binary Search Trees" page in Tree Data Structure
    When The user clicks "Try Here" button in "Binary Search Trees" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Binary Search Trees"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Binary Search Trees" page
    Given The user is on the Try Editor page of "Binary Search Trees" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Binary Search Trees" page
    Given The user is on the Try Editor page of "Binary Search Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Binary Search Trees" page
    Given The user is on the Try Editor page of "Binary Search Trees" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ######Implementation Of BST########
  Scenario: Verify that user is able to navigate to "Implementation Of BST" page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks "Implementation Of BST" link in Tree Data Structure
    Then The user should be directed to "Implementation Of BST" in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Implementation Of BST" page
    Given The user on the "Implementation Of BST" page in Tree Data Structure
    When The user clicks "Try Here" button in "Implementation Of BST" page in Tree Data Structure
    Then The user should be directed to Try Editor page to test "Implementation Of BST"

  Scenario Outline: Verify that user receives error when click on Run button without entering code for "Implementation Of BST" page
    Given The user is on the Try Editor page of "Implementation Of BST" page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Time Complexity Try Editor for "Implementation Of BST" page
    Given The user is on the Try Editor page of "Implementation Of BST" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Time Complexity Try Editor for "Implementation Of BST" page
    Given The user is on the Try Editor page of "Implementation Of BST" page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |

  ###### Practice Questions ########
  Scenario: Verify that user is able to navigate to " Practice Questions " page
    Given The user on the "Tree" page in Tree Data Structure
    When The user clicks " Practice Questions " link in Tree Data Structure
    Then The user should be directed to " Practice Questions " in Tree Data Structure

  Scenario: Verify that user is able to navigate to "Try Editor" page for " Practice Questions " page
    Given The user on the " Practice Questions " page in Tree Data Structure
    When The user clicks "Try Here" button in " Practice Questions " page in Tree Data Structure
    Then The user should be directed to Try Editor page to test " Practice Questions "

  Scenario Outline: Verify that user receives error when click on Run button without entering code for " Practice Questions " page
    Given The user is on the Try Editor page of " Practice Questions " page in Tree Data Structure
    When The user clicks the Run button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         4 |

  Scenario Outline: Verify that user receives error for invalid python code in Tree Data Structure Try Editor for " Practice Questions " page
    Given The user is on the Try Editor page of " Practice Questions " page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see a error message from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor alert

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         3 |

  Scenario Outline: Verify that user is able to see output for valid python code in Tree Data Structure Try Editor for " Practice Questions " page
    Given The user is on the Try Editor page of " Practice Questions " page in Tree Data Structure
    When The user enters "<Sheetname>" and <RowNumber> clicks the Run Button in Tree Data Structure tryEditor page
    Then The user should able to see output in the console from "<Sheetname>" and <RowNumber> on Tree Data Structure tryEditor page

    Examples: 
      | Sheetname | RowNumber |
      | Tree      |         1 |
      | Tree      |         2 |
