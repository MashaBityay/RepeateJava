import java.util.Scanner;

public class Exception_8 {
    Scanner in = new Scanner(System.in);
    public void division () {
        System.out.println("Введи число 1");
        int x = in.nextInt();
        System.out.println("Введи число 2");
        int y = in.nextInt();
        try {
            double a = x/y;
            System.out.println("Результат деления: "+ a);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        };
    }
}
