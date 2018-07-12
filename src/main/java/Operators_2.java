import java.util.Scanner;

public class Operators_2 {
    Scanner in = new Scanner(System.in);
    public void Calculate () {
        int i = 1 ;
        while (i!=0) {
            System.out.println("Для проверки арифметических операций введи: посчитать ");
            System.out.println("Для проверки логических операций введи: логичить ");
            System.out.println("Для сравнения двух чисел введи: сравнить." +"\n"+"Для проверки присвоения введи: присвоить");
            String operation = in.next();
            if (operation.equals("посчитать")) {
                System.out.println("Введите значение х: ");
                int first_condition = in.nextInt();
                System.out.println("Введите значение y: ");
                int second_condition = in.nextInt();
                Operations(first_condition, second_condition);
            }
            else if (operation.equals("сравнить")) {
                System.out.println("Введите значение x: ");
                int first_condition = in.nextInt();
                System.out.println("Введите значение y: ");
                int second_condition = in.nextInt();
                Compare(first_condition, second_condition);
            }
            else if (operation.equals("присвоить")) {
                System.out.println("Введите значение x: ");
                int first_condition = in.nextInt();
                System.out.println("Введите значение y: ");
                int second_condition = in.nextInt();
                Assign(first_condition, second_condition);
            }
            else  if (operation.equals("логичить"))
                Logical_operations();
            System.out.println("Для выхода в главное меню введите : выход. Желаете продолжить? Вводите: повтор");
            String decision = in.next();
            if(decision.equals("выход")) i=0;
            else i=1;
        }
    }
    public  void Operations (int x, int y) {
        System.out.println("x + y = " + (x + y) );
        System.out.println("x - y = " + (x - y) );
        System.out.println("x * y = " + (x * y) );
        System.out.println("x / y = " + (x / y) );
        System.out.println("x % y = " + (x % y) );
        System.out.println("x ++ = " + (++x) );
        System.out.println("x -- = " + (--x) );
    }
    public  void Compare (int x, int y) {
        System.out.println("x == y = " + (x == y) );
        System.out.println("x != y = " + (x != y) );
        System.out.println("x > y = " + (x > y) );
        System.out.println("x < y = " + (x < y) );
        System.out.println("x >= y = " + (x >= y) );
        System.out.println("x <= y = " + (x <= y) );
    }
    public void Assign (int x, int y) {
        System.out.println("x = y = " + (x = y) );
        System.out.println("x += y = " + (x += y) );
        System.out.println("x -= y = " + (x -= y) );
        System.out.println("x *= y = " + (x *= y) );
        System.out.println("x /= y = " + (x /= y) );
        System.out.println("x %= y = " + (x %= y) );
    }
    public  void Logical_operations () {
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y) );
        System.out.println("x || y = " + (x || y) );
        System.out.println("!(x && y) = " + (!(x && y)) );
    }
    }


