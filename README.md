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
<img width="452" height="165" alt="Снимок экрана 2026-11-18 182057" src="https://github.com/user-attachments/assets/7d804f63-469a-4947-872f-c6ac1923249d" />
<img width="456" height="204" alt="Снимок экрана 2026-11-18 182034" src="https://github.com/user-attachments/assets/cfc6ecc3-f592-457d-b313-734af70bc066" />
<img width="522" height="203" alt="Снимок экрана 2026-11-18 182025" src="https://github.com/user-attachments/assets/9e370d9c-dbed-423a-b194-5ae8e2c7b8bc" />
<img width="443" height="196" alt="Снимок экрана 2026-11-18 182000" src="https://github.com/user-attachments/assets/0c015d8b-8adb-4c12-8c0b-52bd489743b6" />
<img width="426" height="199" alt="Снимок экрана 2026-11-18 181946" src="https://github.com/user-attachments/assets/c2169641-1ef6-43b1-b664-aa71083b6924" />
<img width="452" height="194" alt="Снимок экрана 2026-11-18 181933" src="https://github.com/user-attachments/assets/155fa0a7-f89d-4f17-afe2-c8b991298e04" />


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
   <img width="798" height="812" alt="Снимок экрана 2026-11-18 181919" src="https://github.com/user-attachments/assets/a46edb4b-8fee-4bf6-9b81-f58dbe82751c" />
<img width="660" height="603" alt="Снимок экрана 2026-11-18 181905" src="https://github.com/user-attachments/assets/d9f0062a-dbc9-4c8c-b526-cb85eaec923d" />
<img width="701" height="578" alt="Снимок экрана 2026-11-18 181848" src="https://github.com/user-attachments/assets/5eec42fb-7c9e-4ad8-9da5-918cd2612c69" />
<img width="599" height="464" alt="Снимок экрана 2026-11-18 181821" src="https://github.com/user-attachments/assets/3d1b81d2-6285-45c6-b019-e9b1cca3cb43" />


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





