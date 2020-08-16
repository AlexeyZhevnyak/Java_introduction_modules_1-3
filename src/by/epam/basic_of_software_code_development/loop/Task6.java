
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

package by.epam.basic_of_software_code_development.loop;

public class Task6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {

            System.out.println("Код " + i + ", символ " + (char)i);

        }

    }
}
