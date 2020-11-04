package by.epam.string.string_object;
//Проверить, является ли заданное слово палиндромом.
public class Task3 {
    public static void main(String[] args) {
        String string = "ШалаШ";
        int count = 0;


        int j = string.length() - 1;
        for (int i = 0; i < string.length() ; i++) {

            if (string.charAt(i) == string.charAt(j)) {

                count++;
                j--;
            }
        }

        System.out.println(count == string.length() ? "Yes" : "No");
    }
}
