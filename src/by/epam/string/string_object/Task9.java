package by.epam.string.string_object;

import java.util.Scanner;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        int count = 0;
        int counT = 0;

        for (int i = 0; i < string.length(); i++) {

            if (Character.isLowerCase(string.charAt(i))) {
                count++;

            } else {
                if (Character.isUpperCase(string.charAt(i)))
                counT++;
            }
        }
        System.out.println("Upper case: " + counT);
        System.out.println("Lower case: " + count);
    }
}
