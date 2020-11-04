package by.epam.algorithmization.decomp;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
public class Task15 {
    public static void main(String[] args) {
        int n = 3;
        int a = 0, b = 0, k = 1;

        for (int i = 0; i < n; i++)
        {

            a += (n - i) * k;
            b += (9 - i) * k;
            k *= 10;

        }

        Step2(a, b, k, n);

    }


    public static void Step2(int a, int b, int k, int n){

        for (int i = a; i <= b; i++)
        {

            k = i;
            int d = k % 10, j;

            for (j = 1; j < n; j++)
            {

                k /= 10;
                if (k % 10 >= d) break;
                d = k % 10;
            }

            if (j == n) System.out.println(i);
        }

    }
}
