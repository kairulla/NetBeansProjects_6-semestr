/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1.pkg3.pkg1;

import java.util.ArrayList;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(3);
        i.add(new Integer(3));
        if (i.get(0) == i.get(1)) {
            System.out.println("Эта строчка не напечатается...");
        }
        if (i.get(0).equals(i.get(1))) {
            System.out.println("3 = 3");
        }
        i.add(12 + 5);
        System.out.println("Размер массива: " + i.size());
        System.out.println("Элемент массива: " + i.get(0).intValue() + "," + i.get(1) + "," + i.get(2));
    }    
}
