package by.epam.algorithmization.decomp;
// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
public class Task2 {
    public static void main(String[] args) {

        System.out.println(NOD(6,2,4,8));

    }


    public static int NOD(int a, int b, int c, int d) {

        while (a != b) {

            if (a > b) {

                a -= b;

            } else b -= a;

        }

        while (c != d) {

            if (c > d) {

                c -= d;

            } else d -= c;

        }

        while (a != c) {

            if (a > c) {

                a -= c;

            } else c -= a;

        }

        return a;
    }
}
