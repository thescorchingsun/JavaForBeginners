package homework;

public class HW6 {

    // метод для вывода номера задачи
    public static int number = 1;

    public static void task() {
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }


    //10. ПРОВЕРИТЬ Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
    //чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

    public static void task10 (double start, double end, double step) {
        //increasing start < end, step > 0
        //decreasing start > end, step < 0
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
          for (start = start; start > end; start += step) {
            System.out.println(start);
          }
        } else {
            System.out.println("Invalid data");
        }
    }

    //11 Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля.
    // Длина последовательности = .

    //12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    // public static void printSquare1(int n) {
    //   for (int i = 1; i <= n; i++) {
    //      System.out.println(String.format("%2.Of", Math.pow(2, i)));
    //   }
    //}





     public static void main(String[] args) {

        task();
        //1. Распечатать последовательность чисел от 0 до 9 включительно.
        for (int i = 0; i < 10; i++) {
        System.out.println(i);
         }

        task();
       //2. Распечатать последовательность чисел от 10 исключительно до 0 включительно.

        for (int i = 10; i > -1; i--) {
            System.out.println(i);
        }

        task();
       //3. Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }

        task();
        //4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300) //из математики (Исключительно)
       for (int i = 326; i > 300; i--) {
           if (i % 7 ==0) {
               System.out.println(i);

           }
       }

        task();
       //5. Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1  //из математики [Включительно]
        for (double i = 12.1; i < 12.9; i += 0.1) {
            System.out.println(i);
        }

        task();
        //6.Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        task();
        //7. Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int i = 6; i < 14; i += 7) {
            System.out.println(i);
        }

        task();
        //8. Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
        // максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i ++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        task();
       /*
       9. Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть
        распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать
        словом ZERO.
       */

        for (int i = -10; i < 35; i ++) {
            if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
        }

        task();
        //10. Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
        // десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
        //happy path
        task10(10.5, 20.75, 1.29);
        System.out.println("____________________");
        //happy path
        task10(15.9, 0, -1.45);
        System.out.println("____________________");
        //negative
        task10(15, 9,0);
        System.out.println("____________________");
        task10(15.9, 9,1);
        System.out.println("____________________");
        task10(-15.9,0, -1);


        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 2 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");

        task();
        task();
        task();
        //Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
         for (int i = 1; i < 5; i++) {
             for (int j = 0; j < 10; j++) {
                 for (int k = 1; k <= i; k++) {
                     System.out.println(j);
                 }
             }
         }

         task();
         //Распечатайте последовательность чисел:
         //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5

             System.out.println(0);
             for(int y = 1; y < 6; y++) {
                 System.out.println("," + y + "," + (y * -1));
             }













     }
}