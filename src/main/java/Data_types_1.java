class Data_types_1 {
    byte a = 0;
    short b = 10;
    int c = 126;
    long d = 150546549;
    float e = 55687978;
    double f = 78.653;
    char g = '$';
    boolean k = true;
    public void Data_types () {
    System.out.println("byte = "+a + "\n"+"short = "+b + "\n" +"int = "+c + "\n" +
            "long = "+d + "\n" + "float = "+e + "\n" + "double = "+f + "\n" +
            "char = "+g+ "\n" + "short = "+k + "\n");
    }

    public void Arithmetic_operations () {
        System.out.println("Вычитание из byte int: "+(a-b));
        System.out.println("Сложение short и long: "+(b+d));
        System.out.println("Сложение int и double: "+(c+f));
        System.out.println("Деление float на long: "+(e/d));
        System.out.println("Умножение из byte на int: "+(a*c));
    }

    public void explicit_Conversion () {
        byte a1 = (byte) c ;
        System.out.println("int->byte"+a1);
    }
}