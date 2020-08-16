
//Найти max{min(a, b), min(c, d)}.


package by.epam.basic_of_software_code_development.branching;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        a = 10;
        b = 20;
        c = 30;
        d = 40;

        int min1,min2,max;

        min1 = a < b ? a : b;

        min2 = c < d ? c : d;


        if (min1>min2){

            max = min1;

        }else max=min2;

        System.out.println(max);

    }
}
