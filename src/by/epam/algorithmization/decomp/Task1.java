package by.epam.algorithmization.decomp;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
// кратного двух натуральных чисел:
public class Task1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println("НОД: " + NOD(x,y));
        System.out.println("НОК: " + NOK(x,y));
    }

    public static int NOD(int a, int b) {

        while (a != b) {

            if (a > b) {

                a -= b;

            } else b -= a;

        }
        return a;
    }

    public static int NOK (int x, int y){

        return (x / NOD(x,y)) * y;
    }
}
