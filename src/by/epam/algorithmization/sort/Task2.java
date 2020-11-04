package by.epam.algorithmization.sort;
// Даны две последовательности a1 < a2< ... и  b1 < b2 <...
// . Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать
public class Task2 {
    public static void main(String[] args) {
        int[] first_arr = {1, 2, 7, 8};
        int[] sec_arr = {3, 4, 6, 8};
        int[] final_arr = new int[first_arr.length + sec_arr.length];

        boolean isSorted = false;
        int buf;

        System.arraycopy(first_arr,0,final_arr,0,first_arr.length);

        System.arraycopy(sec_arr,0,final_arr,first_arr.length,sec_arr.length);

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < final_arr.length-1; i++) {
                if(final_arr[i] > final_arr[i+1]){
                    isSorted = false;

                    buf = final_arr[i];
                    final_arr[i] = final_arr[i+1];
                    final_arr[i+1] = buf;
                }
            }
        }

        for (int value : final_arr) {

            System.out.println(value);
        }

    }
}
