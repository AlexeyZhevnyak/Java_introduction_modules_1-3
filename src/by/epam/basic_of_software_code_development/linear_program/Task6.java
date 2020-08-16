
//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//        принадлежит закрашенной области, и false — в противном случае:

package by.epam.basic_of_software_code_development.linear_program;

public class Task6 {
    public static void main(String[] args) {

        int x;
        int y;

        x = -2;
        y = 0;


        if ((-4<=x && x<=4 && y>=-3 && y<=0) ||(x>=-2 && x<=2 && y>=0 && y<=4) ){

            System.out.println(true);

        }else{

            System.out.println(false);

        }
    }
}
