package by.epam.string.array_of_chars;
// В строке найти количество чисел
public class Task4 {
    public static void main(String[] args) {
        String str = "I'm22 the first 11";
        char[] arr = str.toCharArray();
        int count = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            if (Task3.isDigit(arr[i - 1]) && !Task3.isDigit(arr[i + 1])) count++;
        }

        System.out.println(count);
    }
}
