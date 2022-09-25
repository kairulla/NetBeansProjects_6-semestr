package oop;

import java.util.Scanner;

public class Launch1 {
    
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения");
        System.out.print("Введите a="); a = sc.nextDouble();
        System.out.print("Введите b="); b = sc.nextDouble();
        System.out.print("Введите c="); c = sc.nextDouble();
        
        SolverQuEq eq = new SolverQuEq(a, b, c);
        
        if (eq.getSolutionQuEq() != null) {
            System.out.println(eq);
        } else {
            System.out.println("Нет решения!");
        }
        try {        
        } catch (Exception e) {
        }
    }
    
}
