package by.epam.algorithmization.sort;

// Пусть даны две неубывающие последовательности действительных чисел.
//Требуется указать те места, на которые нужно вставлять элементы последовательности в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
    public static void main(String[] args) {

        printLocationInsert(new int[]{1,2,3,3,4,4,5,5,11}, new int[]{-1,3,4,4,5,5,5,6,7,7,9,9,9});
    }

    private static void printLocationInsert(int [] array1, int [] array2) {

        for (int i = 0; i < array1.length; i++) {

            boolean flagIns = true;

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] < array2[j]) {

                    System.out.printf("%d елемент первого масс. вставим до %d элем. второго\n", i, j);
                    flagIns = false;
                    break;
                }
            }

            if (flagIns)
                System.out.printf("%d елемент первого масс. вставим после последенго элем. второго\n", i);
        }
    }
}

