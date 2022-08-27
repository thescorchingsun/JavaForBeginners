package homework;

public class Notes {
    public static void main (String[] args) {

    /*
    main - public static void main (String[] args){}
    sout  - System.out.println();
    Double.valueOf(x) - Double присваивается какому-то значению
    Math.round()   - округление
    Double.compare(x,y); сравнение или вычитание двух переменных
    Integer.sum(a1.intValue(),b1.intValue()))  - С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float
    a5.equals(a6) - a5 сравнить с a6
    || - или
    && - И
    == - сравнение
    → - условие одно из другого
    //i = i + 2 абсолютнно одинаковае записи i += 2
    // static - всегда за пределами main

    Shift + F6 (Refactor)- изменить метод, тогда и везде поменятся
    Alt + F7 (Find Usages) - выбор метода и строчки когда с его использованием
    Ctrl + F7 - поиск
    Ctrl + Shift + F10 - запуск кода
    Ctrl + G - переход к строке


    "\u001B[32m" - окрашивание текста
    "\u001B[0m" - закрывает текст, который надо окрасить
    */


        //   Коды для печати текста разными цветами
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";



       // МЕТОДЫ

   /*
  МЕТОД ДЛЯ НУМЕРАЦИИ ЗАДАНИЙ
   package homework;

public class HW4 {
    public static int number = 3;

    public static void task(){
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
            + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }

    public static void main (String[] args) {

        task();
    */

/*
МЕТОД ДЛЯ СОЗДАНИЯ ТАБЛИЧКИ. ВНУТРИ СЧИТАЕТСЯ ЗНАЧЕНИЕ
public static int multI;
    public static void makeTable(int i){
        multI = i * i;
        System.out.println("_______________________");
        System.out.println("|" + i + " ^ 2 | Значение " + multI + "|");
        System.out.println("_______________________");
    }

    makeTable(int 50);
 */

/*
МЕТОД ДЛЯ ПОДСЧЕТА И ПЕЧАТИ ТЕКСТА
public static int devAppleOnStudents;
    public static int remainderAppleStudent;

    public static void appleForStudents(int apple, int student){ //Метод appleForStudents принимает на вход
                                                                 // значения int apple и int student
        devAppleOnStudents = apple / student;
        remainderAppleStudent = apple % student;
        System.out.println("Если " + apple + " яблок(а) поделить на " + student + " учеников, то каждый ученик получит по"
                + devAppleOnStudents + " яблок(a), и " + remainderAppleStudent + " яблок(а) останется учителю.");

                appleForStudents(int 30, int 5);




       /*  Вложенный цикл for
      Стараемся придумывать решения ТОЛЬКО с одним for
        for (;;) {
            for (;;) {

        }
        }
       */







    }
}
