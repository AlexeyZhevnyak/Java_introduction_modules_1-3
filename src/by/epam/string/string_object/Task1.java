package by.epam.string.string_object;
//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
public class Task1 {
    public static void main(String[] args) {
        String value = " I'm      free          ";
        int max = 0;
        int count = 0;

        for (int i = 0; i < value.length(); i++) {

            if (value.charAt(i) == ' '){

                count++;
                if (count > max) max = count;

            } else count = 0;

        }

        System.out.println(max);
    }
}
