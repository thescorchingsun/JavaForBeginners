package homework;

import java.sql.SQLOutput;

public class HW2 {

    public static void main (String[] args) {

        //Part2
        System.out.println("Задача № 11");
        //Создать целочисленные переменные k, l, m и присвоить им значения на ваше усмотрение

        int k = 5;
        int l = 10;
        int m = 15;
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;

        System.out.println("Задача № 12");
        // значения переменных в столбик
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.println("Задача № 13");
        // значения переменных в строчку
        System.out.println(k + " " + l + " " + m);

        System.out.println("Задача № 14");
        //Используя конкатенацию, вывести значения переменных в строку через запятую
        System.out.println(k + ", " + l + ", " + m);

        System.out.println("Задача № 15");
        //Вывести значения переменных так, чтобы было понятно, какое значение к какой переменной относится
        System.out.println("int a = " + k);
        System.out.println("int a = " + l);
        System.out.println("int a = " + m);

        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = "  + multKM);
        System.out.println("Разность l и m = " + subLM);

        System.out.println("Задача № 16");
        //Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        //Sum of k and l = …
        //k * m = …
        //Разность переменных l и m = …

        int devKL = k / l;
        int remainderKL = k % l;
        int devKM = k / m;
        int remainderKM = k % m;
        int devLM = l / m;
        int remainderLM = l % m;
        int devMK = m / k;
        int remainderMK = m % k;
        int devLK = m / k;
        int remainderLK = l % k;
        int devML = m / l;
        int remainderML = m % l;

        System.out.println("Задача № 17");
        //Распечатать следующие выражения:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        //
        //продолжить со всеми возможными вариантами

        System.out.println("Результат деления k на l = " + devKL + ", а остаток от деления  = " + remainderKL);
        System.out.println("Результат деления k на m = " + devKM + ", а остаток от деления  = " + remainderKM);
        System.out.println("Результат деления l на m = " + devLM + ", а остаток от деления  = " + remainderLM);
        System.out.println("Результат деления l на k = " + devLK + ", а остаток от деления  = " + remainderLK);
        System.out.println("Результат деления m на l = " + devML + ", а остаток от деления  = " + remainderML);
        System.out.println("Результат деления m на k = " + devMK + ", а остаток от деления  = " + remainderMK);

        System.out.println("Задача № 18");
        //Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
        //Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        //
        //Распечатать это же выражение со значениями 100 и 21.

        int apple = 40;
        int student = 6;
        int devAppleStudent = apple / student;
        int remainderAppleStudent = apple % student;

        int apple2 = 100;
        int student2 = 21;
        int devAppleStudent2 = apple2 / student2;
        int remainderAppleStudent2 = apple2 % student2;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый ученик получит по " + devAppleStudent + " яблок(a), и "
                + remainderAppleStudent + " яблок(а) останется учителю.");

        System.out.println("Если " + apple2 + " яблок поделить на " + student2
                + " учеников, то каждый ученик получит по " + devAppleStudent2 + " яблок(a), и "
                + remainderAppleStudent2 + " яблок(а) останется учителю.");



        System.out.println("Задача № 19");
        //Распечатать вычисления и итоговый результат:
        //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …

       int sumKLM = k + l + m; //30
       int sumLKM = l + k + m; //30

        m++;
        sumKLM--;
                                     //5+10+(15+1)+(30-1)
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (k + l + m + sumKLM)
                + ", а разность m++ и  sumLKM =" + (m - sumLKM));
                                     //(15+1)-30=14


        System.out.println("Задача № 20");
        //Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
        System.out.println(48 % 8);
        System.out.println(47 % 8);
        System.out.println(49 % 8);

        /* Part 3
        Для всех заданий:
        x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
        a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
        result21, result22 и result23 - результаты вычислений в каждом выражении
        (считать с помощью программы, а не вручную!)
        */

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        System.out.println("Задача № 21");

        System.out.println("(x + 3) * (x + 3)");
        int Result21 = (x + 3) * (x + 3);
        System.out.println(Result21);

        System.out.println("((3 + 4 * x) / 5) - (((10 * (y - 5)) * (a +b + c) )/ x) + 9 * ((4 / x) + ((9 + x ) / y))");
        int Result22 = ((3 + 4 * x) / 5) - (((10 * (y - 5)) * (a +b + c) )/ x) + 9 * ((4 / x) + ((9 + x ) / y));
        System.out.println(Result22);


       // System.out.println("((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y)) "
       //         + " / (a + b + (c / d) + ((a + b)/(c + d)) + a * b)");

       // Ошибка т.к. нельзя делить на 0 int Result23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) / (x + y))
       //        / (a + b + (c / d) + ((a + b) / (c + d)) + a * b));


    }
}
