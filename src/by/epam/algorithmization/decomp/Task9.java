package by.epam.algorithmization.decomp;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
public class Task9 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int t = 4;

        double s;

        s = first_part_of_sqr(x, y) + second_part_of_sqr(diagonal(x, y), z, t);

        System.out.println(s);
    }

    public static double diagonal(int x, int y){

        return Math.sqrt(x * x + y * y);
    }

    public static double first_part_of_sqr(int x, int y){

        return x * y * 0.5;
    }

    public static double second_part_of_sqr(double d, int z, int t){

        return 0.25*Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));
    }

}
