package homework;

public class HW4 {

    //метод для вывода номера задачи
    public static int number = 3;

    public static void task() {
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }

    //метод для задачи номер 14
    public static int devResult;
    public static int devBack;
    public static int count1;
    public static int count2;

    public static void makeMath(int firstNum, int secondNum){
        devResult = firstNum / secondNum;
        devBack = firstNum % secondNum;
        System.out.println("Результат деления " + firstNum + " на " + secondNum + " = " + devResult +
                " , а остаток от деления = " + devBack);
    }

    //метод для задачи номер 15
    public static int devAppleOnStudents;
    public static int remainderAppleStudent;

    public static void appleForStudents(int apple, int student){ //Метод appleForStudents принимает на вход
                                                                 // значения int apple и int student
        devAppleOnStudents = apple / student;
        remainderAppleStudent = apple % student;
        System.out.println("Если " + apple + " яблок(а) поделить на " + student + " учеников, то каждый ученик получит по"
                + devAppleOnStudents + " яблок(a), и " + remainderAppleStudent + " яблок(а) останется учителю.");
    }

    //метод для задачи номер 17. Цельсий х 1,8 + 32 = Фаренгейт
    public static double tempFarengeit;

    public static void tempCelsius (double Celsius ){
        tempFarengeit = Celsius * 1.8 + 32;
        System.out.println("Температура в Цельсиях " + Celsius + " = " + " Температуре по Фарингейту " + tempFarengeit);
    }

    //метод для задачи номер 18
    //Создать метод, который примет на вход параметр i и распечатает таблицу: i в таблице возведено в квадрат

    public static int multI;
    public static void makeTable(int i){
        multI = i * i;
        System.out.println("_______________________");
        System.out.println("|" + i + " ^ 2 | Значение " + multI + "|");
        System.out.println("_______________________");
    }

