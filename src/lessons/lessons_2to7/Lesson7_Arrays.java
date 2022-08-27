package lessons.lessons_2to7;

public class Lesson7_Arrays {
    public static void main(String[] args){

        //Обьект типа String со значением "Рыжик"
        String catName = "Рыжик";

        //Ячейка памяти типа String-массив
        String[] catsNames;

        //Обьект типа String-массив, состоящий из 8 ячеек
        catsNames = new String[8];
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        catsNames[6] = "Рыжик";

        //Обьект типа int-массив, состоящий из 8 ячеек
        int[] catsAges = new int[8];


        System.out.println(catName);
        System.out.println(catsNames);
        System.out.println(catsNames);
        System.out.println(catsAges);

        System.out.println(catsNames[0]);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);

        System.out.println(catsNames[4]);

        System.out.println("_____________________");
       for (int i = 0; i <= 7; i++ ) {
           System.out.println(catsNames[i]);
       }


        System.out.println("_____________________");
       //Распечатались только Рыжики
       for (int i = 0; i < 8; i++) {
           if (catsNames[i] == "Рыжик") {
               System.out.println(catsNames[i]);
           }
       }


        System.out.println("_____________________");
        //Найти номера коробок, где сидят Рыжики
        // i++ перебор всех коробок, i+=2 перебор коробок через одну
        for (int i = 0; i < 8; i++) {
            if (catsNames[i] == "Рыжик"){
                System.out.println(i);
            }

        }







    }
}
