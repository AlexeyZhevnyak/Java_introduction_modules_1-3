//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

package by.epam.basic_of_software_code_development.branching;

public class Task3 {
    public static void main(String[] args) {
        int x1=1;
        int y1=2;
        int x2=3;
        int y2=90;
        int x3=5;
        int y3=6;


        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){

            System.out.println(true);

        } else System.out.println(false);



    }
}
