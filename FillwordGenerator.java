import java.util.*;//Начало кода Кати Севостьяновой

public class FillwordGenerator {

    static int size;
    static char[][] grid;

    static String[] words;
    static List<List<Cell>> paths;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    // Класс для хранения координат
    static class Cell {
        int row;
        int col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод размера сетки
        System.out.println("Генератор филворда");
        System.out.print("Введите размер сетки (3, 4, 5 или 6): ");

        String input = scanner.nextLine();

        // Проверка размера
        if (!input.matches("[0-9]+")) {
            System.out.println("Ошибка! Введите целое положительное число.");
            return;
        }

        size = Integer.parseInt(input);

        if (size != 3 && size != 4 &&
                size != 5 && size != 6) {

            System.out.println("Ошибка! Можно выбрать только 3, 4, 5 или 6.");
            return;
        }

        // Ввод слов
        System.out.println("Введите слова через пробел:");
        String line = scanner.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Ошибка! Список слов пуст.");
            return;
        }

        String[] inputWords = line.split("\\s+");

        words = new String[inputWords.length];

        int totalLength = 0;

        // Проверка слов
        for (int i = 0; i < inputWords.length; i++) {

            if (!inputWords[i].matches("[А-Яа-яЁё]+")) {
                System.out.println("Ошибка! Слова должны содержать только русские буквы.");
                return;
            }

            words[i] = inputWords[i].toUpperCase();
            totalLength += words[i].length();
        }

        // Проверка количества букв
        if (totalLength != size * size) {

            System.out.println("Ошибка! Количество букв должно быть равно "
                    + (size * size) + ".");

            return;
        }

        grid = new char[size][size];

        paths = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            paths.add(null);
        }//Конец кода Екатерины Севостьяновой
//:)
        // Создание филворда Начало кода Насти Рябуха
        if (placeWord(0)) {

            System.out.println("\nФилворд создан!\n");

            System.out.println("Сетка:");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(grid[i][j] + "  ");
                }
                System.out.println();
            }

            // Вывод координат
            System.out.println("\nКоординаты слов:");

            for (int i = 0; i < words.length; i++) {

                System.out.print(words[i] + ": ");

                for (Cell cell : paths.get(i)) {
                    System.out.print("(" + (cell.row + 1)
                            + "," + (cell.col + 1) + ") ");
                }

                System.out.println();
            }

        } else {
            System.out.println("Не удалось создать филворд.");
        }

        scanner.close();
    }

    // Размещение слова
    static boolean placeWord(int wordIndex) {

        if (wordIndex == words.length) {
            return true;
        }

        String word = words[wordIndex];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (grid[i][j] == '\0') {

                    List<Cell> path = new ArrayList<>();

                    grid[i][j] = word.charAt(0);
                    path.add(new Cell(i, j));

                    if (findPath(word, wordIndex, 1,
                            i, j, path)) {
                        return true;
                    }

                    grid[i][j] = '\0';
                }
            }
        }

        return false;
    }

    // Поиск пути для букв слова
    static boolean findPath(String word, int wordIndex,
                            int position, int row, int col,
                            List<Cell> path) {

        if (position == word.length()) {

            paths.set(wordIndex, new ArrayList<>(path));

            if (placeWord(wordIndex + 1)) {
                return true;
            }

            paths.set(wordIndex, null);

            return false;
        }

        // Проверка соседних клеток
        for (int i = 0; i < 4; i++) {

            int newRow = row + dr[i];
            int newCol = col + dc[i];
            if (newRow >= 0 && newRow < size &&
                    newCol >= 0 && newCol < size &&
                    grid[newRow][newCol] == '\0') {

                grid[newRow][newCol] =
                        word.charAt(position);

                path.add(new Cell(newRow, newCol));

                if (findPath(word, wordIndex, position + 1,
                        newRow, newCol, path)) {
                    return true;
                }

                // Возврат клетки
                path.remove(path.size() - 1);
                grid[newRow][newCol] = '\0';
            }
        }

        return false;
    }
}//Конец кода Анастисии Рябуха