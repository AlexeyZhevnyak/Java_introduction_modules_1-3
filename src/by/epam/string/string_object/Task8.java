package by.epam.string.string_object;

import java.util.Scanner;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();

        String[] word = string.split(" ");
        String max = "";

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() > max.length()) max = word[i];
        }
        System.out.println(max);
    }
}
