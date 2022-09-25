/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.pkg1.pkg1.pkg1;

import java.util.Scanner;

/**
 *
 * @author fedora
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        QuEq eq = new QuEq();
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Решение квадратного уравнения");
            System.out.print("Введите а = "); a = sc.nextDouble();
            System.out.print("Введите b = "); b = sc.nextDouble();
            System.out.print("Введите c = "); c = sc.nextDouble();
            
            if (eq.Calc(a, b, c) == true) {
                System.out.format("x1 = %.3f%nx2 = %.3f%n", eq.x1, eq.x2);
            } else { System.out.println("Нет решения!"); }
        } catch (Exception e) {}
    }
    
}

class QuEq {

    private double a, b, c;
    public double x1, x2;
    private double d;
    
    QuEq() { a = 0; b = 0; c = 0; d = 0; x1 = 0; x2 = 0; }
    
    public boolean Calc(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
        d = (b * b) - 4 * a * c;
        
        try {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) && (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                return true;
            } else { return false; }
        } catch (Exception e) { return false; }
    }

}
