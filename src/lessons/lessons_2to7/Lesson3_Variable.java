package lessons.lessons_2to7;

import java.sql.SQLOutput;

public class Lesson3_Variable {

    static int a;
    static Integer A;

    public static void main (String[] args) {

      // int a;
     //  Integer A;

       a = 10;
       A = 0;
       A = null;
       A = 15;

        System.out.println(A.toString());

        System.out.println(A + A); //арифмитическое действие 30
        System.out.println(A.toString()+ A); // канкатенация 1515

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer.sum(5, 10);
        System.out.println(Integer.sum(5, 10));

        int c = 5;
        Integer.valueOf(c);

    }
}
