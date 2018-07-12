
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Overload_5 {
    Scanner in = new Scanner(System.in);
    public  void Overload () {

        int i = 1 ;
        while (i != 0) {
            System.out.println("1. Ёлочки\n"+"2. Осинки\n"+"3. Рябинушка");
            System.out.println("Введи название или номер группы для просмотра ее дискографии");
            String str = in.next();
            if (str.equals("1") || str.equals("2" )|| str.equals("3")) {
                int x = parseInt(str);
                Band(x);
            }
            else if (str.equals("Ёлочки") || str.equals("Осинки" )|| str.equals("Рябинушка")) {
                Band(str);
            }
            System.out.println("Для выхода в главное меню введите : выход. Желаете продолжить? Вводите: повтор");
            String decision = in.next();
            if(decision.equals("выход")) i=0;
            else i=1;
        }
    }
    public  void Band (int x) {
        System.out.println("У группы номер "+ x + " имеются альбы следующих лет:");
        System.out.println("2001, 2002, 2003. Для подробного изучения альбома введи год:");
        int year = in.nextInt();
        String band_name = Integer.toString(x);
        Band(band_name, year);
    }
    public void Band (String x) {
        System.out.println("У группы  "+ x + " имеются альбы следующих лет:");
        System.out.println("2001, 2002, 2003. Для подробного изучения альбома введи год:");
        int year = in.nextInt();
        Band(x, year);
    }
    public void Band (String x, int y) {
            if(x.equals("1") || x.equals("Ёлочки")) {
                switch (y){
                    case 2001:
                        System.out.println("В данном альбоме следующие треки: елочки, палочки, белочки");
                        break;
                    case 2002:
                        System.out.println("В данном альбоме следующие треки: елочки 2, палочки 2, белочки 2");
                        break;
                    case 2003:
                        System.out.println("В данном альбоме следующие треки: елочки 3, палочки 3, белочки 3");
                        break;
                }
            }
            else if(x.equals("2") || x.equals("Осинки")) {
                switch (y){
                    case 2001:
                        System.out.println("В данном альбоме следующие треки: осинки, малинки, калинки");
                        break;
                    case 2002:
                        System.out.println("В данном альбоме следующие треки: осинки 2, малинки 2, калинки 2");
                        break;
                    case 2003:
                        System.out.println("В данном альбоме следующие треки: осинки 3, малинки 3, калинки 3");
                        break;
                }
            }
            else if(x.equals("3") || x.equals("Рябинушка")) {
                switch (y){
                    case 2001:
                        System.out.println("В данном альбоме следующие треки: рябинки, ягодки, грибочки");
                        break;
                    case 2002:
                        System.out.println("В данном альбоме следующие треки: рябинки 2, ягодки 2, грибочки 2");
                        break;
                    case 2003:
                        System.out.println("В данном альбоме следующие треки: рябинки 3, ягодки 3, грибочки 3");
                        break;
                }
            }
    }

    }

