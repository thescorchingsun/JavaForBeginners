package homework;

import java.util.Arrays;

public class HW7 {

    // метод для вывода номера задачи
    public static int number = 1;

    public static void task() {
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }


    // метод для вывода раздела домашки
    public static int number1 = 1;

    public static void part() {
    System.out.println("\u001B[31m"+" ------------------ "+"\u001B[34m"+" Part " + number1 +
            "\u001B[31m"+" ------------------ "+"\u001B[0m");
    number1++;
    }


    public static void line() {
        System.out.println("\u001B[32m" + "----------------------" + "\u001B[0m");
    }




    public static void main (String[] args) {

        part();
        task();
        //1.Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        String[] catsNames;
        catsNames = new String[8];
        catsNames[0] = "Серый";
        catsNames[1] = "Черныш";
        catsNames[2] = "Усатый";
        catsNames[3] = "Пушистик";
        catsNames[4] = "Полосатик";
        catsNames[5] = "Малыш";
        catsNames[6] = "Крепыш";
        catsNames[7] = "Пончик";
        System.out.println(Arrays.toString(catsNames));

        task();
        //2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”, а значение элемента с индексом 1 на “Черныш”.
        String[] catsNames1;
        catsNames1 = new String[8];
        catsNames1[0] = "Серый";
        catsNames1[1] = "Черныш";
        catsNames1[2] = "Усатый";
        catsNames1[3] = "Пушистик";
        catsNames1[4] = "Рыжик";
        catsNames1[5] = "Малыш";
        catsNames1[6] = "Крепыш";
        catsNames1[7] = "Пончик";
        System.out.println(Arrays.toString(catsNames1));

        task();
        //3. Создать массив catsColors и заполнить его значениями.
        String[] catsColors;
        catsColors = new String[8];
        catsColors[0] = "Серый";
        catsColors[1] = "Черный";
        catsColors[2] = "Серый";
        catsColors[3] = "Коричневый";
        catsColors[4] = "Рыжий";
        catsColors[5] = "Серый";
        catsColors[6] = "Рыжий";
        catsColors[7] = "Серый";
        System.out.println(Arrays.toString(catsColors));

        task();
        //4.Создать массив catsAges и заполнить его любыми значениями.
        int[] catsAges = {1,3,5,2,10,7,3,1};
        System.out.println(Arrays.toString(catsAges));


        task();
        //5. Создать массив isCatRed и заполнить его соответствующими значениями

        Boolean[] isCatRed1 = {false, false, false, false, true, false, false, false};
        boolean[] isCatRed2 = new boolean[catsColors.length];
        Boolean[] isCatRed = new Boolean[catsColors.length];

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Рыжий")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
        }


        task();
        //6. Распечатать для массивов catsNames и catsColors:

        //а) имя кота в коробке с номером 6
        System.out.println(catsNames[6]);

        line();
        //б) имена котов из коробок с четными индексами
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " " + catsNames[i]);
            }
        }

        line();
        //в) имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " " + catsNames[i]);
            }
        }

        line();
        //г) цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " " + catsColors[i]);
            }
        }

        line();
        //д) цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " " + catsColors[i]);
            }
        }


        task();
        //7.Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < 8; i++) {
            if (catsColors[i] == "Серый") {
                System.out.println("Накорми кота!");
            }
        }


        task();
       //8. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] <= 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }


        task();
        //9.Для кота в последней коробке распечатать имя, цвет, возраст
        for (int i = 0; i < catsNames.length; i++) {
             if (i == 7) {
                 System.out.println("Имя " + catsNames[i] + ", Цвет " + catsColors[i] + ", Возраст " + catsAges[i]);
             }
        }

        task();
       //10. Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < 8; i++) {
            if (catsAges[i] <= 2) {
                System.out.println(catsNames[i]);
            }
        }


        task();
        //11.Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
            for (int i = 0; i < isCatRed.length; i++) {
                if(isCatRed[i] == true) {
                    System.out.println("Накорми кота!Его зовут " + catsNames[i]);
                }
            }
        }


        part();
        task();
        //12.Распечатать средний возраст котов из массива catsAges
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {   //CatsAges.length - сколько всего котов в массиве
            sum = sum + catsAges[i];
        }
        System.out.println(sum / catsAges.length);

        task();
        //13.Распечатать возраст самого молодого кота
        int min = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        task();
        //14. Распечатать возраст самого старого кота
        int max = catsAges[0];     ////CatsAges.length - сколько всего котов в массиве
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

        task();
        //15. Распечатать количество серых котов
int greyCat = 0;
for (int i = 0; i < catsColors.length; i++){
    if(catsColors[i].equals("Серый")){
        greyCat++;
    }
}
        System.out.println("Количество серых котов = " + greyCat);








    }
}
