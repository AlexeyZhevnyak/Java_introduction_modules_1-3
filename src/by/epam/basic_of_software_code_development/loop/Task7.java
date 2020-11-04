//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//        m и n вводятся с клавиатуры

package by.epam.basic_of_software_code_development.loop;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int m;
        int n;

        Scanner scannerM = new Scanner(System.in);
        m = scannerM.nextInt();


        Scanner scannerN = new Scanner(System.in);
        n = scannerN.nextInt();

        for (int i = m; i <= n ; i++) {

            System.out.println(i + ":");

            for (int j = 2; j < i ; j++) {

                if (i % j == 0){
                    System.out.println(j);
                }

            }
        }

    }
}
