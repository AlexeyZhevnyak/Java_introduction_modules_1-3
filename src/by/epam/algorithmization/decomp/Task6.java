package by.epam.algorithmization.decomp;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Task6 {
    public static void main(String[] args) {
        if (Task1.NOD(Task1.NOD(6, 2), 4) == 1){

            System.out.println("Являются");
        } else System.out.println("Не являются");
    }
}
