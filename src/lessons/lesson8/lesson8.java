package lessons.lesson8;

import utils.Utils;

import static utils.Utils.*;
//меньшего кол-ва строк кода

public class lesson8 {

    public static void main (String[] args){


        //три разных варианта создания массива (обьекта)
        int[] arr = new int[] {1, 2, 3}; //9 и 10 одинаковые записи
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[0]; //12 и 13 одинаковые записи
        int[] arr3 = {};

        int[] arr4 = new int[1]; //15 и 16 одинаковые записи
        int[] arr5 = {0};

        int[] arr6 = new int[3]; //18 и 19 одинаковые записи
        int[] arr7 = {0, 0, 0};

        //Примитивный тип данных, быстро работает
        int a = 4; //внутри pool
        double b = 5.5;


        //Все типы данных, написанных с большой буквы, могут иметь свои обьекты. Кроме класса Math
        //Math math = new Match();
        //Рефересный тип данных
       Integer intReg = 4; // за пределами pool
       Integer intReg1 = 4;
       Double doubleObject = 5.5;

       //За кадром в java
       // Integer intObject = new Integer(4); //Создали обьект. Зачеркнуто, т.к. устаревший способ ввода (дипрекейтет). Так не пишем, чтобы не занимать память.
       Double double1Object = new Double(5.5); //Создали обьект. Зачеркнуто, т.к. устаревший способ ввода (дипрекейтет). Так не пишем, чтобы не занимать память.


        //Создание стрингов разными способами
        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");


        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);
        System.out.println("---------------------");
        System.out.println(intReg == intReg1);
       // System.out.println(intReg == intObject);

        System.out.println("---------------------");
        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");

        Utils.line();
        ln();  //сделала импортирование метода, он появился на 5 строчке. Убирается лишнее слово Utils. Меньше кода будет
               //См.видео 2ч.40мин 16. -0416- Modifiers. Methods outside the class. String Pool vs String Object

        verifyString(cat1, cat2);

        //Через == сравниваем ссылки,то через метод equals сравниваем значения
        System.out.println(cat3 == cat4);
        System.out.println(cat1.equals(cat2)); // ссылки и значения равны
        System.out.println(cat1.equals(cat3)); //ссылки не равны, но значения равны

        System.out.println("---------------------");
      //  System.out.println(intReg.equals(intReg1));   // ссылки и значения равны
        //System.out.println(intReg.equals()); //ссылки не равны, но значения равны





    }
}
