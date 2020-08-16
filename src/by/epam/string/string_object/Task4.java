package by.epam.string.string_object;
// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово
// “торт”.
public class Task4 {

    public static void main(String[] args) {
        StringBuilder inf = new StringBuilder("Информатика");
        StringBuilder cake = new StringBuilder();

        cake.append(inf.charAt(7))
            .append(inf.substring(3,5))
            .append(inf.charAt(7));

        System.out.println(cake);
    }
}
