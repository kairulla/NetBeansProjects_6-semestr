/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg2;

import java.util.Scanner;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Как вас зовут: ");
        String n = sc.next();
        System.out.print("Сколько вам лет: ");
        int a = sc.nextInt();
        System.out.print("Ваш вес: ");
        float w = sc.nextFloat();
        System.out.println("Привет, " + n + "! Тебе " + a + " года, вес " + w + " кг.");
        sc.close();
    }    
}
