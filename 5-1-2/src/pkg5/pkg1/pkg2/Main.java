/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1.pkg2;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int r = 4;
        final int c = 5;        
        int m[][] = new int[r][c];
        int k; System.out.println("Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                k = (int) Math.round(Math.random() * 100);
                m[i][j] = k;
                System.out.print(String.format("%5d", m[i][j]));
            } System.out.println("");
        }
        
        int min = m[0][0], max = m[0][0], maxi = 0, maxj = 0, mini = 0, minj = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                k = m[i][j];
                if(k > max) {max = k; maxi = i; maxj = j;}
                if(k < min) {min = k; mini = i; minj = j;}
            }
        }
        
        k = m[maxi][maxj]; m[maxi][maxj] = m[mini][minj]; m[mini][minj] = k;
        
        System.out.println("New matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(String.format("%5d", m[i][j]));
            }System.out.println("");
        }
    }    
}
