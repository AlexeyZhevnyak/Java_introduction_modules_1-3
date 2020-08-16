package by.epam.algorithmization.sort;
//Даны дроби.  Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания

public class Task8 {
    public static void main(String[] args) {

        int[] p = {5,2,3,1};
        int[] q = {10,7,4,6};
        int max = 0;
        boolean isSorted = false;
        int temp;

        while(!isSorted) {

            isSorted = true;

            for (int i = 0; i < p.length - 1; i++) {

                if (p[i] > p[i + 1]) {

                    isSorted = false;

                    temp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = temp;
                }
            }
        }

        obsch_zn(p,q,4);

        for (int i = 0; i < p.length; i++) {

            System.out.println(p[i] + "/" + q[i]);
        }



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

    public static int[] obsch_zn(int[] m1, int[] m2, int n){
        int k;
        int d;

        k = NOK(m2[0], m2[1]);

        for (int i = 2; i < n; i++) {

            k = NOK(k, m2[i]);
        }

        for (int i = 0; i < n; i++) {

            d = k / m2[i];
            m1[i] = m1[i] * d;
            m2[i] = m2[i] * d;
        }
        return m2;
    }


}
