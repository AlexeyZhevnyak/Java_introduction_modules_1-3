package by.epam.string.string_object;
//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Task5 {
    public static void main(String[] args) {
        StringBuilder inf = new StringBuilder("Информатикаa");
        int count = 0;

        for (int i = 0; i < inf.length(); i++) {

            if (inf.charAt(i) == 'а' || inf.charAt(i) == 'a') count++;
        }
        System.out.println(count);
    }
}
