
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//        он прямоугольным.


package by.epam.basic_of_software_code_development.branching;

public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;


        a = 10;
        b = 20;
        c = 180 - a - b;

        if (c>0){

            System.out.println("This triangle exist");

        }else{

            System.out.println("This triangle isn't exist");
            System.exit(1);
        }


        if (c==90){
            System.out.println("This rectangle is rectangular");
        }


    }
}
