package by.epam.algorithmization.decomp;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника
public class Task3 {
    public static void main(String[] args) {

        int a = 4;
        System.out.println("Square is: " + square(a) * 6);

    }

    public static double square(int a){

        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }
}
