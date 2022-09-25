/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1.pkg1;

import java.util.Arrays;

/**
 *
 * @author fedora
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[], b[];
        a = new int[10];
        b = new int[]{1, 2, 3, 4};
        String s[] = new String[]{"Hello", " world", "!!!"};
        Arrays.fill(a, 0);
        a[0] = 20; a[1] = 10; a[2] = 5; a[3] = 33;
        Arrays.fill(a, 5, 10, -1);
        Arrays.sort(a);
        b[3] = b[1] * 0b11 + b[2] * 0x2;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s));
        
        System.out.println("Количество элементов в массиве \"a\": " + a.length);
        System.out.println("Количество элементов в массиве \"b\": " + b.length);
        System.out.println("Количество элементов в массиве \"s\": " + s.length);
        System.out.println(s[0] + s[1]);
    }
    
}
