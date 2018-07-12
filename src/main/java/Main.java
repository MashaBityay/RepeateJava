import java.io.IOException;
import  java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Data_types_1 data_types = new Data_types_1();
        Operators_2 operators = new Operators_2();
        Compare_3 compare_3 = new Compare_3() ;
        Cycle_array_method_4 cycle_array_method_4 = new Cycle_array_method_4();
        Overload_5 overload_5 = new Overload_5();
        Encapsulation_6 encapsulation_6 = new Encapsulation_6();
        B b = new B();
        Exception_8 exception_8 = new Exception_8() ;
        System.out.println("Hello, World!");

        while (true) {
        System.out.println("Что хотим проверить?");
        System.out.println("0. Завершить работу программы" + "\n" +"1. Типы данных и арифметические операции с ними" + "\n"
                        + "2. Арифетические операторы, операторы сравнения, присвоения и логические операторы"+ "\n"
                        + "3. Сравнение строк, чисел, массивов, bool"+"\n"
                        + "4. Циклы, массивы, методы"+"\n"
                        +"5. Перегрузка методов"+"\n"
                        + "6. Инкапсуляция"+"\n"
                        + "7. Наследование"+"\n"
                        + "8. Отлов ошибки");
        int enter = in.nextInt();
        switch (enter) {
            case 1:
                data_types.Data_types();
                data_types.Arithmetic_operations();
                data_types.explicit_Conversion();
                break;
            case 2:
                operators.Calculate();
                break;
            case 3:
                try {
                    compare_3.Compare_3();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                cycle_array_method_4.Cycle_array_method_4();
                break;
            case 5:
                overload_5.Overload();
                break;
            case 6:
                encapsulation_6.Encapsulation();
                break;
            case 7:
                b.ab();
                b.bc();
                break;
            case 8:
                exception_8.division();
                break;
            case 0:
                System.exit(0);
        }

        }
    }
}
