package lessons;

public class Lesson2 {
    public static void main (String[] args) {

        String line = "__________________";
        int a = 5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b; //самый быстрый способ для программы
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        //Конкатенация строк
        System.out.println ("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        //Арифмитическое сложение и канкатинация
        System.out.println ("сумма переменных a + b = " + (a + b));
        System.out.println ("сумма переменных a + b = " + sumAB);
        System.out.println(a + b + " " + c); // то, что до строки - арифмитическое выражение, то, что после строки - канкатенация
        System.out.println(a + b);
        System.out.println(sumAB);


        System.out.println ("a = " + a + b); //сложились стороки, если спереди сторока, то плюсы воспринимаются как текст
        System.out.println ("a = " + a + " " + b);

        //Конкатенация строк
        System.out.println ("a = " + a + b + c);
        System.out.println ("a = " + a + " " + b + " " + c);
        System.out.println ("" + a + b + c);
        System.out.println ("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b); // строки 39,40,41 равны строке 37 по печати
        System.out.println(c);

        //Конкатенация строк
        System.out.println("Сегодня суббота");
        System.out.println("Сегодня \n cуббота"); //перенос на новую строку
        System.out.println("Сегодняcуббота");
        System.out.println("Сегодня\tcуббота"); //пробел
        System.out.println("Он сказал \"Поехали!\" и махнул рукой");

        //Арифмитическое сложение
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        //Умножение
        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        //Деление
        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);
        System.out.println(devAB);

        //Остаток от деления / Остаточное деление
        System.out.println(a % b);
        System.out.println(b % a);

        //Покажите, что 25 кратно 5
        System.out.println(25 % 5);

        //100 кратно 2
        System.out.println(100 % 2);

        //100 не кратно 3
        System.out.println(100 % 3);

        //100 не кратно 3
        System.out.println(101 % 3);

        //Унарные операторы ++ и --
        //Так не сработает System.out.println(a++);
        a++;  // это то же самое, что a + 1
        System.out.println(a);
        System.out.println(a + 1);

        b--;  // это то же самое, что b - 1
        System.out.println(b);
        System.out.println(b - 1);
    }
}
