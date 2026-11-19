import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class FillwordGenerator {

    static int size;
    static char[][] grid;

    static String[] words;
    static List<List<Cell>> paths;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static class Cell {
        int row;
        int col;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static List<String> loadWordsFromXml() {

        List<String> dictionary = new ArrayList<>();

        try {
            File file = new File("words.xml");

            DocumentBuilderFactory factory =
                    DocumentBuilderFactory.newInstance();

            DocumentBuilder builder =
                    factory.newDocumentBuilder();

            Document document = builder.parse(file);

            document.getDocumentElement().normalize();
            
            NodeList list =
                    document.getElementsByTagName("элемент");
            
            if (list.getLength() == 0) {
                list = document.getElementsByTagName("item");
            }

            for (int i = 0; i < list.getLength(); i++) {

                String word = list.item(i).getTextContent()
                        .trim().toUpperCase();

                if (word.matches("[А-ЯЁ]+")) {
                    dictionary.add(word);
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка чтения файла words.xml.");
            System.out.println("Проверьте расположение и формат файла.");
        }

        return dictionary;
    }
    
    static String[] selectWords(List<String> dictionary,
                                int target) {

        List<String> candidates =
                new ArrayList<>(new HashSet<>(dictionary));
        
        candidates.removeIf(word -> word.length() > target);
        
        Collections.shuffle(candidates);

        boolean[] dp = new boolean[target + 1];

        int[] previousSum = new int[target + 1];
        int[] previousWord = new int[target + 1];

        Arrays.fill(previousWord, -1);

        dp[0] = true;
        
        for (int i = 0; i < candidates.size(); i++) {

            int length = candidates.get(i).length();

            for (int j = target; j >= length; j--) {

                if (!dp[j] && dp[j - length]) {

                    dp[j] = true;
                    previousSum[j] = j - length;
                    previousWord[j] = i;
                }
            }

            if (dp[target]) {
                break;
            }
        }
        
        if (!dp[target]) {
            return null;
        }
        
        List<String> selected = new ArrayList<>();

        int sum = target;

        while (sum > 0) {

            int index = previousWord[sum];

            if (index == -1) {
                return null;
            }

            selected.add(candidates.get(index));

            sum = previousSum[sum];
        }
        
        selected.sort((a, b) ->
                Integer.compare(b.length(), a.length()));

        return selected.toArray(new String[0]);
    }
//конец кода Кати    
// начало кода Насти
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Генератор филворда");
        System.out.print("Введите размер сетки (3, 4, 5 или 6): ");

        String input = scanner.nextLine();
        
        if (!input.matches("[0-9]+")) {
            System.out.println("Ошибка! Введите целое положительное число.");
            scanner.close();
            return;
        }

        size = Integer.parseInt(input);

        if (size != 3 && size != 4 &&
                size != 5 && size != 6) {

            System.out.println("Ошибка! Можно выбрать только 3, 4, 5 или 6.");
            scanner.close();
            return;
        }
        
        List<String> dictionary = loadWordsFromXml();

        if (dictionary.isEmpty()) {
            System.out.println("Ошибка! Словарь пуст или файл не прочитан.");
            scanner.close();
            return;
        }

        System.out.println("Слов в словаре: " + dictionary.size());
        
        boolean created = false;

        for (int attempt = 0; attempt < 100; attempt++) {

            words = selectWords(dictionary, size * size);

            if (words == null) {
                System.out.println("Не удалось подобрать слова для этой сетки.");
                break;
            }

            grid = new char[size][size];

            paths = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                paths.add(null);
            }

            if (placeWord(0)) {
                created = true;
                break;
            }
        }
        
        if (created) {

            System.out.println("\nФилворд создан!\n");

            System.out.println("Выбранные слова:");

            for (String word : words) {
                System.out.println(word);
            }

            System.out.println("\nСетка:");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(grid[i][j] + "  ");
                }
                System.out.println();
            }
            
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
                path.remove(path.size() - 1);
                grid[newRow][newCol] = '\0';
            }
        }

        return false;
    }
}
// Конец кода Насти
