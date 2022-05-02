package homework;

public class HW3 {

    public static void main (String[] args) {

        System.out.println("Задача № 2");
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
        byte a = 24;
        byte b = 12;
        String line = "_____________________________";
        String line2 = "______________________________________________";

        System.out.println(a);
        System.out.println(b);

        System.out.println("Задача № 3");
        //Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
        // 1 способ
        short s = -30000;
        short t = 30000;

        System.out.println(s - t);

        System.out.println("Задача № 4");
        /*
        Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы
        */
        int i = Integer.MIN_VALUE;

        System.out.println(line);
        System.out.println("|\tint min |\t" + i + " |"); // \t выравнивание строчки
        System.out.println(line);

        i = Integer.MAX_VALUE;
        System.out.println("|\tint max |\t" + i + "  |");
        System.out.println(line);

        System.out.println("Задача № 5");
        /*
        Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и
        города (можно ненастоящий номер телефона, например, 18009998877)
        */
        long phoneNumber = 89314747746L;
        System.out.println(phoneNumber);

        System.out.println("Задача № 6");
        /*
        Создать переменную f типа float и присвоить ей значение 100.101101.
        Создать переменную d типа double и присвоить ей значение 100.101101.
        Распечатать результат в виде таблицы
        */
        float f = 100.101101F;   //неточный вывод числа, редко используется
        double d = 100.101101;   // более точный вывод, лучше использовать его для дробных чисел
        //распечатываю табличку в следующем задании

        System.out.println("Задача № 7");
        /*
        A
        Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         */
        Double dd = 10.09999 + 20.09999;

        /*
        B
        Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         */
        Float ff = 10.09999F + 20.099999F;

        System.out.println("_________________________________________________________");
        System.out.println("| float f = 100.101101 " + "             | " + f + "        |");    //Задание 6
        System.out.println("_________________________________________________________");
        System.out.println("| double d = 100.101101 " + "            | " + d + "        |");    //Задание 6
        System.out.println("_________________________________________________________");
        System.out.println("| Double dd = 10.09999 + 20.09999 " + "  | " + dd + "|");           //Задание 7a
        System.out.println("_________________________________________________________");
        System.out.println("| Float ff = 10.09999F + 20.099999F " + "| " + ff + "          |"); //Задание 7б
        System.out.println("_________________________________________________________");

        System.out.println("Задача № 8");
        /*
        Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
        */
        double result = 10.0 / 3;  //добавила точку и 0
        System.out.println(result);

        System.out.println("Задача № 9");
        /*
        Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d
        */
        double sum = f + d;            //сумма
        double product = f * d;        //произведение
        double quotient = f / d;       //частое
        double remainder  = f % d;     //остаток
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        System.out.println("Задача № 10");
        /*
        Распечатать слово HELLO точками
         */
        System.out.println(". . ... .   .   ...");
        System.out.println(". . .   .   .   . .");
        System.out.println("... ... .   .   . .");
        System.out.println(". . .   .   .   . .");
        System.out.println(". . ... ... ... ...");


        System.out.println("Задача № 11");
        /*
        Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        Распечатать значения всех переменных.
        */

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println("Задача № 12");
        /*
        С помощью полей классов ссылочного типа распечатать таблицу:
        */

        //1 способ

        /*
        byte ByteTape = Byte.TYPE;
        byte ByteSize = Byte.SIZE;
        byte ByteMin = Byte.MIN_VALUE;
        byte ByteMax = Byte.MAX_VALUE;
        short ShortSize = Short.SIZE;
        short ShortMin = Short.MIN_VALUE;
        short ShortMax = Short.MAX_VALUE;
        int IntSize = Integer.SIZE;
        int IntMin = Integer.MIN_VALUE;
        int IntMax = Integer.MAX_VALUE;
        float FloatSize = Float.SIZE;
        float FloatMin = Float.MIN_VALUE;
        float FloatMax = Float.MAX_VALUE;
        double DoubleSize = Double.SIZE;
        double DoubleMin = Double.MIN_VALUE;
        double DoubleMax = Double.MAX_VALUE;

        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("| Type  | Size in bits |    min    |    max   |     ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("| byte  |  " + ByteSize + "    |  " + ByteMin + "  |  " + ByteMax + "  |         ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("| short |  " + ShortSize + "   |  " + ShortMin + "  |  " + ShortMax + "  |       ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("|  int  |  " + IntSize + "     |  " + IntMin + "  |  " + IntMax + "  |           ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("| float |  " + FloatSize + "  |    " + FloatMin + "  |  " + FloatMax + "  |           ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        System.out.println("| double|  " + DoubleSize + "    |      " + DoubleMin + "  |  " + DoubleMax + "  |  ");
        System.out.println("|-------|--------|-----------------|---------------------|");
        */

      //2 способ
/*
        int type;
        int Size;
        int Min;
        int Max;

        System.out.println(line2);
        System.out.println(" | " + type + " | " + Size + " | " + Min +  " | " + Max + " | ");
        System.out.println(line2);
        System.out.println(" | " + Byte.TYPE + " | " + Byte.SIZE + " | " + Byte.MIN_VALUE +  " | " + Byte.MIN_VALUE + " | ");
*/

        System.out.println("Задача № 13");
        /*
        Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
        сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
        “Если num1 = num2, то результат сравнения методом .equal = …”

        Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
        “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        Integer num1 = 10;
        Integer num2 = 10;
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 13;
        num2 = 25;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        System.out.println("Задача № 14");
        /*
        Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
        а) одинаковыми значениями
        b) number1 < number2
        c) number1 > number2
        сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет), и вывести результаты сравнения
        на печать в виде выражений:
        “Если number1 = number2, то результат сравнения методом … = …”
        “Если number1 < number2, то результат сравнения методом … = …”
        “Если number1 > number2, то результат сравнения методом … = …”
         */
        int number1 = 10;
        int number2 = 10;
        System.out.println("Если number1 = number2, то результат сравнения методом Integer.compare(number1, number2) = " +
                + Integer.compare(number1, number2));

        int number3 = 13;
        System.out.println("Если number1 < number3, то результат сравнения методом Integer.compare(number1, number3) = " +
                + Integer.compare(number1, number3));

        int number4 = 5;
        System.out.println("Если number1 > number4, то результат сравнения методом Integer.compare(number1, number4) = " +
                + Integer.compare(number1, number4));



        System.out.println("Задача № 15");
        /*
        Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */
        Float rrr = 234.9999F;
        System.out.println("rrr = " +rrr.intValue());


        System.out.println("Задача № 16");
        /*
        С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        Double rr1 = 1234.12345678;
        Double rr = 9876.987654321;
        System.out.println("Сумма двух переменных типа Double = " + Double.sum(rr1,rr));

        System.out.println("Задача № 17");
        /*
        С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
        */
        Float a1 = 100.56F;
        Float b1 = 150.56F;
        System.out.println("Сумма двух переменных типа Float = "+ Integer.sum(a1.intValue(),b1.intValue()));

        System.out.println("Задача № 18");
        /*
        Создать 2 переменные типа Short:
        short1 = 12000
        short2 = 12300
        а) Распечатать фразу:
        “12000 - 12300 = -300”
        где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
        б) Присвоить переменной short1 значение 12500, вывести фразу:
        “12500 - 12300 = 200”
        где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));

        System.out.println("Задача № 19");
        /*
        Создать переменные:
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Распечатать результат doub1 - doub2
        Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */

        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println(Double.compare(doub1,doub2));

        String str1 = "123.56";
        String str2 = "123.55";
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println("Задача № 20");
        /*
        Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
        (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
        затем минимальное значение. Посчитать и распечатать среднее значение, округленное с помощью метода класса Math.
        Распечатать результат среднего значения температуры тела кота.
         */

        Double tem = 40.5;   // max температура
        Double average = tem;
        tem = 35.6;          //min температура - это перезапись переменной
        average = (average + tem)/2;
        System.out.println("Средняя температура кота = " + Math.round(average));

        System.out.println("Задача № 21");
        /*
        Создать переменную n типа Number, присвоить ей максимально возможное значение.
        Присвоить n значение 10,
        затем присвоить n значение 10.999999999.
        Распечатать результаты в виде выражения:
        “Переменная n может принимать значения:
        n =  …
        n =  …
        n =  …
        Это возможно, потому что …”
         */

        System.out.println("Переменная n может принимать значения:");
        Number n = Double.MAX_VALUE;
        System.out.println("n = " +n);
        n = 10;
        System.out.println("n = " + n);
        n = 10.999999999;
        System.out.println("n = " +n);
        System.out.println("Это возможно, потому что в Double.MAX_VALUE помещаются все значения");

        System.out.println("Задача № 22");
        /*
        Создать переменную Integer numberInteger = 100.
        Доказать, что numberInteger имеет тип Integer,
        а numberInteger.toString() имеет тип String.
        */
        Integer numberInteger = 100;
        System.out.println(numberInteger + 20);
        System.out.println(numberInteger.toString() + 20);

        System.out.println("Задача № 23");
        /*
        Вывести на экран следующие выражения, используя для печати только переменные:
       “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту должно быть вычислено по формуле
       “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */
        double gradC = 36.6 ;
        double gradF = gradC * 1.8 + 32;
        double kg = 50;
        double lbs = kg * 2.205;
        double lbs1 = 50;
        double kg1 = lbs1 * 0.45359293319936;

        System.out.println("36.6 градусов по Цельсию  = " + gradF + "градусов по Фаренгейту"
                + "\n 50 kilogram = " + lbs + "lbs, 50 lb = "+ kg1 + " kg");


    }
}
