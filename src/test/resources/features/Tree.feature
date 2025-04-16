Feature: Tree Datastructure

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in TreePanel
    Then The user be directed to "TREE" Data Structure Page

  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user select Tree item from the drop down menu
    Then The user be directed to "TREE" Data Structure Page

  Scenario: Verify that user is able to navigate to "Overview of Trees" page
    Given The user is in the Home page after Sign in
    When The user clicks "Overview of Trees" button
    Then The user should be redirected to "Overview of Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Overview of Trees" page
    Given The user is on the Overview of Trees page
    When The user clicks "Try Here" button in Overview of Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Overview of Trees" page
    Given The user is in the Overview of Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Terminologies" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Terminologies" button
    Then The user should be redirected to "Terminologies" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Terminologies" page
    Given The user is on the Terminologies page
    When The user clicks "Try Here" button in Terminologies page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Terminologies" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Terminologies " page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Terminologies" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page from "Terminologies" page
    Given The user is in the Terminologies page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Types of Trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Types of Trees" button
    Then The user should be redirected to "Types of Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Trees" page
    Given The user is on the Types of Trees page
    When The user clicks "Try Here" button in Types of Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Trees" page
    Given The user is in the Types of Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Tree Traversals" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Tree Traversals" button
    Then The user should be redirected to "Tree Traversals" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Tree Traversals" page
    Given The user is on the Tree Traversals page
    When The user clicks "Try Here" button in Tree Traversals page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Tree Traversals" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Tree Traversals" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Traversals-Illustration" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Traversals-Illustration" button
    Then The user should be redirected to "Traversals-Illustration" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Traversals-Illustration" page
    Given The user is on the Traversals-Illustration page
    When The user clicks "Try Here" button in Traversals-Illustration page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Traversals-Illustration" page
    Given The user is in the Traversals-Illustration page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Binary Trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Binary Trees" button
    Then The user should be redirected to "Binary Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Binary Trees" page
    Given The user is on the Binary Trees page
    When The user clicks "Try Here" button in Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Binary Trees" page
    Given The user is in the Binary Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Types of Binary Trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Types of Binary Trees" button
    Then The user should be redirected to "Types of Binary Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Binary Trees" page
    Given The user is on the Types of Binary Trees page
    When The user clicks "Try Here" button in Trees in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Types of Binary Trees page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Types of Binary Trees page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Binary Trees" page
    Given The user is in the Types of Binary Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Implementation in Python" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Implementation in Python" button
    Then The user should be redirected to "Implementation in Python" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation in Python page
    Given The user is on the Implementation in Python page
    When The user clicks "Try Here" button in Trees in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation in Python page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Implementation in Python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Implementation in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation in Python page
    Given The user is in the Implementation in Python page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Binary Tree Traversals" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Binary Tree Traversals" button
    Then The user should be redirected to "Binary Tree Traversals" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Binary Tree Traversals" page
    Given The user is on the Binary Tree Traversals page
    When The user clicks "Try Here" button in Binary Tree Traversals page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Binary Tree Traversals" page
    Given The user is in the Binary Tree Traversals page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Implementation of Binary Trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Implementation of Binary Trees" button
    Then The user should be redirected to "Implementation of Binary Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of Binary Trees" page
    Given The user is on the Implementation of Binary Trees page
    When The user clicks "Try Here" button in Implementation of Binary Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of Binary Trees" page
    Given The user is in the Implementation of Binary Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Applications of Binary trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Applications of Binary trees" button
    Then The user should be redirected to "Applications of Binary trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Binary trees" page
    Given The user is on the Applications of Binary trees page
    When The user clicks "Try Here" button in Applications of Binary trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Binary trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Applications of Binary trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Applications of Binary trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications of Binary trees" page
    Given The user is in the Applications of Binary trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Binary Search Trees" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Binary Search Trees" button
    Then The user should be redirected to "Binary Search Trees" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Binary Search Trees" page
    Given The user is on the Binary Search Trees page
    When The user clicks "Try Here" button in Binary Search Trees page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Binary Search Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Binary Search Trees page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Binary Search Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Binary Search Trees" page
    Given The user is in the Binary Search Trees page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice

  Scenario: Verify that user is able to navigate to "Implementation Of BST" page
    Given The user is in the Tree page after Sign in
    When The user clicks "Implementation Of BST" button
    Then The user should be redirected to "Implementation Of BST" page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation Of BST page
    Given The user is on the Implementation Of BST page
    When The user clicks "Try Here" button in Implementation Of BST page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation Of BST" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  Scenario: Verify that user receives error for invalid python code for "Implementation Of BST" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window

  Scenario: Verify that user is able to see output for valid python code for "Implementation Of BST" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation Of BST" page
    Given The user is in the Implementation Of BST page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page with links to pratice
