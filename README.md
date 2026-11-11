<img width="595" height="538" alt="Снимок экрана 2026-11-11 195248" src="https://github.com/user-attachments/assets/8f8cba43-3db7-42a9-a00d-be2af2f2707a" />
<img width="585" height="515" alt="Снимок экрана 2026-11-11 195015" src="https://github.com/user-attachments/assets/1b314e71-98b7-4984-8203-fe063dd50d97" />
<img width="521" height="436" alt="Снимок экрана 2026-11-11 194915" src="https://github.com/user-attachments/assets/411ad187-8f9d-46e9-85a8-eeff7998470a" />
<img width="780" height="535" alt="Снимок экрана 2026-11-11 194533" src="https://github.com/user-attachments/assets/2e8d61dd-eb6e-4138-a2a9-9643a56a5f45" />
# Fillword Generator

## About the Project

Fillword Generator is a Java application designed to automatically generate the structure of a fillword puzzle.

The program takes a list of Russian words and a grid size as input. It attempts to place all the words into a two-dimensional grid according to the rules of the puzzle.

The program also displays the coordinates of the letters belonging to each word.

## Project Features

- Generates a fillword grid.
- Supports grid sizes from 3x3 to 6x6.
- Accepts Russian words.
- Places words horizontally and vertically.
- Allows words to change direction.
- Prevents words from overlapping.
- Does not allow diagonal movement.
- Displays the coordinates of each word.

## Technologies Used

- Java
- Java Collections Framework
- Two-dimensional arrays
- Recursion
- Backtracking algorithm

## How It Works

The program consists of several main stages:

1. The user enters the grid size.
2. The user enters a list of Russian words.
3. The program checks the input data.
4. A two-dimensional array is created.
5. The algorithm searches for suitable positions for all words.
6. If a placement is unsuccessful, the program returns to the previous step and tries another option.
7. The program displays the completed grid and the coordinates of each word.

## Main Methods

- `main()` — handles input, validation, program initialization and output.
- `placeWord()` — searches for a starting position for the next word.
- `findPath()` — searches for a path for the letters of a word.
- `Cell` — a helper class that stores the row and column of a grid cell.

## Input Example

Grid size:
```text
5
```

Words:
```text
ловкость кнут бабочка ад гиря
```

## Output

The program displays:
- A generated grid containing all the input words.
- The coordinates of the letters of each word.

The exact arrangement of letters may vary depending on the search result.

## Algorithm

The main algorithm is Backtracking (search with backtracking).

The program tries to place words in the grid. If it cannot continue with the current arrangement, it returns to a previous step, removes the unsuccessful placement and tries another option.

This approach allows the program to search for a valid arrangement while following the puzzle rules.

## Limitations

- The program supports only grid sizes from 3x3 to 6x6.
- The search may take longer when the number of possible arrangements increases.
- A valid arrangement may not exist for every input.
- The current version does not optimize the order of word placement.

## Testing

The program was tested with different input values and scenarios.

The tests covered input validation, grid size validation, word placement, movement restrictions and coordinate output.

All conducted tests were passed successfully.

## Conclusion

As a result of this project, we developed a Java application that automatically generates the structure of a fillword puzzle.

During development, we used two-dimensional arrays, collections, recursion and the Backtracking algorithm.

The project helped us understand recursive algorithms, data validation and the process of searching for solutions under specific conditions.
<img width="780" height="535" alt="Снимок экрана 2026-11-11 194533" src="https://github.com/user-attachments/assets/404b6d14-3bf4-4a75-b784-387d5a02227c" />
<img width="521" height="436" alt="Снимок экрана 2026-11-11 194915" src="https://github.com/user-attachments/assets/d40c96f7-c83b-48a2-a2f5-b28a02fe4c2a" />
<img width="585" height="515" alt="Снимок экрана 2026-11-11 195015" src="https://github.com/user-attachments/assets/39f83f6e-27d9-4b0f-b392-8ad03e03eb19" />
<img width="595" height="538" alt="Снимок экрана 2026-11-11 195248" src="https://github.com/user-attachments/assets/eaa86ef2-08ec-49a2-9498-2480aaf70376" />
