/*
 Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

package by.epam.basic_of_software_code_development.loop;

public class Task8 {
    public static void main(String[] args) {
        int a = 12;
        int b = 255;
        
        int c;
        int d;

        do {

            d = a % 10;
            a = a/10;
            c = b;

            do {
                if (c % 10 == d) {

                    System.out.println(d+" ");

                    break;
                }

                c = c / 10;

            }while (c>0);

        }while (a>0);


    }
}
