/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg3;

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
        double a, b, c;
        double x1, x2;
        double d;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Решение квадратного уравнения");
            System.out.print("Введите а = ");
            a = sc.nextDouble();
            System.out.print("Введите b = ");
            b = sc.nextDouble();
            System.out.print("Введите c = ");
            c = sc.nextDouble();
            d = (b * b) - 4 * a * c;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) && (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                System.out.format("x1=%.3f%nx2=%.3f%n", x1, x2);
            } else {
                System.out.println("Нет решения!");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Неверные входные данные!");
        }
    }
}
