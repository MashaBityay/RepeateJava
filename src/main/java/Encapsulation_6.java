import java.util.Scanner;

public class Encapsulation_6 {

    public  void Encapsulation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число 1");
        int a = in.nextInt();
        System.out.println("Введи число 2");
        int b = in.nextInt();
        System.out.println("Сумма = "+ Sum(a,b));
    }
    private int Sum (int a, int b) {
        return a+b;
    }
}
