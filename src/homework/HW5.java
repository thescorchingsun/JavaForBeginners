package homework;

public class HW5 {

    // метод для вывода номера задачи
    public static int number = 1;

    public static void task() {
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }

    //1. Метод для тестирования задач

    public static void verifyEquals(int expectedResult, int actualResult) { //для числовых значений
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }


    public static void verifyEquals(Double expectedResult, Double actualResult) { //для точных числовых значений (через точку)
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(String expectedResult, String actualResult) { //для текстовых данных
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }


    //2.Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    public static String returnDayOfWeek(int a) {
        String day = "";
        if (a >= 1 && a <= 7) {
            if (a == 1) {
                day = "Понедельник";
            } else if (a == 2) {
                day = "Вторник";
            } else if (a == 3) {
                day = "Среда";
            } else if (a == 4) {
                day = "Четверг";
            } else if (a == 5) {
                day = "Пятница";
            } else if (a == 6) {
                day = "Суббота";
            } else if (a == 7) {
                day = "Воскресенье";
            }
        } else {
            day = "Bad Data";
        }
        return day;
    }

    //3. Given three values x,y,z determine the largest value and assign this value to the variable largest
    //По трем значениям x, y, z определите наибольшее значение и присвойте это значение самой большой переменной.
    // 1 вариант ручной
    public static int returnMaxOfThree(int x, int y, int z) {
        int max;

        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max > z) {
            return max;
        } else {
            max = z;
            return max;
        }
    }

    // 2 вариант с помощью метода Math
    public static Integer returnMaxOfThreeMathMethod(int x, int y, int z) {
        Integer max2 = (Math.max(Math.max(x, y), z));
        return max2;
    }


    //4. Using nested if statements, write a fragment of code that prints the smallest value contained
    // in the variables a, b, c
    //Используя вложенные операторы if, напишите фрагмент кода, который выводит наименьшее значение, содержащееся
    // в переменных a, b, c.

    //1 вариант ручной
    public static int returnMinOfThree(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {
            return min;
        } else {
            min = c;
            return min;
        }
    }

    //2 вариант метод Math
    public static int returnMinOfThreeMathMethod(int a, int b, int c) {
        Integer min = (Math.min(Math.min(a, b), c));
        return min;
    }

    //5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота
    public static double averageTemp(double s, double d, double f, double g, double h) {
        return (s + d + f + g + h) / 5;
    }


    //6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
    public static void returnText(double price) { //10.75
        int rubles = (int) price;                   //10
        double penny = price * 100 - rubles * 100; //1075 - 1000
        int penny1 = (int) penny;                //750
        System.out.println(rubles + " руб " + penny1 + " коп ");
    }

    //7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
    public static void returnText2(double wight) { //10.75
        int kg = (int) wight;                       //10
        double gram = wight - kg;                 //0.75
        double gram1 = gram * 1000;               //750.0
        int gram2 = (int) gram1;                   //750
        System.out.println(kg + " кг " + gram2 + " гр ");
    }

    //8. Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static double returnSum(double price, double weight) {
        return price * weight;
    }

        /*
        //9.Написать метод, который принимает на вход необходимые параметры, и печатает чек.
            Например:

        Яблоки
        Цена за 1 кг			50 руб 13 коп
        Количество товара	      3 кг 400 гр
        _______________________________________
        Сумма к оплате		170 руб 44 коп
         */

    public static String purchase(double price, double weight) {
        double count = price * weight;
        return String.format("%.2f", count);
    }

    public static String moneyWithCents(double money) {
        String result;
        if (money >= 0) {
            double whole = money;
            whole = (int) whole;
            double cents = (money - whole) * 100;
            result = (int) money + " руб " + (int) cents + " коп ";
        } else {
            result = "Error";
        }
        return result;
    }

    //Вывод чека для килограммов
    public static void ReceiptKg(String product, double price1, double weight) {
        String result;
        double payResult = Double.parseDouble(purchase(price1, weight));
        String finelPayResult = moneyWithCents(payResult);

        result = product;
        System.out.println("---------------------------------");
        System.out.println(product);
        System.out.println("| Цена за 1 кг " + moneyWithCents(price1) + "|" + "\n");
        System.out.println("| Колличество товара             |" + "\n");
        System.out.println("| Сумма к оплате               " + finelPayResult + "|" + "\n");
        System.out.println("---------------------------------");
    }

    //10.Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
    // и возвращает заработную плату в месяц.

    public static String countSalary(double worksDayHours, double priceOneHour) {
        int salary = ((int) (worksDayHours * priceOneHour * 21)); //2314
        double salary1 = (worksDayHours * priceOneHour * 21);    //2314.83
        int realSalary = (int) salary;
        int coins = (int) ((salary1 - salary) * 100);

        return (salary + " руб " + coins + " коп ");
    }

    //11.Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
    //Например:
    //
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //
    //Распечатать ведомость для нескольких сотрудников, например:
    //
    //Март 2022
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //Серебряков Иван Петрович 		128059 руб 00 коп

    //12. Распечатать схему
    public static String checkX(int x) {
        if (x < 0) {
            return x + " is negative ";
        } else if (x > 0) {
            return x + " is positive ";
        } else {
            return x + " is zero ";
        }
    }

            /*
        13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
        Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
        снова считается сумма всех чисел.
        Например:
        год рождения 1999
        1 + 9 + 9 + 9 = 28
        2 + 8 = 10
        1 + 0 = 1
        Счастливое число - 1
           */

    public static int findLuckyNumber(int n) {
        int sum = (n % 10) + (n / 10) % 10 + (n / 100);
        if (sum > 9) {
            sum = (sum % 10) + (sum / 10);
            if (sum > 9) {
                sum = (sum % 10) + (sum / 10);
            }
        }
        System.out.println("Your lucky number is " + sum);
        return sum;
    }

    //14.  а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    //
    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
    //
    // *Медиана - это серединное число в отсортированном наборе чисел.
    //1, 3, 9 → медиана 3
    //12, 13, 101 → медиана 13
    //14, 2, 12 → медиана 12

    public static void count1(int a, int b, int c) {
      int midle = (a + b + c) / 3;
      int mediana = Math.max((Math.min(a,b)), Math.min(Math.max(a,b),c));
      double dif = midle - mediana;
      if (dif > 2) {
          System.out.println("Среднее значение" + midle + " отличается от медианы " + mediana + " на " + dif);
      } else {
          System.out.println("Среднее значение = " + midle + " медиана = " + mediana );
      }
    }

    //15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static String customer(double a) {
        int b = (int) Math.floor(a);
        String sum = b + " руб " + (b / 100) + "0 коп ";
        return sum;
    }

    //16. Посчитать с помощью методов класса Math
    //a = 3
    //b = 4
    //c = 20
    //
    //см.картинку
    //Вернуть значение с округлением в большую сторону.

    public static double count(int a,int b, int c) {
        double one = Math.sqrt((a * b + c) * (Math.pow(a, b)));
        double round = Math.ceil(one / Math.PI);
        return round;
    }

    //17.1 Write the java statement that assigns 1 to x if y is greater than 0
    //Напишите оператор Java, который присваивает 1 x, если y больше 0

    public static void assignOne(int y) {
        int x;
        if (y > 0) {
            x = 1;
            System.out.println(" 1)" + x);
        } else {
            System.out.println(" 1)" + y + "меньше 0");
        }
    }

    //17.2 Suppose that score is a variable of type double. Write the java statement that increases the score by 5 marks
    // if score is between 80 and 90
    //Предположим, что score — это переменная типа double.
    //Напишите оператор Java, который увеличивает оценку на 5 баллов, если оценка находится в диапазоне от 80 до 90.

    public static double score(double x) {
        if (x >= 80 && x <= 90) {
            x = x + 5;
        }
        return x;
    }

    //17.3 Rewrite in Java the following statement using the NOT (!) operator:
    // item = ! ((i < 10) | | (v >= 50))

    public static boolean assignItem(int i, int v){
        boolean item = (i >= 10) && (v < 50);
        return (item);
    }


    /*
    18. Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
    Метод возвращает математически округленное целое значение и выводит на экран:
    “Число … в степени … = …”

    Число может быть в пределах от 0 до 1 исключительно.
    Степень числа может быть от 0 до 10 включительно
    */

    public static double getPow(int pow){

        if(pow >= 0 && pow <= 10){
            return Math.pow(Math.random(), pow);
        } else {
            System.out.println("Error");
            return Double.MIN_VALUE;
        }
    }


    //19. Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
    public static double getRandom(){
        int num1 = (int)(Math.random() * 99) + 1;
    System.out.println(num1);
    return num1;
    }







    public static void main(String[] args) {      //ГЛАВНЫЙ МЕТОД, С КОТОРОГО НАЧИНАЕТСЯ ПРОГРАММА. ДО НЕГО ПИШУТСЯ
                                                  // ДРУГИЕ МЕТОДЫ, КОТОРЫЕ ВЫЗЫВАЮТСЯ В ПРОГРАМММЕ НИЖЕ
        task(); //1
        System.out.println("Доделать тест к задаче");

        task(); //2
        System.out.println(returnDayOfWeek(5));
        System.out.println("Доделать тест к задаче");

        task(); //3
        System.out.println(returnMaxOfThree(5, 10, 15));           //ручной вариант
        verifyEquals(returnMaxOfThree(5, 10, 15), 15);     //тест ручного варианта

        System.out.println(returnMaxOfThreeMathMethod(5, 10, 15));       // с методом math
        verifyEquals(returnMaxOfThreeMathMethod(5, 10, 15), 5); // тест метода math

        task(); //4
        System.out.println(returnMinOfThree(-5, 100, 0));        //ручной вариант
        verifyEquals(returnMinOfThree(-5, 100, 0), -5); //тест

        System.out.println(returnMinOfThreeMathMethod(-5, 100, 0)); // с методом math
        verifyEquals(returnMinOfThreeMathMethod(-5, 100, 0), -5); //тест

        task(); //5
        System.out.println(averageTemp(39.5, 38.33, 37.9, 37.59, 39.7));
        verifyEquals(averageTemp(39.5, 38.33, 37.9, 37.59, 39.7), 40.5); //тест

        task(); //6
        returnText(10.75);

        task(); //7
        returnText2(10.75);

        task(); //8
        System.out.println(returnSum(4.2, 5.5) + " руб ");

        task(); //9
        String product = "Яблоко";
        double price1 = 50.14;
        double weight1 = 53;
        System.out.println("Пропустила из-за сложности");

        task(); //10
        System.out.println(countSalary(8, 300));

        task(); //11
        System.out.println("Пропустила");

        task(); //12
        System.out.println(checkX(5));

        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 2 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");

        task(); //13
        findLuckyNumber(1990);
        int expectedResult = 2;
        verifyEquals(expectedResult, findLuckyNumber(2020));

        task(); //14
        count1(1,2,3);

        task(); //15
        System.out.println(customer(15.10));

        task(); //16
        System.out.println(count(3,4, 20));

        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 3 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");

        task(); //17.1
        assignOne(7);

         //17.2
        System.out.println(" 2)" + score(81));

        //17.3

        //17.4 Write a java statement that prints true if x is an odd number and positive
        //Напишите оператор Java, который печатает true, если x — нечетное и положительное число.

        int x = 4;
        if(x % 2 != 0 && x >= 0) {
            System.out.println(" 4)true");
        } else {
            System.out.println(" 4)false");
        }

         //17.5 Write a java statement that prints true if  both x and y are positive number
        //Напишите оператор Java, который печатает true, если и x, и y являются положительными числами.
        int x1 = 4;
        int y = -6;

        if(x1 >= 0 && y >= 0) {
            System.out.println("\u001B[32m" + " 5)true" + "\u001B[0m");
        } else {
            System.out.println("\u001B[35m" + " 5)false" + "\u001B[0m");
        }

         //17.6 Write a java statement that prints true if x and y have the same sign (-/+)
        //Напишите оператор Java, который печатает true, если x и y имеют одинаковый знак (-/+)

        if (x1 >= 0 && y >= 0 || x1 < 0 && y < 0) {
            System.out.println("\u001B[32m" + " 6)true" + "\u001B[0m");
        } else {
            System.out.println("\u001B[35m" + " 6)false" + "\u001B[0m");
        }

        task(); //18
        System.out.println(getPow(5));

        task(); //19
        System.out.println(getRandom());



    }

}

