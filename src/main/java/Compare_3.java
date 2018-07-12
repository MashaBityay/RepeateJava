import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Compare_3 {
    Scanner in = new Scanner(System.in);
    Operators_2 operators_2 = new Operators_2() ;
    public void Compare_3 () throws IOException {
        int i = 1;
        while (i != 0) {
            System.out.println("Сравнение строк? вводи : строки" + "\n" + "Сравнение чисел? вводи : числа" + "\n" +
                    "Cравнение массивов? вводи : массивы" + "\n" + "Cравнение bool? вводи: буул =)");
            String operation = in.next();
            if ("строки".equals(operation)) {
                System.out.println("Введи месяц и будет счастье");
                String str = in.next();
                Compare_string(str);
            }
            else if (operation.equals("числа")) {
                System.out.println("Введите значение x: ");
                int first_condition = in.nextInt();
                System.out.println("Введите значение y: ");
                int second_condition = in.nextInt();
                operators_2.Compare(first_condition, second_condition);
            }
            else if(operation.equals("массивы")) {
                System.out.println("Введи массив 1 через пробел");
                BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
                String str1 = reader.readLine();
                System.out.println("Введи массив 2 через пробел");
                String str2 = reader.readLine();
                String String_mass_1 [];  String[] String_mass_2 ;
                String_mass_1 = str1.split(" ");
                String_mass_2 = str2.split(" ");
                int [] String_mass_1_1 = new int [String_mass_1.length] ;
                int [] String_mass_2_1 = new int [String_mass_2.length];
                for (int a = 0; a< String_mass_1.length; a++) {
                    String_mass_1_1[a] = parseInt(String_mass_1[a]);
                }
                for (int a = 0; a< String_mass_2.length; a++) {
                    String_mass_2_1[a] = parseInt(String_mass_2[a]);
                }
                Compate_mass(String_mass_1_1, String_mass_2_1);
            }
            else if (operation.equals("буул")) operators_2.Logical_operations();
                System.out.println("Для выхода в главное меню введите : выход. Желаете продолжить? Вводите: повтор");
                String decision = in.next();
                if(decision.equals("выход")) i=0;
                else i=1;
            }
        }


    public void Compare_string (String str){
        if (str.equals("сентябрь") || str.equals("октябрь") || str.equals("ноябрь")) System.out.println("За окном осень");
        else  if (str.equals("декабрь") || str.equals("январь") || str.equals("февраль")) System.out.println("За окном зима");
        else  if (str.equals("март") || str.equals("апрель") || str.equals("май")) System.out.println("За окном весна");
        else  if (str.equals("июнь") || str.equals("июль") || str.equals("август")) System.out.println("За окном лето");
        else System.out.println("месяц какой-то левый");
    }
    public void Compate_mass(int arr1[], int arr2[]) {
        if (arr1.length > arr2.length) System.out.println("У массива 1 больше позиций");
        else if (arr1.length==arr2.length) System.out.println("Массивы равны");
        else System.out.println("У массива 2 больше позиций");
    }

}

