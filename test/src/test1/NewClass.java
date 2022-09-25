/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author fedora
 */
public class NewClass {

    public static double a_Infinite = 0.0, b_NaN = 0.0, c = 0.0;
    public static double x1 = 0.0, x2 = 0.0, x3 = 0.0, x4 = 0.0;

    public static void main(String[] args) {
        a_Infinite = Double.POSITIVE_INFINITY;
        b_NaN = Double.NaN;
        x1 = b_NaN;
//        x2 = a_Infinite;
//        x3 = b_NaN;
//        x4 = a_Infinite;
        System.out.println(b_NaN);
        System.out.println(Calc());
    }

    public static boolean Calc() {
        if (!(Double.isNaN(x1)) && (!Double.isInfinite(x2)) && (!(Double.isNaN(x3)) && (!Double.isInfinite(x4)))) {
                return true;
            } else {
                return false;
            }
    }
}
