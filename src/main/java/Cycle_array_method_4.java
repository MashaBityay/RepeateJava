import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Cycle_array_method_4 {
    Scanner in = new Scanner(System.in);
    public void Cycle_array_method_4() throws IOException {
       // Scanner in = new Scanner(System.in);
        int i = 1;
        while (i!=0){
        System.out.println("Циклы? вводи : цикл" + "\n" + "Массивы? вводи : массив" + "\n" +
                "Методы? вводи : методы");
        String operation = in.next();
        if (operation.equals("цикл")) {
            System.out.println("Введи число");
            int a = in.nextInt();
            cycle(a);
        } else if (operation.equals("массив")) {
            array();
        } else if (operation.equals("методы")) {
            System.out.println("Введите значение 1");
            int a = in.nextInt();
            System.out.println("Введите значение 2");
            int b = in.nextInt();
            Sum(a,b);
            System.out.println("Введите имя");
            String name = in.next();
            Name(name);
            int result [] = Even_numbers() ;
            System.out.println("Четные значения массива:");
            for (int c=0; c<result.length; c++) {
                System.out.print(result[c]+" ");
            }
            System.out.println(" ");
            Type_of_argument();
        }

     System.out.println("Для выхода в главное меню введите : выход. Желаете продолжить? Вводите: повтор");
    String decision = in.next();
            if(decision.equals("выход"))i=0;
            else i=1;
        }
}

    public void cycle (int a) {
        if(a<=10){
            System.out.println("Число уже меньше 10, введите другое");
           // Scanner in = new Scanner(System.in);
            a = in.nextInt();
            while (a>10) {
                System.out.println(a);
                a--;
            }
        }
        else {
            while (a>10) {
                System.out.println(a);
                a--;
            }
        }
    }

    public void array () throws IOException {
        System.out.println("Введи массив через пробел");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

            String array_0 = reader.readLine();
            String array_1 [] = array_0.split(" ");
            int array_2[] = new int[array_1.length];
            for(int i=0; i<array_2.length; i++) {
                array_2[i] = parseInt(array_1[i]);
                System.out.println("Hello "+array_2[i]);
            }
    }

    public void Sum (int a, int b) {
        System.out.println("Сумма = "+ (a+b));
    }
    public void  Name (String name) {
        if(name.equals("Маша")) System.out.println("Hello, Маша");
        else System.out.println("Ты кто вообще?");
    }
    public int [] Even_numbers() throws IOException {
        int count = 0;
        System.out.println("Введи массив через пробел");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String array_0 = reader.readLine();
        String array_1 [] = array_0.split(" ");
        int array_2[] = new int[array_1.length];
        for(int i=0; i<array_2.length; i++) {
            array_2[i] = parseInt(array_1[i]);
            if((array_2[i]%2)==0) count++;
        }
        int result[] = new int[count];
        int a = 0;
        for(int i=0; i<array_2.length; i++) {
            if((array_2[i]%2)==0) {
                result[a] = array_2[i];
                a++ ;
            }
        }
        return result;
    }

    public void Type_of_argument () {
        System.out.println("Введи символ, тип которого нужно определить:");
       String str = in.next();
        char ch = str.charAt(0);
        System.out.println((int)ch);
        if ( ((int)ch >=48) && ((int)ch<=57)) {
            System.out.println("Была введена цифра");
        }
        else if (((int)ch >=97) && ((int)ch<=154)) {
            System.out.println("Был введен символ латинского алфавита");
        }
        else if (((int)ch >=1072) && ((int)ch<=1103)) {
            System.out.println("Был введен символ русского алфавита");
        }

    }




}

