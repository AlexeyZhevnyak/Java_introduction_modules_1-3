package by.epam.string.string_object;

import java.util.Scanner;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".
public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder(scanner.nextLine().trim());

        for (int i = 0; i < string.length(); i++) {

            while (string.charAt(i) == ' '){

                string.deleteCharAt(i);

            }

                for (int j = i + 1; j < string.length(); j++) {

                    if (string.charAt(i) == string.charAt(j)) string.deleteCharAt(j);
                }

        }
        System.out.println(string);
    }
}
