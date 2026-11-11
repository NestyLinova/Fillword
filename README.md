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
<img width="437" height="212" alt="Снимок экрана 2026-11-11 194850" src="https://github.com/user-attachments/assets/6299c6e0-92ac-460a-a08b-c750c9e75ca9" />
<img width="453" height="196" alt="Снимок экрана 2026-11-11 194811" src="https://github.com/user-attachments/assets/e88ce448-9ed8-47c8-b033-b0047ef42b9e" />
<img width="481" height="223" alt="Снимок экрана 2026-11-11 194750" src="https://github.com/user-attachments/assets/17269df4-64e2-4d4d-9faa-3afb1b556224" />
<img width="368" height="194" alt="Снимок экрана 2026-11-11 194735" src="https://github.com/user-attachments/assets/88b79b13-1893-4bb0-a598-03f09519d936" />
<img width="386" height="165" alt="Снимок экрана 2026-11-11 194716" src="https://github.com/user-attachments/assets/b051bb50-9c71-4629-93e6-e5d76aa0d56b" />
<img width="383" height="166" alt="Снимок экрана 2026-11-11 194704" src="https://github.com/user-attachments/assets/d14c82d5-08e3-4624-a79a-160d32450e9d" />
<img width="398" height="170" alt="Снимок экрана 2026-11-11 194645" src="https://github.com/user-attachments/assets/341f278b-8f30-493f-9935-ee4d456b3af1" />
<img width="367" height="154" alt="Снимок экрана 2026-11-11 194629" src="https://github.com/user-attachments/assets/5f054dab-b2e1-4b49-9a10-0501df188cff" />
<img width="367" height="165" alt="Снимок экрана 2026-11-11 194606" src="https://github.com/user-attachments/assets/2069c9a6-cb12-471d-b72e-1dee4528b2e1" />
<img width="407" height="195" alt="Снимок экрана 2026-11-11 194550" src="https://github.com/user-attachments/assets/a9867de5-1960-4b55-b02d-2fe09cd12a7d" />


## Conclusion

As a result of this project, we developed a Java application that automatically generates the structure of a fillword puzzle.

During development, we used two-dimensional arrays, collections, recursion and the Backtracking algorithm.

The project helped us understand recursive algorithms, data validation and the process of searching for solutions under specific conditions.
<img width="780" height="535" alt="Снимок экрана 2026-11-11 194533" src="https://github.com/user-attachments/assets/404b6d14-3bf4-4a75-b784-387d5a02227c" />
<img width="521" height="436" alt="Снимок экрана 2026-11-11 194915" src="https://github.com/user-attachments/assets/d40c96f7-c83b-48a2-a2f5-b28a02fe4c2a" />
<img width="585" height="515" alt="Снимок экрана 2026-11-11 195015" src="https://github.com/user-attachments/assets/39f83f6e-27d9-4b0f-b392-8ad03e03eb19" />
<img width="595" height="538" alt="Снимок экрана 2026-11-11 195248" src="https://github.com/user-attachments/assets/eaa86ef2-08ec-49a2-9498-2480aaf70376" />
