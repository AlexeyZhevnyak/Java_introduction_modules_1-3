package by.epam.algorithmization.decomp;
//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Task11 {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 4555;

        if (Task10.size(number1) > Task10.size(number2)){

            System.out.println("В первом числе больше");
        } else System.out.println("Во втором числе больше");


        System.out.println(Task10.size(number1) > Task10.size(number2)  ? "В первом числе больше" :
                "Во втором числе больше");

    }
}
