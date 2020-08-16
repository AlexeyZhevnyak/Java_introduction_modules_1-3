
/*
Вычислить значения функции на отрезке [а,b] c шагом h.
 */

package by.epam.basic_of_software_code_development.loop;

public class Task2 {

    public static void main(String[] args) {
        int h = 1;
        int a = 2;
        int b = 10;
        int y = 0;


        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
        }
        System.out.println(y);

    }
}
