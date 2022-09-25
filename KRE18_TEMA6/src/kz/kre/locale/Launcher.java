package kz.kre.locale;

import java.util.Scanner;

public class Launcher {

    //Сделать консольную программу, взаимодействующуй с пользователем, на 5 языках. 
    //В программе предумотреть 3 вопроса и 3 ответа на них для всех языков.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = new String();
        int test1 = 2;
        int test2 = 0;
        name = sc.nextLine();
        System.out.println("Привет " + name);

    }

}
