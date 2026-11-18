# Fillword Generator

## Project Description

Fillword Generator is a Java application that automatically creates a word search puzzle (fillword). The program reads words from an XML file, selects words according to the size of the grid, and places them horizontally or vertically.

## Features

- Choosing the grid size: 3×3, 4×4, 5×5 or 6×6.
- Automatically loading words from the `words.xml` file.
- Selecting words whose total length matches the number of grid cells.
- Automatically placing words into the grid.
- Finding and displaying the coordinates of each word.
- Checking whether a fillword can be generated.
- Using the Backtracking algorithm to find a suitable arrangement of words.

## Input Validation

The program includes input validation to prevent incorrect data entry:

- Negative numbers are not allowed.
- Empty input is not accepted.
- Letters are not allowed.
- Special characters are not allowed.
- Only numeric digits (0–9) can be entered.
- The grid size must be one of the available options: 3, 4, 5 or 6.

If the user enters invalid data, the program displays an error message and stops execution.

## Technologies Used

- Java
- XML
- IntelliJ IDEA
- Java Collections (`ArrayList`, `List`)
- Recursion
- Backtracking algorithm

## Project Structure

```text
FillwordGenerator/
│
├── src/
│   └── FillwordGenerator.java
│
└── words.xml
```

The `words.xml` file must be located in the project root directory, next to the `src` folder.

## Division of Work

### Katya Sevostyanova

- Importing the required libraries.
- Declaring the main variables.
- Creating the `Cell` class to store cell coordinates.
- Implementing the `loadWordsFromXml()` method to read words from the XML file.
- Implementing the `selectWords()` method to select suitable words automatically.
- Validating input data.

### Nastya Ryabukha

- Implementing the `main()` method to run the program.
- Creating and preparing the game grid.
- Implementing the `placeWord()` method to place words in the grid.
- Implementing the `findPath()` method to find a path for each letter.
- Using the Backtracking algorithm.
- Displaying the completed grid and word coordinates.

## How to Run the Program

1. Open the project in IntelliJ IDEA.
2. Make sure that the `words.xml` file is located in the project root directory.
3. Open the `FillwordGenerator.java` file.
4. Run the `main()` method.
5. Enter the desired grid size (3, 4, 5 or 6).
6. The program will automatically select words from the XML file and generate a fillword.

## Algorithm

1. The user selects the grid size.
2. The program validates the input.
3. The program loads words from the XML file.
4. It selects words whose total length matches the grid capacity.
5. An empty two-dimensional grid is created.
6. The program places words by checking neighboring cells.
7. If a suitable arrangement cannot be found, the Backtracking algorithm returns to previous steps and tries another option.
8. After successful placement, the program displays the completed grid and the coordinates of the words.

## Conclusion

The project is a Java application for automatically generating fillword puzzles. It uses XML for storing words, input validation to prevent incorrect data, recursion for finding possible paths, and the Backtracking algorithm for arranging words in the grid. The work was divided between two team members, with each responsible for different parts of the program.





