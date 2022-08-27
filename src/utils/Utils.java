package utils;

public class Utils {   //Класс, в который складываются все методы не относящиеся к бизнесс процессам.
                          // Вспомогательные методы

    public static void line () {
        System.out.println("________________________");
    }

    public static void ln() { //метод для вывода пустой строки
        System.out.println();
    }


    public static int number = 3; //метод для нумерации заданий
    public static void task(){
        System.out.println("\u001B[32m" + " ------------------ " + "\u001B[34m" + " Task " + number
                + "\u001B[32m" + " ------------------ " + "\u001B[0m");
        number++;
    }


    public static String verifyInt(int a, int b) {    //проверка int
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }


    public static String verifyDouble(double a, double b) {    //проверка double
        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }


    public static String verifyString(String string1, String string2) {    //проверка String
        if ( string1.equals(string2)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }








}
