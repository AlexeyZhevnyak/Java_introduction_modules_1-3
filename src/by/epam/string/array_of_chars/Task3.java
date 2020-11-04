package by.epam.string.array_of_chars;
// В строке найти количество цифр.
public class Task3 {
    public static void main(String[] args) {
        String str = "I'm2 the first 1";
        char[] arr = str.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isDigit(arr[i])) count++;
        }
        System.out.println(count);
    }

    public static boolean isDigit(char ch){

        return (ch > 47) && (ch < 58);
    }


}
