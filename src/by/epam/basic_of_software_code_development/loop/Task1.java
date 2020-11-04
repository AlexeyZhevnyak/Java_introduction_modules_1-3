//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//        все числа от 1 до введенного пользователем числа.


package by.epam.basic_of_software_code_development.loop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int sum = 0;
        int enter;

      do {

             System.out.println("Enter a positive number");
             Scanner scanner = new Scanner(System.in);
             enter =  scanner.nextInt();

        } while (enter<0);


        for (int i = 1; i <=enter ; i++) {

            sum = sum+i;

        }

        System.out.println(sum);
    }
}
