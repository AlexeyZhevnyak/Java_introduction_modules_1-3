
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//        заданному е. Общий член ряда имеет вид:
package by.epam.basic_of_software_code_development.loop;

public class Task5 {
    public static void main(String[] args) {

        int e = 0;
        double sum=0;

        for (int i = 0; i <100 ; i++) {

            if (calc(i) >= e){

                sum = sum +calc(i);

            }
        }
        System.out.println(sum);

    }
    public static double calc(int n){

        return  1/Math.pow(2, n) + 1/Math.pow(3, n);

    }
}