   //метод для задачи номер 19
    //метод для проверки чисел
    public static void ResultFailPassNumber (int expectResult, int actualResult){
        if (expectResult == actualResult){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    //метод для проверки текста
    public static void ResultFailPassText (String expectResult, String actualResult){
        if (expectResult.equals(actualResult)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }





    public static void main(String[] args) {      //ГЛАВНЫЙ МЕТОД, С КОТОРОГО НАЧИНАЕТСЯ ПРОГРАММА. ДО НЕГО ПИШУТСЯ
                                                  // ДРУГИЕ МЕТОДЫ, КОТОРЫЕ ВЫЗЫВАЮТСЯ В ПРОГРАМММЕ НИЖЕ
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 1 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");
        task();
        //3. Записать в виде кода следующие логические выражения:

        //1 (2 = 2) И (7 = 7);
        int a1 = 2;
        int a2 = 7;
        System.out.println("1) " + (a1 == a1 && a2 == a2));

        //2 Не(15 < 3);
        int a3 = 15;
        int a4 = 3;
        System.out.println("2) " + !(a3 < a4));

        //3 ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        String a5 = "Сосна";
        String a6 = "Дуб";
        String a7 = "Вишня";
        String a8 = "Клён";
        System.out.println("3) " + (a5.equals(a6) || a7.equals(a8)));

        //4  Не("Сосна" = "Дуб");
        System.out.println("4) " + !(a5.equals(a6)));

        //5 (Не(15 < 3)) И (10 > 20);
        System.out.println("5) " + (!(15 < 3) && (10 > 20)));

        //6 ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");

        //7 (6/2 = 3) ИЛИ (7*5 = 20).
        int d1 = 6;
        int d2 = 2;
        int d3 = 3;
        int d4 = 7;
        int d5 = 5;
        int d6 = 20;

        int d7 = d1 / d2;
        int d8 = d4 * d5;

        System.out.println("7) " + (d7 == d3 || d8 == d6));

        task();

        //4. Записать в виде кода:
        //1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
        String con1 = "В минуте 60 секунд";               //задаю константу
        String con2 = "Работающие часы показывают время";

        String q = "В минуте 70 секунд";
        String q1 = "Работающие часы показывают время";

        System.out.println("1) " + (q.equals(con1) || q1.equals(con2)));

        //2) !(28 > 7) И !(300/5 = 60);
        int ab = 300 / 5;

        System.out.println("2) " + (!(28 > 7) && !(ab == 60)));

        //3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
        String tv = "Телевизор";
        String glass = "Стекло";

        if (tv == "электрический прибор" && glass == "дерево") {
            System.out.println("3) " + (tv == "электрический прибор" && glass == "дерево"));
        } else {
            System.out.println("3) " + (tv == "электрический прибор" && glass == "дерево"));
        }

        //4) Не((300 < 100))  → ("Жажду можно утолить водой");
        if (!(300 < 100)) {
            System.out.println("4) " + "\u001B[32m" + "Жажду можно утолить водой" + "\u001B[0m");
        }

        //5) (75 < 81) → (88 = 88)
        if (75 < 81) {
            System.out.println("5) " + "88 = 88");
        }

        task();

        //5. Записать в виде кода следующие выражения:
        // а) Андрей старше Светы. Наташа старше Светы.
        int A = 20;
        int S = 15;
        int N = 18;

        if (A > S && N > S) {
            System.out.println("a) " + "Андрей старше Светы. Наташа старше Светы.");
        } else {
            System.out.println("a)" + false);
        }

        // б) На полке стоят учебники, а на столе лежат справочники. Не точное решение задачи
        String shelf = "учебники";
        String uchebniki = "стоят";
        String table = "справочники";
        String spravochnik = "лежат";

        if (shelf.equals("учебники") && uchebniki.equals("стоят")) {
            System.out.println("б) " + ("На полке стоят учебники"));
        }
        if (table.equals("справочники") && spravochnik.equals("лежат")) {
            System.out.println("б) " + "На столе лежат справочники");
        } else {
            System.out.println(false);
        }

        // в) БОльшая часть детей — девочки. Остальные - мальчики.
        int pupils = 100;
        int girls = 70;
        int boys = 30;
        if (boys < girls) {
            System.out.println("в) " + "БОльшая часть детей — девочки. Остальные - мальчики.");
        } else {
            System.out.println("в) " + false);
        }

        task();

        //6. “Водительские права можно получить, только когда исполнится 16 лет.”
        int limitage = 16;
        int age = 12;
        if (limitage > age) {
            System.out.println("Если возраст меньше 16 лет, то получить права нельзя");
        } else {
            System.out.println("Если возраст равен или больше 16 лет, то получить права можно");
        }

        task();
        //7 ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
        String action1 = "едет в автобусе";
        String action2 = "читает книгу";
        String action3 = "смотрит в окно";
        //actionPeter = (!(action1) && (action2 || !action3));

        task();
        //8 “Если с другом ты, это хорошо, а когда наоборот - плохо”
        String f = "friends";
        if ("friends".equals(f)) {
            System.out.println("Have friends - good");
        } else
            System.out.println("Without friends - bad");

        task();
        //9 Записать выражения в виде условий if-else:

        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age18 = 18;
        int age15 = 15;
        if (age18 > age15) {
            System.out.println("a) " + "Если тебе больше 18 лет, то ты взрослый");
        } else {
            System.out.println("Если меньше 18 лет, то ты ребенок");
        }

        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String land = "Сухая"; //"Мокрая"

        if (land == "Сухая") {
            System.out.println("б) " + "Если земля сухая, значит, нет дождя");
        } else if (land == "Мокрая") {
            System.out.println("б) " + "Если земля мокрая, то идет дождь");
        } else {
            System.out.println("б) " + "Иначе идет снег");
        }

        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String sky = "тучи";
        if (sky == "тучи") {
            System.out.println("\u001B[36m" + "в) " + "Если на небе тучи, то значит идет дождь" + "\u001B[0m");
        } else {
            System.out.println("\u001B[36m" + "в) " + "Если на небе нет тучь, то значит идет слепой дождь" + "\u001B[0m");
        }

        //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        // Иначе вчера был не четверг, а завтра - не воскресенье
        String dayOfWeak = "Суббота"; // Пятница
        if (dayOfWeak == "Суббота") {
            System.out.println("г) " + "Если сегодня суббота, значит, завтра воскресенье");
        } else if (dayOfWeak == "Пятница") {
            System.out.println("г) " + "Если сегодня пятница, значит, вчера был четверг");
        } else {
            System.out.println("г) " + "Иначе вчера был не четверг, а завтра - не воскресенье");
        }

        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String Рак = "Свистнул"; //Не свистнул
        if (Рак == "Свистнул") {
            System.out.println("д) " + "\u001B[30m" + "Если на горе свистнул рак, значит, прошла вечность" + "\u001B[0m");
        } else if (Рак == "Не свистнул") {
            System.out.println("д) " + "\u001B[30m" + "Если на горе рак не свистнул, значит, ждать дальше" + "\u001B[0m");
        }

        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        int age1 = 18;
        String End = "Закончил школу";
        if ((age1 == 18) || (End == "Закончил школу")) {
            System.out.println("е) " + "Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями");
        } else {
            System.out.println("Если тебе нет 18 или ты не закончил школу, то ты должен жить с родителями");
        }


        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 2 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");
        task();
        /*
        10. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        Выведите результат работы алгоритма на печать.
        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        */
        int number = 6;
        if (number % 2 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number * number);
        }

        task();
        /*
        11. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        Голосовать можно с 18 лет
        Машину можно водить с 16 лет
        В школу можно идти с 5 лет
        Выведите результат работы алгоритма на печать.
        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        */
        int h = 16;
        if (h >= 18) {
            System.out.println("Голосовать можно");
        } else {
            System.out.println("Голосовать нельзя");
        }
        if (h >= 16) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Машину водить нельзя");
        }
        if ((h >= 5) && (h <= 18)) {
            System.out.println("Можно идти в школу");
        } else {
            System.out.println("В школу идти нельзя");
        }

        System.out.println("Блок схема Sequential");

        task();
        /*
        12. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        5 - выдать похвальную грамоту и перевести в следующий класс
        4 - перевести в следующий класс
        3 - дать задание на лето и перевести в следующий класс
        2 - вызвать родителей и оставить в текущем классе на второй год
        Выведите результат работы алгоритма на печать.
        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        */
        int notice = 3;
        if (notice > 5 || notice < 2) {
            System.out.println("\u001B[32m" + "fail" + "\u001B[0m");
        } else if (notice == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в следующий класс");
        } else if (notice == 4) {
            System.out.println("Перевести в следующий класс");
        } else if (notice == 3) {
            System.out.println("Дать задание на лето и перевести в следующий класс");
        } else if (notice == 2) {
            System.out.println("Вызвать родителей и оставить в текущем классе на второй год");
        }

        task();
        /*
        13. Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые делятся
        на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка. Программа умножает числа, которые делятся
         на 2 без остатка, но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
        Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
         */
        int n1 = 9;
        int n2 = 12;
        int sum;
        int sub;
        int mult;

        if (n1 % 3 == 0 && n2 % 3 == 0) {
            sum = n1 + n2;
            System.out.println(sum);
        } else if (n1 % 5 == 0 && n2 % 5 == 0) {
            sub = n1 - n2;
            System.out.println(sub);
        } else if (n1 % 2 == 0 && n2 % 2 == 0) {
            if (n1 >= 0 && n2 >= 0) {
                mult = n1 * n2;
                System.out.println(mult);
            } else {
                mult = n1 * n2 * (-1);
                System.out.println(mult);
            }
        } else {
            System.out.println("Ошибка: невозможно пооизвести действие");
        }

        task();
        /*
        14. Распечатать следующие выражения, используя метод и параметры:
        Результат деления k на l = …, а остаток от деления  = …
        Результат деления k на m = …, а остаток от деления  = …
        Результат деления l на m = …, а остаток от деления  = …
        Результат деления m на k = …, а остаток от деления  = …
        И так далее все возможные варианты.
        Сравнить код из HW2 с кодом из HW4. Что для вас легче?
        */

        int k = 3;
        int l = 5;
        int m = 10;

        makeMath(k, k);
        makeMath(k, l);
        makeMath(k, m);

        makeMath(l, k);
        makeMath(l, l);
        makeMath(l, m);

        makeMath(m, k);
        makeMath(m, l);
        makeMath(m, m);

        task();
        /*
        15. Выполнить задание 18 из HW2 с помощью метода и параметров:

        а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
        Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        Распечатать это же выражение со значениями 100 и 21.
         */

        int apple = 40;
        int student = 6;
        appleForStudents(apple, student);

        int apple2 = 100;
        int student2 = 21;
        appleForStudents(apple2, student2);

        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Part 3 " +
                "\u001B[32m" + " ------------------ " + "\u001B[0m");

        task();
        //16. Пропустила, так как очень сложное задание
        System.out.println("Пропустила из-за сложности");

        task();
        //17.Напишите метод, который примет на вход параметр температуры в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.

        tempCelsius (36.6);


        task();
        //a) Создать метод, который примет на вход параметр i и распечатает таблицу: i в таблице возведено в квадрат
        makeTable(10);

        //б) поменять значение i и распечатать таблицу с новым значением i
        makeTable(5);

        task();
        //19.Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
        // Тестовые данные - 2, 5, 0.
        /*
        10. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        Выведите результат работы алгоритма на печать.
        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        */
        int number2 = 5;
        int expectedResult = 4;

        if (number2 % 2 == 0) {
           number2 = number2 * 2;
        } else {
           number2 = number2 * number2;
        }
        System.out.println("number2 = " + number2);

        System.out.println("----------------------TEST---------------------");

        if (expectedResult == number2) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }


    }
}



